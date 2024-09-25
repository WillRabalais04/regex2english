/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package rabalais.regex2english;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.Runnable;
import java.io.FileWriter;
import java.util.HashMap;

import picocli.CommandLine;
import picocli.CommandLine.*;
// import picocli.codegen.docgen.manpage.*;

import hu.webarticum.treeprinter.*;
import hu.webarticum.treeprinter.decorator.BorderTreeNodeDecorator;
import hu.webarticum.treeprinter.printer.*;

import hu.webarticum.treeprinter.printer.listing.ListingTreePrinter;
import hu.webarticum.treeprinter.printer.traditional.TraditionalTreePrinter;
import hu.webarticum.treeprinter.decorator.PadTreeNodeDecorator;
import hu.webarticum.treeprinter.decorator.ShadowTreeNodeDecorator;

@Command(
    name = "regex2english",
    mixinStandardHelpOptions = true,
    aliases = {"r2e"},
    description = "..."
  )
class CLI implements Runnable{

    @Parameters(description = "The regex input to process.")
    private String input;

    @Option(names = {"-a", "--atoms"}, description = "Break up the regex input into atoms.")
    boolean breakUpByAtoms;

    @Option(names = {"-b", "--bblocks"}, description = "List all of the things the regex can be broken down to. Useful when invoking the highlight option.")
    boolean printBB;

    @Option(names = {"-c", "--char"}, description = "Break up the regex character by character.")
    boolean breakUpByChar;

    @Option(names = {"-cmp", "--compactmode"}, description = "Combine letters into strings when parsing.")
    boolean compactMode;

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
 
    private String key = "Key: \n----------------------------------------------------------------------------------------------------\n- Arrows (x) represent all of the logical operators and quantifiers.\n         \033[31m ∆ \033[37m\n- Single underline (x) represents a token meaning letters or escape sequences.\n                    \033[35m¯\033[37m\n- Double underline (x) represents character classes.\n                    \033[33m=\033[37m\n- Triple underline (x) represents an expression.\n                    \033[34m≡\033[37m\n- Quadruple underline (x) represents TBD\n                    \033[32m≣\033[37m\n----------------------------------------------------------------------------------------------------";
    private String keyNoANSI = "Key: \n ---------------------------------------------------------------------------------------------------\n|    - Arrows (x) represent all of the logical operators and quantifiers.                           |\n|              ∆                                                                                    |\n|    - Single underline (x) represents a token meaning letters or escape sequences.                 |\n|                        ¯                                                                          |\n|    - Double underline (x) represents character classes.                                           |\n|                        =                                                                          |\n|    - Triple underline (x) represents an expression.                                               |\n|                        ≡                                                                          |\n|    - Quadruple underline (x) represents TBD                                                       |\n|                           ≣                                                                       |\n ---------------------------------------------------------------------------------------------------\n";
    private RegexProcessor processor = new RegexProcessor();
    private HashMap<String, String> cachedInputs = new HashMap<>();

    @Override
    public void run() {

        String out = "";


        if(cachedInputs.containsKey(input)){}
        else{

        processor.process(input); 

        // make it so just the key can be entered
        if(printKey){
            System.out.println(keyNoANSI);
        }
        else if(list){
            ArrayList<Atom> atoms =  processor.getAtoms(); 
            //    ArrayList<Atom> atoms =  processor.splitAtoms(processor.getAtoms());  get split atoms
            out += processor.getAtomsList(atoms);
        }
        else if(printTree || printTreeAsList || printDecoratedTree){
            SimpleTreeNode tree = processor.getParseTreeAsSimpleTreeNode(processor.getParseTree(), compactMode);
            TreePrinter printer;

            if(printTree){
                printer = new TraditionalTreePrinter();
                out += printer.stringify(new BorderTreeNodeDecorator(tree));                
            }

            else if(printTreeAsList){

                printer = new ListingTreePrinter();
                out += printer.stringify(tree);  

            }

            else if(printDecoratedTree){

                printer = new TraditionalTreePrinter();

                out += printer.stringify(new ShadowTreeNodeDecorator(
                    BorderTreeNodeDecorator.builder()
                        .wideUnicode()
                        .buildFor(
                            new PadTreeNodeDecorator(tree, new Insets(0, 1)))));  
            }

        }
        else{ // default behavior: does linting
            out = "Linting coming soon";
        }
        }

        System.out.println("'" + out + "'");

        try{
            FileWriter writer = new FileWriter("../cli/out.txt");
            writer.write(out);
            writer.close();
        }catch(Exception e){
            System.out.println("Could not write processor output.");
        }
    }

    
}

// public static String checkCache(){

// }




public class App{

    public static void main(String[] args) throws IOException{

        // CLI test = new CLI();
        // test.run();
        int exitCode = new CommandLine(new CLI()).execute(args); 
        System.exit(exitCode);

        // System.out.println("1");
        // CLI mainCLI = new CLI();
        // mainCLI.createNewTerminal();
        // System.out.println("3");

    }
}

