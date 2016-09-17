import java.util.Scanner;
public class AddRemove 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		StringBuffer st=new StringBuffer(s);
		System.out.println("Enter a Word:");
		String b=sc.next();
		String a[]=s.split(" ");
		int i=0;
		int count=0;
		while(i<a.length)
		{
			if(a[i].compareTo(b)==0)
			{
				s=s.replaceAll(b,"");
				System.out.println("Concated string is:"+s);
				count++;
			}
				i++;
		}
		if(count==0)
			{
			st.insert(s.indexOf(" ")," "+b);
			System.out.println("String is:"+st);
			}
	}
}