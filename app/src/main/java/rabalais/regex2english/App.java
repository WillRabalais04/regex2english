/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package rabalais.regex2english;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;   
import java.util.Comparator;
import java.util.TreeSet; 
import java.util.Comparator;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import rabalais.regex2english.generated.*;
import rabalais.regex2english.generated.regex2englishParser.*;

public class App {

    static int MAX_REGEX_LENGTH = 33554432; // change this to the length of the input passed in by user
    public static int[] regexAllocationChecker = new int[MAX_REGEX_LENGTH];

    private static CharStream inputStream;
    private static regex2englishLexer lexer;
    private static CommonTokenStream tokens;
    private static regex2englishParser  parser; 
    private static ParseTree tree;
    private static RegexVisitor visitor;

    public static void splitAtom(){

    }
   
    public static void main(String[] args) throws IOException{

        String input = "^(?=.*\\d\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?!.*\\s).{8,16}$";
        // String input = "[ab]";
        // String input = "\\\\ab\\\\";
        // String input = "ghdf[ab]gw[ab]";

        // String input = "[asdf][ab][ab]";

        // String input = "([ab][ab][ab][ab])";

        System.out.println("Key: \n----------------------------------------------------------------------------------------------------");
        System.out.println("- Arrows (x) represent all of the logical operators and quantifiers.");
        System.out.println("         \033[31m ∆ \033[37m");
        System.out.println("- Single underline (x) represents a token meaning letters or escape sequences.\n                    \033[35m¯\033[37m");
        System.out.println("- Double underline (x) represents character classes.\n                    \033[33m=\033[37m");
        System.out.println("- Triple underline (x) represents an expression.\n                    \033[34m≡\033[37m");
        System.out.println("- Quadruple underline (x) represents TBD\n                    \033[32m≣\033[37m");
        System.out.println("----------------------------------------------------------------------------------------------------");
      
        //letters, charcter class,  groups, logical operators and meta sequences
        //System.out.println("◀GROUP:1▶");

        processTree(input);
        //    System.out.println();

    }

    public static class AtomComparator implements Comparator<rabalais.regex2english.Atom>{
        public int compare(Atom atom1, Atom atom2){
            return Integer.compare(atom1.getIndex(), atom2.getIndex());
        }
    }

    public static String processTree(String input){

        for(int i = 0; i < input.length(); i++){
            regexAllocationChecker[i] = 0;
        }

        inputStream = CharStreams.fromString(input);
        // CharStream input = CharStreams.fromFileName("src/main/resources/input.txt");
         
        lexer = new regex2englishLexer(inputStream);
        tokens = new CommonTokenStream(lexer);
        parser = new regex2englishParser(tokens);

        tree = parser.start();
        visitor = new RegexVisitor();
       
        ArrayList<Atom> atoms = new ArrayList<Atom>();

        getAtoms(tree, atoms, input);

        // Collections.sort(atoms, new Atom.AtomComparator());
    
        String ret = "";
    
        Collections.sort(atoms, new AtomComparator());

        for(Atom a: atoms){
            a.printAtom();
            ret += a.getIndex() + ") '" + a.getFullContent() + "' - " + a.getAtomTypes() + " | Terminal: '" + a.getTerminal() + "'\n";
        }

     

        // StringBuilder v = new StringBuilder(input.length());

        // for (int i = 0; i < input.length(); i++){
        //     v.append(' ');
        // }

        // check every atom if there is an overlapping atom 

        // atoms.stream()
        // .filter(atom -> atom.stream()
        // .forEach(otherAtom -> otherAtom != atom && otherAtom.getIndex() >= atom.getIndex() && otherAtom.getIndex() < atom.getIndex() + atom.getLength()))
        // .forEach(atom->);


        // for(Atom a: atoms){

        //     // System.out.println(a.getIndex() + ") '" + a.getContent());
        //     // System.out.println(v);
        //     for(int i = 0; i < a.getLength(); i++){
        //         // System.out.print(a.getIndex() + i);
        //         v.setCharAt(a.getIndex() + i, a.getFullContent().charAt(i));
        //     }
        // }

        // System.out.println("V: '" + v + "'");

        return ret;
    }

