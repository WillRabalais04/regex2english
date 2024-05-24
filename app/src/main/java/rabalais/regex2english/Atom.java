package rabalais.regex2english;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Comparator;


public class Atom {

    private ParseTree node;
    private String fullContent = "";
    private ArrayList<String> atomTypes = new ArrayList<>();
    private HashMap<Integer, String> contentAtIndex = new HashMap<>();
    private String terminal = "";

    public static class AtomComparator implements Comparator<rabalais.regex2english.Atom>{
        public int compare(Atom atom1, Atom atom2){
            return Integer.compare(atom1.getIndex(), atom2.getIndex());
        }
    }

    private int index = -1;
    private int fullContentLength = -1;

    public Atom(ParseTree node, String fullContent){
        this.node = node;
        this.fullContent = fullContent;
        // this.atomTypes.add(App.getCleanClassName(node.getClass().getSimpleName())); 
        this.fullContentLength = fullContent.length(); 
    }

    public void printAtom(){
        System.out.println(this.index + ")'" + this.fullContent + "' " + atomTypes.toString());
    }
    
    public int getIndex() {
        return index;
    }
  
    public ParseTree getNode() {
        return this.node;
    }

    public int getLength() {
        return fullContentLength;
    }

    public String getFullContent() {
        return new String(fullContent);
    }

    public String getAtomTypes() {

        String types = "[";

        for(String type: atomTypes){

            types += " '" + type + "'";

        }

        types += "]";

        return types;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setLength(int fullContentLength) {
        this.fullContentLength = fullContentLength;
    }

    public void setFullContent(String fullContent) {
        this.fullContent = fullContent;
    }

    public void addType(String type) {
        this.atomTypes.add(type);
    }

    public void setContentAtIndex(int index, String content){
        this.contentAtIndex.put(index, content);
    }

    public String getContentAtIndex(int index){
        return new String(contentAtIndex.get(index));
    }

    public String getTerminal(){
        return new String(this.terminal);
    }

    public void setTerminal(String terminal){
        this.terminal = terminal;
    }
}
