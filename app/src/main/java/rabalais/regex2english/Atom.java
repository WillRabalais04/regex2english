package rabalais.regex2english;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.TreeMap;


public class Atom {

    private ParseTree node;
    private String fullContent = "";
    private LinkedHashSet<String> atomTypes = new LinkedHashSet<>();
    private TreeMap<Integer, String> content = new TreeMap<>();
    private String terminal = "N/A"; // if null then, the atom is not a terminal

    private int fullContentLength = -1;

    public Atom(ParseTree node){
        this.node = node;
        this.fullContent = node.getText();
        this.atomTypes.add(App.getCleanClassName(node.getClass().getSimpleName())); 
        this.fullContentLength = fullContent.length(); 
    }

    public void printAtom(){

        // Collections.sort(content);
        String term = (this.terminal == "") ? "" : "(" + this.terminal + ")"; 

        for(Integer index: content.keySet()){
            System.out.println(index + ")'" + content.get(index) + "' " + term + " | Categories: " + atomTypes.toString());
        }

    }
    
    public int getIndex() {
        return content.firstKey();
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

    public void setLength(int fullContentLength) {
        this.fullContentLength = fullContentLength;
    }

    public void setFullContent(String fullContent) {
        this.fullContent = fullContent;
    }

    public void addType(String type) {
        this.atomTypes.add(type);
    }

    public void addContent(int index, String content){
        this.content.put(index, content);
    }

    public String getContent(int index){
        return new String(content.get(index));
    }

    public String getTerminal(){
        return new String(this.terminal);
    }

    public void setTerminal(String terminal){
        this.terminal = terminal;
    }
}
