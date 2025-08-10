package regex2english;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;

import picocli.CommandLine;
import picocli.CommandLine.*;
import picocli.codegen.docgen.manpage.*;

import hu.webarticum.treeprinter.*;
import hu.webarticum.treeprinter.decorator.BorderTreeNodeDecorator;
import hu.webarticum.treeprinter.printer.*;
import hu.webarticum.treeprinter.printer.listing.ListingTreePrinter;
import hu.webarticum.treeprinter.printer.traditional.TraditionalTreePrinter;
import hu.webarticum.treeprinter.decorator.PadTreeNodeDecorator;
import hu.webarticum.treeprinter.decorator.ShadowTreeNodeDecorator;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.screen.*;
import com.googlecode.lanterna.gui2.*;
import com.googlecode.lanterna.graphics.*;
import com.googlecode.lanterna.TextColor.*;
import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.input.*;

public class App {

    public static void main(String[] args) throws IOException {
        TUI.launch();
    }
}

class TUI {
    
    private static Panel mainPanel;
    private static Panel topPanel;
    private static Panel inputPanel;
    private static Panel bottomPanel;
    private static Panel buttonsPanel;
    private static TextBox displayText;
    private static TextBox inputTextBox;
    private static Button enterButton;
    private static Button clearButton;
    private static Button guideButton;
    private static Button quitButton;
    private static char mode = 'g';

    private static ArrayList<TextBox> textboxes;
    private static ArrayList<Panel> panels;
    private static ArrayList<Button> buttons;
    private static CLI cliProcessor;

    private static String guide;

    public static void launch() throws IOException {
        init();
    }

    private static void init() throws IOException {
        cliProcessor = new CLI();
        panels = new ArrayList<>();
        textboxes = new ArrayList<>();
        buttons = new ArrayList<>();

        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);

        screen.startScreen();

