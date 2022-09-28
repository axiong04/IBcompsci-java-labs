 //(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxCheckRunner {
  public static void main(String[] args) {

    SyntaxChecker bob = new SyntaxChecker("(abc(*def)");
    System.out.println("(abc(*def) " + bob);
    SyntaxChecker joe = new SyntaxChecker("[{}]");
    System.out.println("[{}]" + joe);
    SyntaxChecker hw = new SyntaxChecker("[");
    System.out.println("[" + hw);
    SyntaxChecker how = new SyntaxChecker("[{<()>}]");
    System.out.println("[{<()>}]" + how);
    SyntaxChecker fred = new SyntaxChecker("{<html[value=4]*(12)>{$x}}");
    System.out.println("{<html[value=4]*(12)>{$x}}" + fred);
    SyntaxChecker a = new SyntaxChecker("[one]<two>{three}(four)");
    System.out.println("[one]<two>{three}(four)" + a);
    SyntaxChecker kevin = new SyntaxChecker("car(cdr(a)(b)))");
    System.out.println("car(cdr(a)(b)))" + kevin);
    SyntaxChecker clash = new SyntaxChecker("car(cdr{a}(b))");
    System.out.println("car(cdr(a)(b))" + clash);  
  }
}