    public static void getAtoms(ParseTree root, ArrayList<Atom> atoms, String input){

    
        if(root != null){

            for(int i = 0; i < root.getChildCount(); i++){

                ParseTree child = root.getChild(i);
                               
                if(!(child instanceof TerminalNode)){
                    getAtoms(child, atoms, input);

                }

                // getAtoms(root.getChild(i), atoms, input);
                
            }

                                 
            if(isAtom(root)){

                /*  atoms that need two parts:
                - groups
                - character class containing (javalangCharacterClass |  posix | group | escape sequence | quantifier | logical operator | anchors | back reference | )
                - lookahead/behinds

                */
                // System.out.println(root.getClass().getSimpleName());

                Atom atom = new Atom(root);

                String type = getCleanClassName(root.getClass().getSimpleName());
                atom.addType(type);

                // System.out.println("ATOM: " + atom.getFullContent());


                while(root.getChildCount() == 1 && root.getChild(0) != null){
                    root = root.getChild(0);                    
                    atom.addType(type);
                    type = getCleanClassName(root.getClass().getSimpleName());
                }

                if(root instanceof TerminalNode){
                    Vocabulary vocab = lexer.getVocabulary();
                    atom.setTerminal(getCleanTerminalName(vocab.getSymbolicName(((Token)root.getPayload()).getType())));
                }
                else if(root.getChildCount() > 1){
                    atom.setTerminal("N/A");
                }
                else{
                    atom.setTerminal("?");
                }

                atom.addContent(getAtomIndex(input, root), root.getText());
                atoms.add(atom);
            }
            // else if(root instanceof TerminalNode){
            //         Atom atom = new Atom(root);

            //         String type = getCleanClassName(root.getClass().getSimpleName());
            //         atom.addType(type);
            //         Vocabulary vocab = lexer.getVocabulary();
            //         atom.setTerminal(getCleanTerminalName(vocab.getSymbolicName(((Token)root.getPayload()).getType())));
            //     }
                // System.out.println("'" + root.getText() + "' | Class: " + root.getClass().getSimpleName());
            
            
            
          
           

    
        }
       
    }     
    
        public static int getAtomIndex(String input, ParseTree node){
            
            String atomContent = node.getText();
            int index = input.indexOf(atomContent);

            String leftAtomContent = "";
    
            while(instancesOfWithDuplicates(input, atomContent) != 1 && node != null && node.getParent() != null){


                while(node.getParent() != null && node.getParent().getChildCount() == 1){
                    node = node.getParent();
                }

                for(int i = 0; i < getChildIndex(node); i++){
    
                    leftAtomContent = node.getParent().getChild(i).getText() + leftAtomContent;
    
                }
    
                if(instancesOfWithDuplicates(input, atomContent) == 0){
                    break;
                }
    
                node =  node.getParent();
    
                atomContent = node.getText();
                index = input.indexOf(atomContent) + leftAtomContent.length();
    
            }
    
            return index;
        }
    
        public static int instancesOfWithDuplicates(String input, String substring){
    
            if(input.equals(substring)){
                return 1;
            }
    
            int count = 0;
    
            for(int i = 0; i < input.length() - (substring.length() - 1);i++){
                if(input.substring(i, i + substring.length()).equals(substring)){
                    count++;
                }
            }

            return count;
        }

        // method to get getChild() index for the parent of a given child 
        public static int getChildIndex(ParseTree root){

            ParseTree parent = root.getParent();

            if(parent.getChildCount() == 1){
                return 0;
            }
            int index = 0;

            if(parent != null){  
                for(int i = 0; i < parent.getChildCount(); i++){
                    if(parent.getChild(i) == root){

                        index = i;
                        break;
                    }
                }
            }

            return index;
        }

        public static boolean isAtom(ParseTree node){
        
            List<String> atomTypes = Arrays.asList("DoubleBoundaryMatchersContext",
            "EscapedToLiteralOutsideCharClassContext",
            "QuoteContext",
            "ZeroWidthAssertionsContext",
            "InlineModifierContext",
            "CaptureGroupContext",
            "GroupContext",
            "BoundaryMatcherStartContext",
            "EscapedFromLiteralContext",
            "CharacterClassContext",
            "BackReferenceContext",
            "WordBoundaryContext",
            "NonWordBoundaryContext",
            "InputStartContext",
            "EndOfMatchContext",
            "LetterContext",
            "QuantifierContext",
            "BoundaryMatcherEndContext",
            "EndOfInputExceptFinalTerminator",
            "OrContext"
            );
    
            String nodeClassName = node.getClass().getSimpleName();
            
            return atomTypes.stream().anyMatch(type -> nodeClassName.equals(type));
    
        }