        WindowBasedTextGUI textGUI = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLACK));
        SimpleTheme theme = new SimpleTheme(TextColor.ANSI.GREEN, TextColor.ANSI.BLACK, SGR.BOLD);
        textGUI.setTheme(theme);

        BasicWindow window = new BasicWindow();
        window.setHints(Arrays.asList(Window.Hint.CENTERED));
        
        createComponents();
        addComponents();

        displayText.setReadOnly(true);
        sizeComponents(screen.getTerminalSize());

        window.setComponent(mainPanel);

        terminal.addResizeListener(new TerminalResizeListener() {
            @Override
            public void onResized(Terminal terminal, TerminalSize newSize) {
                sizeComponents(newSize);
                try {
                    screen.refresh();
                } catch (Exception e) {
                    System.out.println("Terminal window resize failed!");
                }
            }
        });
        textGUI.addWindowAndWait(window);
    }

    private static void createComponents() {
        createPanels();
        createTextboxes();
        createButtons();
    }

    private static void createPanels() {
        mainPanel = new Panel();
        topPanel = new Panel();
        bottomPanel = new Panel(new GridLayout(2));
        inputPanel = new Panel();
        buttonsPanel = new Panel();

        panels.add(mainPanel);
        panels.add(topPanel);
        panels.add(bottomPanel);
        panels.add(inputPanel);
        panels.add(buttonsPanel);
    }

    private static void createTextboxes() {
        inputTextBox = new TextBox("-t [abcd]", TextBox.Style.MULTI_LINE);
        displayText = new TextBox();
        displayText.setCaretWarp(true);
        
        textboxes.add(inputTextBox);
        textboxes.add(displayText);
    }
    
    private static void createButtons() {
        enterButton = new Button("Enter", () -> {
            String inputText = inputTextBox.getText().trim();
            try {
                if (inputText == null || inputText.equals("")) {
                    displayText.setText("Please enter a valid input.");
                } else {
                    String[] args = parseCommandLine(inputText);
                    CLI commandProcessor = new CLI();
                    CommandLine cmd = new CommandLine(commandProcessor);
                    
                    try {
                        cmd.parseArgs(args);
                        String result = commandProcessor.processInput(commandProcessor.input);
                        
                        if (!result.equals("")) {
                            displayText.setText(result);
                        } else {
                            displayText.setText("No output generated. Check your command format.");
                        }
                        
                        // Write to file for compatibility
                        try {
                            FileWriter writer = new FileWriter("../cli/out.txt");
                            writer.write(result);
                            writer.close();
                        } catch (Exception e) {
                            // Ignore file write errors in TUI mode
                        }
                        
                    } catch (CommandLine.ParameterException e) {
                        displayText.setText("Invalid command format: " + e.getMessage() + 
                                          "\n\nUse 'guide' button for help or try:\n" +
                                          "-t your_regex_here\n" +
                                          "-k (for key)\n" +
                                          "-ls your_regex_here");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                displayText.setText("Error processing input: " + e.getMessage());
            }
            displayText.takeFocus();
        });

        clearButton = new Button("Clear", () -> {
            clear();
        });

        guideButton = new Button("Guide", () -> {
            showGuide();
        });

        quitButton = new Button("↳Quit", () -> {
            System.exit(0);
        });
        
        buttons.add(enterButton);
        buttons.add(clearButton);
        buttons.add(guideButton);
        buttons.add(quitButton);
    }

    // Helper method to parse command line input in TUI
    private static String[] parseCommandLine(String input) {
        // Simple command line parser that handles quotes and spaces
        ArrayList<String> args = new ArrayList<>();
        boolean inQuotes = false;
        StringBuilder currentArg = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c == '"' && (i == 0 || input.charAt(i-1) != '\\')) {
                inQuotes = !inQuotes;
            } else if (c == ' ' && !inQuotes) {
                if (currentArg.length() > 0) {
                    args.add(currentArg.toString());
                    currentArg = new StringBuilder();
                }
            } else {
                currentArg.append(c);
            }
        }
        
        if (currentArg.length() > 0) {
            args.add(currentArg.toString());
        }
        
        return args.toArray(new String[0]);
    }

    private static void addComponents() {
        topPanel.addComponent(displayText);
        inputPanel.addComponent(inputTextBox);

        buttonsPanel.addComponent(enterButton);
        buttonsPanel.addComponent(clearButton);
        buttonsPanel.addComponent(guideButton);
        buttonsPanel.addComponent(quitButton);

        bottomPanel.addComponent(buttonsPanel);

        mainPanel.addComponent(topPanel.withBorder(Borders.doubleLine("Regex2English")));
        mainPanel.addComponent(inputPanel.withBorder(Borders.doubleLine("Input")));
        mainPanel.addComponent(bottomPanel.withBorder(Borders.doubleLine()));
    }

    private static void sizeComponents(TerminalSize size) {
        mainPanel.setPreferredSize(size);
        GridLayout mainPanelLayout = new GridLayout(1)
                .setLeftMarginSize(1)
                .setRightMarginSize(1)
                .setTopMarginSize(0)
                .setBottomMarginSize(0);
        mainPanelLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.END, true, true);
        mainPanel.setLayoutManager(mainPanelLayout);

        int cols = size.getColumns();
        int rows = size.getRows();

        bottomPanel.setPreferredSize(new TerminalSize(cols, 20));
        inputPanel.setPreferredSize(new TerminalSize(cols, 20));
        buttonsPanel.setPreferredSize(new TerminalSize(cols, 18));

        inputTextBox.setPreferredSize(new TerminalSize(cols, 20));

        enterButton.setPreferredSize(new TerminalSize(cols, 2));
        clearButton.setPreferredSize(new TerminalSize(cols, 2));
        guideButton.setPreferredSize(new TerminalSize(cols, 2));
        quitButton.setPreferredSize(new TerminalSize(cols, 2));

        topPanel.setPreferredSize(new TerminalSize(cols, rows));

        switch (mode) {
            case 'a':
                break;
            case 'g':
            case 't':
                displayText.setPreferredSize(new TerminalSize(cols, rows));
                break;
        }
    }

    private static void clear() {
        inputTextBox.setText("");
        displayText.setText("");
        inputTextBox.takeFocus();
    }

    private static void showGuide() {
        String guideText = "Regex2English Guide\n" +
                          "==================\n\n" +
                          "Enter commands in the input box:\n\n" +
                          "Available Commands:\n" +
                          "  -k                Show key/legend\n" +
                          "  -t REGEX          Show abstract syntax tree\n" +
                          "  -tl REGEX         Show tree as list format\n" +
                          "  -td REGEX         Show decorated tree\n" +
                          "  -ls REGEX         List all atoms\n" +
                          "  -a REGEX          Break up by atoms\n" +
                          "  -c REGEX          Break up character by character\n" +
                          "  -h REGEX          Highlight instances\n" +
                          "  -v REGEX          Use verbose mode\n" +
                          "  --help            Show help message\n\n" +
                          "Examples:\n" +
                          "  -t \\\\d+             Show tree for digits pattern\n" +
                          "  -k                 Show key only\n" +
                          "  -ls \"[a-z]+\"       List atoms (use quotes for complex patterns)\n" +
                          "  -td \"^[A-Z]\\\\w*$\"   Decorated tree for capitalized words\n" +
                          "Tips:\n" +
                          "  - Combine flags: -v -t REGEX\n" +
                          "  - Escape backslashes: \\\\d instead of \\d";
        
        displayText.setText(guideText);
    }
}

