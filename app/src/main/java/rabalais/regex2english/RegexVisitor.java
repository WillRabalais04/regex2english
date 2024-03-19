package rabalais.regex2english;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;

import rabalais.regex2english.generated.*;

public class RegexVisitor extends regex2englishBaseVisitor<String>{

    ArrayList<String> components = new ArrayList<>();

    @Override
    public String visitExprHelper(regex2englishParser.ExprHelperContext ctx) {
        
        ParseTree child;
    
        if(ctx.getChildCount() == 1 && ctx instanceof RuleNode && !(ctx.getChild(0) instanceof TerminalNode)){
            child = ctx.getChild(0);
            ctx.removeLastChild();
        }else{
            return visitChildren(ctx);
        }
            
        while(child != null && child.getChildCount() == 1){
            child = (ParseTree)child.getChild(0);
        }

        ctx.addAnyChild(child);


        return visitChildren(ctx);
        
    }

    
    @Override public String visitZeroWidthAssertions(regex2englishParser.ZeroWidthAssertionsContext ctx) { 
            
        ParseTree child = ctx.getChild(0);
        System.out.println("1");

        return visitChildren((RuleNode)child); 
    }

    // @Override public String visitChildren(regex2englishParser.ZeroWidthAssertionsContext ctx) { 
            
    //     ParseTree child = ctx.getChild(0);

    //     return visitChildren((RuleNode)child); 
    // }

}