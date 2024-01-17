public class TestVisitor extends regex2englishBaseVisitor<Integer>{

    @Override
    public Integer visitStart(regex2englishParser.StartContext a){

        return 2;

    }

}