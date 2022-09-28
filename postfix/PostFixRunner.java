// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFixRunner
{
	public static void main ( String[] args )
	{
		PostFix test = new PostFix();
		System.out.println("2 7 + 1 2 + + = "+test.calc("2 7 + 1 2 + +"));

		System.out.println("1 2 3 4 + + + = "+test.calc("1 2 3 4 + + +"));

    System.out.println("9 3 * 8 / 4 + = "+test.calc("9 3 * 8 / 4 +"));

		System.out.println("3 3 + 7 * 9 2 / + = "+test.calc("3 3 + 7 * 9 2 / +"));

		System.out.println("9 3 / 2 * 7 9 * + 4 - = "+test.calc("9 3 / 2 * 7 9 * + 4 -"));
		
		System.out.println("5 5 + 2 * 4 / 9 + = "+test.calc("5 5 + 2 * 4 / 9 +"));
	
	}
}