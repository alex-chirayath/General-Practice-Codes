
public class PythagorasTriplets 
	{
	  public static void main(String args[])
	  {
	    System.out.println("Pythagoras Triplets are:");
		 for(int a=1;a<=40;a++)
	    {
	      for(int b=1;b<=40;b++)
	      {
	        for(int c=1;c<=40;c++)
	        {
	          if(a*a + b*b == c*c)
	            System.out.println(a+" "+b+" "+c);
	        }
	      }
	    }
	  }
	}
