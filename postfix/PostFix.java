// A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Character;
import java.util.Arrays;
public class PostFix
{
	public double calc(String expression)
	{
    Stack<Double> stack = new Stack<>();
    for(int i = 0; i < expression.length(); i++){
      
    if(Character.isDigit(expression.charAt(i)))
    {
      int num = expression.charAt(i)-48;


      stack.push((double)num);

    }
      else if (Character.isDigit(expression.charAt(i))!=true)
    {
      if(expression.charAt(i)=='+')
      {
        double sum = stack.pop() + stack.pop();
        stack.push(sum);
      }
      if(expression.charAt(i)=='-')
      {
        double number1 = stack.pop();
        double number2 = stack.pop();
        double difference = number2 - number1;
        stack.push(difference);
      }
      if(expression.charAt(i)=='*')
      {
        double product = stack.pop() * stack.pop();
        stack.push(product);
      }
      if(expression.charAt(i)=='/')
      {
        double num1 = stack.pop();
        double num2 = stack.pop();
        double dividend = num2 / num1;
        stack.push(dividend);
      }
    }
    }
		return stack.pop();
	}
}