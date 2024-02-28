package rabalais.regex2english;

import rabalais.regex2english.generated.*;

public class TestVisitor<String> extends regex2englishBaseVisitor<String>{

    @Override
    public String visitStart(regex2englishParser.StartContext ctx){

        System.out.println("visitExpr ctx.getText(): " + ctx.getText());
        System.out.println("visitExpr ctx.toString(): " + ctx.toString());
        return visitChildren(ctx);

    
    }

}