//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;

	public SyntaxChecker()
	{
    symbols = new Stack<Character>();
    exp = "";
	}

	public SyntaxChecker(String s)
	{
      symbols = new Stack<Character>();
    setExpression(s);
	}
	
	public void setExpression(String s)
	{
    exp = s;
	}

	public boolean checkExpression()
	{
    char cha; 
    for(int i = 0; i < exp.length(); i++)
    {
      cha=exp.charAt(i);
      if(cha=='('||cha=='['||cha=='<'||cha=='{') 
      {
        symbols.push(cha);
      }
      if(cha==')'||cha==']'||cha=='>'||cha=='}') 
      {
        if(symbols.size()!=0){
          if((char)symbols.peek()+1==cha)
          {
            symbols.pop();
          }
          else
          {
            return false;
          }
        }
      }
    }
		return true;
	}
  public String toString()
  {
    if(checkExpression())
    {
      return "is incorrect";
    }
    return "is correct";
  }
}