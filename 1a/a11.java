import java.io.IOException;

public class a11
{
  public static void main(String args[])
  {
	  int j=0;
	  
    int a=5;
    try
    {
    a=(int)System.in.read();
  }
    catch (IOException e)
    {
    	e.printStackTrace();
    }
    		System.out.println(a);
}
}