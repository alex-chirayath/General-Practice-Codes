
public class Palindrome {

	public static void main(String[] args) {
		int m=1;
		int i;
		System.out.println("No of words:"+args.length);
		for(i=0;i<args.length;i++)
		{System.out.print(args[i]+" ");
			int n=args.length;
			
			if(!args[i].equals(args[n-1-i]))
			{
				m=0;
			}
		}if (m==1)
		
			System.out.println("\nPalindrome");
		else
			System.out.println("\nNot a palindrome");
		
		
	}

}
