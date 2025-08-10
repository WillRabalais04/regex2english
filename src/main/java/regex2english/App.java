package regex2english;

import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

import picocli.CommandLine;
import picocli.CommandLine.*;

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
        TUI.init();
    }
}

class TUI {
    
    private static final String guideText = "Guide\n" +
    "==================\n\n" +
    "Enter commands in the input box:\n\n" +
    "Available Commands:\n" +
    "  -k                Show key/legend\n" +
    "  -t [REGEX]          Show abstract syntax tree\n" +
    "  -tl [REGEX]         Show tree as list format\n" +
    "  -td [REGEX]         Show decorated tree\n" +
    "  -ls [REGEX]         List all atoms\n" +
    "  -a [REGEX]          Break up by atoms\n" +
    "  -c [REGEX]          Break up character by character\n" +
    "  -h [REGEX]          Highlight instances\n" +
    "  -v [REGEX]          Use verbose mode\n" +
    "  --help            Show help message\n\n" +
    "Examples:\n" +
    "  -t \\\\d+             Show tree for digits pattern\n" +
    "  -k                 Show key only\n" +
    "  -ls \"[a-z]+\"       List atoms (use quotes for complex patterns)\n" +
    "  -td \"^[A-Z]\\\\w*$\"   Decorated tree for capitalized words\n" +
    "Tips:\n" +
    "  - Combine flags: -v -t [REGEX]\n" +
    "  - Escape backslashes: \\\\d instead of \\d";

    private static final String defaultInputText = "-t ^(?=.*\\d\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=shadowJar\\s).{8,16}$";

    private static UIComponents components;
    private static char mode = 'g';
    private static CLI CLI;
    
    record UIComponents(
        Terminal terminal,
        Screen screen,
        Window window,
        WindowBasedTextGUI GUI,
        SimpleTheme theme,
        Panel mainPanel,
        Panel topPanel, 
        Panel inputPanel,
        Panel bottomPanel,
        Panel buttonsPanel,
        TextBox displayText,
        TextBox inputTextBox,
        Button enterButton,
        Button clearButton,
        Button guideButton,
        Button quitButton,
        TerminalResizeListener rl
    ) {
        public static UIComponents create() throws IOException{

            Terminal terminal = new DefaultTerminalFactory().createTerminal();
            TerminalScreen screen = new TerminalScreen(terminal);
            BasicWindow window = new BasicWindow();

            WindowBasedTextGUI GUI = new MultiWindowTextGUI(screen, 
            new DefaultWindowManager(), 
            new EmptySpace(TextColor.ANSI.BLACK));
            SimpleTheme theme = new SimpleTheme(TextColor.ANSI.GREEN, TextColor.ANSI.BLACK, SGR.BOLD);

            Panel mainPanel = new Panel();
            Panel topPanel = new Panel();
            Panel inputPanel = new Panel();
            Panel bottomPanel = new Panel(new GridLayout(2));
            Panel buttonsPanel = new Panel();
            
            TextBox displayText = new TextBox();
            displayText.setCaretWarp(true);
            displayText.setReadOnly(true);
            
            TextBox inputTextBox = new TextBox(defaultInputText, 
                                              TextBox.Style.MULTI_LINE);
            Button enterButton =  new Button("Enter", () -> {
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
                            
                        } catch (CommandLine.ParameterException e) {
                            displayText.setText("Invalid command format: " + e.getMessage() + 
                                                "\n\nUse 'guide' button for help or try:\n" +
                                                "-t [REGEX]\n" +
                                                "-k (for key)\n" +
                                                "-ls [[REGEX]]");
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    displayText.setText("Error processing input: " + e.getMessage());
                }
                displayText.takeFocus();
            });
            Button clearButton = new Button("Clear", () -> {
                switch (mode) {
                    case 'g':
                    case 's':
                    case 'e':
                        inputTextBox.setText("");
                        displayText.setText("");
                        inputTextBox.takeFocus();
                        break;
                }
            });
            Button guideButton = new Button("Guide", ()->{
                switch (mode) {
                    case 'g':
                        displayText.setText(guideText);
                        break;
                    case 's':
                        break;
                    case 'e':
                        break;
                }
            });
            Button quitButton = new Button("↳Quit", () -> {
                System.exit(0);
            });

            TerminalResizeListener rl = new TerminalResizeListener() {
                @Override
                public void onResized(Terminal terminal, TerminalSize newSize) {
                    sizeComponents(newSize);
                    try {
                        components.screen().refresh();
                    } catch (Exception e) {
                        System.out.println("Terminal window resize failed!");
                    }
                }
            };
            
            return new UIComponents(
                terminal, screen, window, GUI, theme,
                mainPanel, topPanel, inputPanel, bottomPanel, buttonsPanel,
                displayText, inputTextBox,
                enterButton, clearButton, guideButton, quitButton,
                rl
            );
        }
    }

    static void init() throws IOException {
        CLI = new CLI();
        components = UIComponents.create();
        
        components.window().setHints(Arrays.asList(Window.Hint.CENTERED));
        components.screen().startScreen();
        components.GUI().setTheme(components.theme());
        
        components.topPanel().addComponent(components.displayText());
        components.inputPanel().addComponent(components.inputTextBox());

        components.buttonsPanel().addComponent(components.enterButton());
        components.buttonsPanel().addComponent(components.clearButton());
        components.buttonsPanel().addComponent(components.guideButton());
        components.buttonsPanel().addComponent(components.quitButton());

        components.bottomPanel().addComponent(components.buttonsPanel());

        components.mainPanel().addComponent(components.topPanel().withBorder(Borders.doubleLine("Regex2English")));
        components.mainPanel().addComponent(components.inputPanel().withBorder(Borders.doubleLine("Input")));
        components.mainPanel().addComponent(components.bottomPanel().withBorder(Borders.doubleLine()));

        sizeComponents(components.screen().getTerminalSize());
        components.window().setComponent(components.mainPanel());
        
        components.terminal().addResizeListener(components.rl());

        components.GUI().addWindowAndWait(components.window());
    }

    private static void sizeComponents(TerminalSize size) {
        components.mainPanel().setPreferredSize(size);
        GridLayout mainPanelLayout = new GridLayout(1)
                .setLeftMarginSize(1)
                .setRightMarginSize(1)
                .setTopMarginSize(0)
                .setBottomMarginSize(0);
        mainPanelLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.END, true, true);
        components.mainPanel().setLayoutManager(mainPanelLayout);

        int cols = size.getColumns();
        int rows = size.getRows();

        components.bottomPanel().setPreferredSize(new TerminalSize(cols, 20));
        components.inputPanel().setPreferredSize(new TerminalSize(cols, 20));
        components.buttonsPanel().setPreferredSize(new TerminalSize(cols, 18));
        components.inputTextBox().setPreferredSize(new TerminalSize(cols, 20));

        components.enterButton().setPreferredSize(new TerminalSize(cols, 2));
        components.clearButton().setPreferredSize(new TerminalSize(cols, 2));
        components.guideButton().setPreferredSize(new TerminalSize(cols, 2));
        components.quitButton().setPreferredSize(new TerminalSize(cols, 2));

        components.topPanel().setPreferredSize(new TerminalSize(cols, rows));

        switch (mode) {
            case 'a':
                break;
            case 'g':
            case 't':
                components.displayText().setPreferredSize(new TerminalSize(cols, rows));
                break;
        }
    }

    // utils
    private static String[] parseCommandLine(String input) {
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
}