        public static String getCleanClassName(String dirty){

            Map<String, String> cleanClassNames = Map.ofEntries(
                entry("StartContext", "Start"),
                entry("ExprContext", "Expression"),
                entry("ExprHelperContext", "Expression"),
                entry("CharacterClassContentContext", "Character Class Content"),
                entry("CharacterClassContentHelperContext", "Character Class Content"),
                entry("EscapedToLiteralInsideCharClassContext", "Escape Sequence (inside character class)"),
                entry("EscapedToLiteralOutsideCharClassContext", "Escape Sequence (outside character class)"),
                entry("ZeroWidthAssertionsContext", "Zero Width Assertion"),
                entry("CaptureGroupContext", "Capture Group"),
                entry("GroupContext", "Group"),
                entry("RangeContext", "Range"),
                entry("PredefinedCharacterClassContext", "Predefined Character Class"),
                entry("CharacterClassContext", "Character Class"),
                entry("BackReferenceContext", "Back Reference"),
                entry("BoundaryMatcherStartContext", "Boundary Matcher Start"),
                entry("WordBoundaryContext", "Word Boundary"),
                entry("NonWordBoundaryContext", "Non Word Boundary"),
                entry("InputStartContext", "Input Start"),
                entry("EndOfMatchContext", "End Of Match"),
                entry("LetterContext", "Letter(s)"),
                entry("QuantifierContext", "Quantifier"),
                entry("DoubleBoundaryMatchersContext", "Double Boundary Matcher"),
                entry("BoundaryMatcherEndContext", "Boundary Matcher End"),
                entry("EndOfInputExceptFinalTerminatorContext", "End Of Input (except terminator)"),
                entry("EndOfInputContext", "End Of Input"),
                entry("OrContext", "Or"),
                entry("EscapedFromLiteralContext", "Escape Sequence"),
                entry("InlineModifierContext", "Inline Modifier"),
                entry("NamedCaptureGroupContext", "Named Capture Group"),
                entry("NonCaptureGroupContext", "Non Capture Group"),
                entry("IndependentNonCapturingGroupContext", "Independent Non Capturing Group"),
                entry("ZeroWidthPositiveLookAheadContext", "Zero Width Positive Look Ahead"),
                entry("ZeroWidthNegativeLookAheadContext", "Zero Width Negative Look Ahead"),
                entry("ZeroWidthPositiveLookBehindContext", "Zero Width Positive Look Behind"),
                entry("ZeroWidthNegativeLookBehindContext", "Zero Width Negative Look Behind"),
                entry("PosixContext", "POSIX"),
                entry("POSIX_LETTERSContext", "POSIX LETTERS"),
                entry("POSIX_ALPHANUMERICContext", "POSIX ALPHANUMERIC"),
                entry("POSIX_LOWERCASEContext", "POSIX Lowercase"),
                entry("POSIX_WHITESPACE_OR_GLYPHContext", "POSIX Whitespace or Glyph"),
                entry("POSIX_CONTROL_CHARACTERSContext", "POSIX Control Characters"),
                entry("POSIX_ALPHANUM_PUNCTUATIONContext", "POSIX Alphanumeric or Punctuation"),
                entry("POSIX_DIGITSContext", "POSIX Digits"),
                entry("POSIX_WHITESPACEContext", "POSIX Whitespace"),
                entry("POSIX_SPACE_OR_TABContext", "POSIX Space or Tab"),
                entry("POSIX_ASCIIContext", "POSIX ASCII"),
                entry("POSIX_UPPERCASEContext", "POSIX Uppercase"),
                entry("POSIX_X_DIGITContext", "POSIX HEX"),
                entry("POSIX_PUNCTUATIONContext", "POSIX Punctuation"),
                entry("JavalangCharacterClassContext", "java.lang.Character"),
                entry("JAVALANG_CC_LOWERCASEContext", "java.lang.Character Lowercase"),
                entry("JAVALANG_CC_WHITESPACEContext", "java.lang.Character Whitespace"),
                entry("JAVALANG_CC_UPPERCASEContext", "java.lang.Character Uppercase"),
                entry("JAVALANG_CC_MIRROREDContext", "java.lang.Character Mirrored"),
                entry("UnicodeScriptClassContext", "Unicode Script Class"),
                entry("NOT_UPPERCASEContext", "Not Uppercase"),
                entry("IS_ALPHABETICContext", "Is Alphabetic"),
                entry("CURRENCY_SYMBOLContext", "Currency Symbol"),
                entry("UPPERCASEContext", "Is Uppercase"),
                entry("LATINContext", "Is Latin"),
                entry("NOT_GREEKContext", "Not Greek"),
                entry("GREEKContext", "Is Greek"),
                entry("Extra_letters_allowed_inside_CCContext", "Letter"),
                entry("QuoteContext", "Quote")
            ); 
        
            String clean = cleanClassNames.get(dirty);
            return (clean == null) ? dirty : clean;
    
        }

