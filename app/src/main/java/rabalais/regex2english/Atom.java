package rabalais.regex2english;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.ArrayList;
import java.util.Comparator;


public class Atom {

    private ParseTree parentNode;
    private ArrayList<ParseTree> children;
    private String content = "";
    private String type = "";
    private String category = "";
    private boolean isMolecule = false;

    public static class AtomComparator implements Comparator<rabalais.regex2english.Atom>{
        public int compare(Atom atom1, Atom atom2){
            return Integer.compare(atom1.getIndex(), atom2.getIndex());
        }
    }


    public void setIsMolecule(boolean val){

        this.isMolecule = val;

    }

    public boolean getIsMolecule(){

        return this.isMolecule;

    }

    private int index = -1;
    private int length = -1;


    public Atom(ParseTree parentNode, ArrayList<ParseTree> children, String content, String type, String category, int length){
        this.parentNode = parentNode;
        this.children = children;
        this.content = content;
        this.type = type; 
        this.category = category;
        this.length = length; 
    }

    public void printAtom(){

        System.out.println("'" + this.content + "'| " + this.type + " - " + this.category + "("+ this.index + "," + this.length+")");

    }
    
    public int getIndex() {
        return index;
    }
  
    public ParseTree getParentNode() {
        return parentNode;
    }

    public ArrayList<ParseTree> getChildren() {
        return children;
    }

    public int getLength() {
        return length;
    }

    public String getContent() {
        return new String(content);
    }

    public String getType() {
        return new String(type);
    }

    public String getCategory() {
        return new String(category);
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
