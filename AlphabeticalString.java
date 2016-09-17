import java.util.Scanner;
public class AlphabeticalString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		String a[];
		System.out.println("Enter no of Strings:");
		int n=sc.nextInt();
		a=new String[n];
		sc.nextLine();
		for (i=0;i<a.length;i++)
			a[i]=sc.nextLine();
		for (i=1;i<a.length;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
			if( a[j].compareTo(a[j+1])>0)
				{
					String t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
			for(String x:a)
				System.out.println(x);
	}

}
