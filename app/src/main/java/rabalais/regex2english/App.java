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


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import rabalais.regex2english.generated.*;
import rabalais.regex2english.generated.regex2englishParser.*;

public class App {

    private static List<String> atomTypes = Arrays.asList("DoubleBoundaryMatchersContext",
        "escapedToLiteralOutsideCharClassContext",
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
   
    public static void main(String[] args) throws IOException{

        String input = "^(?=.*\\d\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?!.*\\s).{8,16}$";
        // String input = "[ab]";

        // String input = "([ab][ab][ab][ab][ab][ab])";

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

           System.out.println(processTree(input));

    }

 

    public static String processTree(String input){

        CharStream inputStream = CharStreams.fromString(input);
        // CharStream input = CharStreams.fromFileName("src/main/resources/input.txt");
         
        regex2englishLexer lexer = new regex2englishLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        regex2englishParser parser = new regex2englishParser(tokens);

        ParseTree tree = parser.start();
        RegexVisitor visitor = new RegexVisitor();
       
        TreeSet<Atom> atoms = new TreeSet<Atom>(new Atom.AtomComparator());
        ArrayList<Atom> terminals = new ArrayList<>();

       

        getAtoms(tree, atoms, terminals, input);
    
        String ret = "";

        for(Atom a: atoms){
            ret += a.getIndex() + ") '" + a.getContent() + "' - " + a.getType() + "\n";
        }


        StringBuilder v = new StringBuilder(input.length());

        for (int i = 0; i < input.length(); i++){
            v.append(' ');
        }

        atoms.stream()
        .filter(atom -> atom.stream()
        .anyMatch(otherAtom -> otherAtom != atom && otherAtom.getIndex() >= atom.getIndex() && otherAtom.getIndex() < atom.getIndex() + atom.getLength()))
        .forEach(atom->);;


        for(Atom a: atoms){

            // System.out.println(a.getIndex() + ") '" + a.getContent());
            // System.out.println(v);
            for(int i = 0; i < a.getLength(); i++){
                // System.out.print(a.getIndex() + i);
                v.setCharAt(a.getIndex() + i, a.getContent().charAt(i));
            }
        }

        System.out.println("V: '" + v + "'");

        return ret;
    }

    public static String getTerminals(ParseTree root, String ret){
       
        if(root != null){

            if(root instanceof TerminalNode){
                ret += root.getText();
            }

            for(int i = 0; i < root.getChildCount(); i++){
               
                ret = getTerminals(root.getChild(i), ret);
                
            }
        } 

        return ret;
    }



    public static boolean isAtom(ParseTree node){

        String nodeClassName = node.getClass().getSimpleName();
        
        return atomTypes.stream().anyMatch(type -> nodeClassName.equals(type));

    }


    public static void getAtoms(ParseTree root, TreeSet<Atom> atoms, ArrayList<Atom> terminals, String input){
    
        if(root != null){
            
            for(int i = 0; i < root.getChildCount(); i++){
               
                getAtoms(root.getChild(i), atoms, terminals, input);
                
            }

            int length = 0;

           
                        
            // if(root.getChildCount() > 0 && (root.getChild(0) instanceof TerminalNode || root.getChild(root.getChildCount() - 1) instanceof TerminalNode)){                 
            if(root.getChildCount() > 0 && isAtom(root)){
               
                // if(root.getClass().getSimpleName().equals("CharacterClassContentContext")){
                //     return;
                // }
                // if(root.getClass().getSimpleName().equals("CharacterClassContext")){
                //     return;
                // }
                // if(root.getClass().getSimpleName().equals("LetterContext")){
                //     return;
                // }
                // if(root.getClass().getSimpleName().equals("PredefinedCharacterClassContext")){
                //     return;
                // }

                // if(root.getClass().getSimpleName().equals("Extra_letters_allowed_inside_CCContext")){
                //     return;
                // }


                

                //  if(root.getClass().getSimpleName().equals("DoubleBoundaryMatchersContext")){
                //     return;
                // }


                String type = getCleanClassName(root.getClass().getSimpleName());
                if(type == null){
                    type = "NULL";
                }
                String content = "";


                ArrayList<ParseTree> children = new ArrayList<>();

                boolean isOnlyTerminals = true;
                boolean isAtom = false;
            
                for(int i = 0; i < root.getChildCount(); i++){
                    ParseTree child = root.getChild(i);
                    if(!(child instanceof TerminalNode)){
                        isOnlyTerminals = false;
                    }
                    if(child instanceof regex2englishParser.ExprHelperContext || child instanceof regex2englishParser.ExprContext){
                        isAtom = false;
                    }
                    content += child.getText();
                    children.add(child);
                }


                if(root.getClass().getSimpleName().equals("DoubleBoundaryMatchersContext")){

                    int index = getAtomIndex(input, root);

                    Atom caret = new Atom(root, null, "^", "Boundary Matcher Start", "category", 1);

                    Atom dollar_sign = new Atom(root, null, "$", "Boundary Matcher End", "category", 1);

                    caret.setIndex(index);
                    dollar_sign.setIndex(index + content.length() - 1);

                    atoms.add(caret);
                    atoms.add(dollar_sign);


                    return;
                }

                length = content.length();
                String category = "category";
               
                Atom atom = new Atom(root, children, content, type, category, length);
                if(isOnlyTerminals){
                    terminals.add(atom);
                }
                if(isAtom){
                    atom.setIsMolecule(isAtom);
                }


                int index = getAtomIndex(input, root);
                atom.setIndex(index);
                // System.out.println(atom.getIndex() + ")'" + atom.getContent() + "' - " + root.getClass().getSimpleName());

                atoms.add(atom);
            }


    
        }
       
    }    
    
        public static int getAtomIndex(String input, ParseTree node){

            
            String atomContent = getTerminals(node, "");
            int index = input.indexOf(atomContent);

            String leftAtomContent = "";
    
            while(instancesOfWithDuplicates(input, atomContent) != 1 && node != null && node.getParent() != null){
         

                while(node.getParent() != null && node.getParent().getChildCount() == 1){
                    node = node.getParent();
                }

                for(int i = 0; i < getChildIndex(node); i++){
    
                    leftAtomContent = getTerminals(node.getParent().getChild(i), "") + leftAtomContent;
    
                }
    
                if(instancesOfWithDuplicates(input, atomContent) == 0){
                    break;
                }
    
                node =  node.getParent();
    
                atomContent = getTerminals(node, "");
                index = input.indexOf(atomContent) + leftAtomContent.length();
    
            }
    
            return index;
        }
    
        public static int instancesOfWithDuplicates(String input, String substring){
    
            if(input.equals(substring)){
                return 1;
            }
    
            int count = 0;
    
            for(int i = 0; i < input.length() - substring.length();i++){
    
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
                entry("DoubleBoundaryMatchersContext", "Double Boundary Matchers Context"),
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
    
            return clean;
        }

 


// graveyard
//---------------------------------------------------    

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