        public static String getCleanTerminalName(String dirty){

            Map<String, String> cleanTerminalNames = new HashMap<>();
            cleanTerminalNames.put("WILDCARD", "Wildcard");
            cleanTerminalNames.put("CARET", "Caret");
            cleanTerminalNames.put("DIGIT", "Digit");
            cleanTerminalNames.put("NON_DIGIT", "Non-Digit");
            cleanTerminalNames.put("HORIZONTAL_WHITESPACE", "Horizontal Whitespace");
            cleanTerminalNames.put("NON_HORIZONTAL_WHITESPACE", "Non-Horizontal Whitespace");
            cleanTerminalNames.put("WHITESPACE", "Whitespace");
            cleanTerminalNames.put("NON_WHITESPACE", "Non-Whitespace");
            cleanTerminalNames.put("VERTICAL_WHITESPACE", "Vertical Whitespace");
            cleanTerminalNames.put("NON_VERTICAL_WHITESPACE", "Non-Vertical Whitespace");
            cleanTerminalNames.put("WORD", "Word");
            cleanTerminalNames.put("NON_WORD", "Non-Word");
            cleanTerminalNames.put("LEFT_QUOTE", "Left Quote");
            cleanTerminalNames.put("RIGHT_QUOTE", "Right Quote");
            cleanTerminalNames.put("LETTER_RANGE", "Letter Range");
            cleanTerminalNames.put("NUMBER_RANGE", "Number Range");
            cleanTerminalNames.put("DOUBLE_AMPERSAND", "Double Ampersand");
            cleanTerminalNames.put("PIPE", "Pipe");
            cleanTerminalNames.put("PLUS_ESCAPED", "Plus Escaped");
            cleanTerminalNames.put("LBRACE_ESCAPED", "Left Brace Escaped");
            cleanTerminalNames.put("PIPE_ESCAPED", "Pipe Escaped");
            cleanTerminalNames.put("BACKSLASH_ESCAPED", "Backslash Escaped");
            cleanTerminalNames.put("LPAREN_ESCAPED", "Left Parenthesis Escaped");
            cleanTerminalNames.put("RPAREN_ESCAPED", "Right Parenthesis Escaped");
            cleanTerminalNames.put("LBRACKET_ESCAPED", "Left Bracket Escaped");
            cleanTerminalNames.put("RBRACKET_ESCAPED", "Right Bracket Escaped");
            cleanTerminalNames.put("DOT_ESCAPED", "Dot Escaped");
            cleanTerminalNames.put("CARET_ESCAPED", "Caret Escaped");
            cleanTerminalNames.put("QMARK_ESCAPED", "Question Mark Escaped");
            cleanTerminalNames.put("ASTERISK_ESCAPED", "Asterisk Escaped");
            cleanTerminalNames.put("DOLLAR_SIGN_ESCAPED", "Dollar Sign Escaped");
            cleanTerminalNames.put("HYPHEN_ESCAPED", "Hyphen Escaped");
            cleanTerminalNames.put("N_OCCURRANCES", "N Occurrences");
            cleanTerminalNames.put("MAX_QUANTIFIER", "Max Quantifier");
            cleanTerminalNames.put("MIN_QUANTIFIER", "Min Quantifier");
            cleanTerminalNames.put("RANGE_QUANTIFIER", "Range Quantifier");
            cleanTerminalNames.put("PLUS", "Plus");
            cleanTerminalNames.put("ASTERISK", "Asterisk");
            cleanTerminalNames.put("QMARK", "Question Mark");
            cleanTerminalNames.put("LBRACKET", "Left Bracket");
            cleanTerminalNames.put("RBRACKET", "Right Bracket");
            cleanTerminalNames.put("LPAREN", "Left Parenthesis");
            cleanTerminalNames.put("RPAREN", "Right Parenthesis");
            cleanTerminalNames.put("BACKSLASH", "Backslash");
            cleanTerminalNames.put("OCTAL_1", "Octal 1");
            cleanTerminalNames.put("OCTAL_2", "Octal 2");
            cleanTerminalNames.put("OCTAL_3", "Octal 3");
            cleanTerminalNames.put("HEXA_2", "Hexadecimal 2");
            cleanTerminalNames.put("HEXA_4", "Hexadecimal 4");
            cleanTerminalNames.put("HEXA_6", "Hexadecimal 6");
            cleanTerminalNames.put("CARRIAGE_RETURN", "Carriage Return");
            cleanTerminalNames.put("TAB", "Tab");
            cleanTerminalNames.put("FORM_FEED", "Form Feed");
            cleanTerminalNames.put("ALERT", "Alert");
            cleanTerminalNames.put("ESC", "Escape");
            cleanTerminalNames.put("POSITIVE_LA", "Positive Lookahead");
            cleanTerminalNames.put("NEGATIVE_LA", "Negative Lookahead");
            cleanTerminalNames.put("POSITIVE_LB", "Positive Lookbehind");
            cleanTerminalNames.put("NEGATIVE_LB", "Negative Lookbehind");
            cleanTerminalNames.put("DOLLAR_SIGN", "Dollar Sign");
            cleanTerminalNames.put("WORD_BOUNDARY", "Word Boundary");
            cleanTerminalNames.put("NON_WORD_BOUNDARY", "Non-Word Boundary");
            cleanTerminalNames.put("INPUT_START", "Input Start");
            cleanTerminalNames.put("END_OF_MATCH", "End of Match");
            cleanTerminalNames.put("INPUT_END", "Input End");
            cleanTerminalNames.put("INPUT_END_INC_NEWLINE", "Input End Including Newline");
            cleanTerminalNames.put("LINEBREAK_MATCHER", "Linebreak Matcher");
            cleanTerminalNames.put("LETTER", "Letter");
            cleanTerminalNames.put("INLINEMODIFIER", "Inline Modifier");
            cleanTerminalNames.put("LOCAL_INLINE_MODIFIER_TEMPLATE", "Local Inline Modifier Template");
            cleanTerminalNames.put("N_TH_CAPTURE_GROUP", "Nth Capture Group");
            cleanTerminalNames.put("NAMED_CAPTURE_GROUP_MATCH", "Named Capture Group Match");
            cleanTerminalNames.put("NAMED_CAPTURE_GROUP_NAME", "Named Capture Group Name");             
        
            String clean = cleanTerminalNames.get(dirty);
            return (clean == null) ? dirty : clean;
    
        }

 


// graveyard
//---------------------------------------------------    

