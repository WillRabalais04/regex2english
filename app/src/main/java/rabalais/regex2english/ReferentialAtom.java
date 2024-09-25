package rabalais.regex2english;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.ArrayList;

public class ReferentialAtom extends Atom{

    private Atom ref1 = null;
    private Atom ref2 = null;

    public ReferentialAtom(ParseTree node, Atom ref1, Atom ref2){
        super(node);
        this.ref1 = ref1;
        this.ref2 = ref2;
    }

}