@Command(
    name = "regex2english",
    mixinStandardHelpOptions = true,
    aliases = {"r2e"},
    description = "Convert regex patterns to English descriptions."
)
class CLI implements Runnable {

    @Parameters(description = "The regex input to process.", arity = "0..1")
    String input;

    @Option(names = {"-a", "--atoms"}, description = "Break up the regex input into atoms.")
    boolean breakUpByAtoms;

    @Option(names = {"-b", "--bblocks"}, description = "List all of the things the regex can be broken down to. Useful when invoking the highlight option.")
    boolean printBB;

    @Option(names = {"-c", "--char"}, description = "Break up the regex character by character.")
    boolean breakUpByChar;

    @Option(names = {"-h", "--highlight"}, description = "Highlights all instances of a given type.")
    boolean highlight;

    @Option(names = {"-k", "--key"}, description = "Print the key.")
    boolean printKey;
    
    @Option(names = {"-ls", "--list"}, description = "Lists all of the atoms.")
    boolean list;

    @Option(names = {"-t", "--tree"}, description = "Prints the abstract syntax tree that models the regex.")
    boolean printTree;

    @Option(names = {"-tl", "--treelist"}, description = "Prints the abstract syntax tree that models the regex as a list. Recommended for longer inputs.")
    boolean printTreeAsList;

    @Option(names = {"-td", "--treedecorated"}, description = "Prints the abstract syntax tree that models the regex as a prettier tree. Recommended for smaller inputs.")
    boolean printDecoratedTree;

    @Option(names = {"-v", "--verbose"}, description = "Combine letters into strings when parsing.")
    boolean verboseMode;
 
    private String key = "Key: \n----------------------------------------------------------------------------------------------------\n- Arrows (x) represent all of the logical operators and quantifiers.\n         \033[31m ∆ \033[37m\n- Single underline (x) represents a token meaning letters or escape sequences.\n                    \033[35m¯\033[37m\n- Double underline (x) represents character classes.\n                    \033[33m=\033[37m\n- Triple underline (x) represents an expression.\n                    \033[34m≡\033[37m\n- Quadruple underline (x) represents TBD\n                    \033[32m≣\033[37m\n----------------------------------------------------------------------------------------------------";
    private String keyNoANSI = "Key: \n ---------------------------------------------------------------------------------------------------\n|    - Arrows (x) represent all of the logical operators and quantifiers.                           |\n|              ∆                                                                                    |\n|    - Single underline (x) represents a token meaning letters or escape sequences.                 |\n|                        ¯                                                                          |\n|    - Double underline (x) represents character classes.                                           |\n|                        =                                                                          |\n|    - Triple underline (x) represents an expression.                                               |\n|                        ≡                                                                          |\n|    - Quadruple underline (x) represents TBD                                                       |\n|                           ≣                                                                       |\n ---------------------------------------------------------------------------------------------------\n";
    private RegexProcessor processor = new RegexProcessor();

    @Override
    public void run() {
        if (input == null || input.trim().isEmpty()) {
            System.err.println("Error: No input provided. Use --help for usage information.");
            System.exit(1);
        }

        String out = processInput(input);
        
        try {
            FileWriter writer = new FileWriter("../cli/out.txt");
            writer.write(out);
            writer.close();
        } catch (Exception e) {
            System.out.println("Could not write processor output.");
        }
        
        System.out.print(out);
    }

    public String processInput(String inputRegex) {
        String out = "";
        processor.process(inputRegex); 

        if (printKey) {
            out += keyNoANSI;
        } else if (list) {
            ArrayList<Atom> atoms = processor.getAtoms(); 
            out += processor.getAtomsList(atoms);
        } else if (breakUpByAtoms) {
            ArrayList<Atom> atoms = processor.getAtoms(); 

        } else if (printTree || printTreeAsList || printDecoratedTree) {
            SimpleTreeNode tree = processor.getParseTreeAsSimpleTreeNode(processor.getParseTree(), verboseMode);
            TreePrinter printer;

            if (printTree) {
                printer = new TraditionalTreePrinter();
                out += printer.stringify(new BorderTreeNodeDecorator(tree));                
            } else if (printTreeAsList) {
                printer = new ListingTreePrinter();
                out += printer.stringify(tree);  
            }

            if (printDecoratedTree) {
                printer = new TraditionalTreePrinter();
                out += printer.stringify(new ShadowTreeNodeDecorator(
                    BorderTreeNodeDecorator.builder()
                        .wideUnicode()
                        .buildFor(
                            new PadTreeNodeDecorator(tree, new Insets(0, 1)))));  
            }
        }
        return out;
    }
}