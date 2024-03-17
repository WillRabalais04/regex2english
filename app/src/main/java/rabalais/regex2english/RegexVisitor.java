package rabalais.regex2english;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;

import rabalais.regex2english.generated.*;

public class RegexVisitor extends regex2englishBaseVisitor<String>{

    ArrayList<String> components = new ArrayList<>();

    @Override
    public String visitStart(regex2englishParser.StartContext ctx){

        System.out.println("visitExpr ctx.getText(): " + ctx.getText());
        System.out.println("visitExpr ctx.toString(): " + ctx.toString());

    

        
        

        return visitChildren(ctx);
    }

    @Override public String visitZeroWidthAssertions(regex2englishParser.ZeroWidthAssertionsContext ctx) { 
        System.out.println("zerowidthassertion"); 
        return visitChildren(ctx); 
    }

    @Override
    public java.lang.String visitChildren(RuleNode node){

        System.out.println(node.getText());

        return "";

    }

}