    // public static String getTerminals(ParseTree root, String ret){
        
    //     if(root != null){

    //         if(root instanceof TerminalNode){
    //             ret += root.getText();
    //         }

    //         for(int i = 0; i < root.getChildCount(); i++){
            
    //             ret = getTerminals(root.getChild(i), ret);
                
    //         }
    //     } 

    //     return ret;
    // }

    // // side experiment to see if the memory address of root.getParent().getChild() == root()
    // public static void testMemAddress(ParseTree root){

    //     if(root != null){
    //     ParseTree parent = root.getParent();
        
    //     if(parent != null){
            
    //         System.out.println("Parent: '" + parent.getText()  + "' | Root: '" + root.getText());
    //         for(int i = 0; i < parent.getChildCount();i++){
    //             System.out.println("Sibling: '" + parent.getChild(i).getText() + "' | Sibling = Root: " + (parent.getChild(i) == root));
    //         }
    //     }

    //         if(root instanceof TerminalNode){

    //             return;
    //         }
            
    //         for(int i = 0; i < root.getChildCount(); i++){
    //             System.out.println();
    //             testMemAddress(root.getChild(i));
                
    //         }
    //     }

    // }

    // public static int getDuplicateAtomsCount(ArrayList<Atom> atoms, String content){
            
    //     int duplicateCount = 0;
        
    //     for (Atom atom: atoms){

    //         if(atom.getContent().equals(content)){
    //             duplicateCount++;
    //         }
    //     }

    //     return duplicateCount;
    // }

    // 

    // // gets all the values of the children that are terminalNodes
    //  public static void getTerminalList(ParseTree root, ArrayList<Atom> terminals){

    //     if(root != null){
    //         if(root instanceof TerminalNode){

    //             String type = getCleanClassName(root.getParent().getClass().getSimpleName());
    //             // System.out.println("type: " + type);


                
    //             terminals.add();
    //             // System.out.println(root.getText() + " (" + type + ")");


    //             return;
    //         }

    //         for(int i = 0; i < root.getChildCount(); i++){
               
    //             getTerminalList(root.getChild(i), terminals);
                
    //         }
    //     }

    //  }

    // public static String getInputUpToAtom(ParseTree root, String ret, int atomHashCode){

    //     int nodeHashCode = root.hashCode();
       
    //     if(root != null){

    //         if(nodeHashCode == atomHashCode){
    //             root = null;
    //             return "";
    //         }

    //             if(root instanceof TerminalNode){
    //                 ret += root.getText();
    //             }
    
    //             for(int i = 0; i < root.getChildCount(); i++){                   
    //                 ret = getInputUpToAtom(root.getChild(i), ret, atomHashCode);
                    
    //             }
    //     } 

    //     return ret;
    //  }




}