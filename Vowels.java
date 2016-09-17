import java.util.Scanner;
public class Vowels 
{
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		char a[]=s.toCharArray();
		int i=0;
		int count=0;
		while(i<a.length)
		{
			if (a[i]=='A'||a[i]=='a'||a[i]=='E'||a[i]=='e'||a[i]=='I'||a[i]=='i'||a[i]=='O'||a[i]=='o'||a[i]=='U'||a[i]=='u')
			{
			count++;
			System.out.println("Vowels is:"+a[i]);
			}
			i++;
		}
		System.out.println("No of Vowels Are:"+count);
	}
}
