import java.util.Scanner;
import java.util.Vector;


public class VectorsMenu {
	static Scanner sc=new Scanner(System.in);
	String pname;
	int id;
	double price;
	void initialize(String n,int i,double p)
	{
		pname=n;
		id=i;
		price=p;
	}
	public String toString()
	{
		return (pname+" "+id+" "+price);
	}
	int getId()
	{
		return id;
	}
	public static void main(String[] args) {
		int choice;;
		Vector<VectorsMenu> v=new Vector<VectorsMenu>(20);
		System.out.println("\tVECTOR\n1)Vector Product\n2)Vector Search\n3)Vector Remover\n4)Display\n5)Exit");
		do
		{   System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter the name,Id,Price of product");
					VectorsMenu p=new VectorsMenu();
					p.initialize(sc.next(), sc.nextInt(), sc.nextDouble());
					v.add(p);
					break;
			case 2 : System.out.println("Enter the name of product:");
					String n=sc.next();
					for(int i=0;i<v.size();i++)
					{
						VectorsMenu o=v.elementAt(i);
						
						if(n.compareTo(o.pname)==0)
						{
							System.out.println(v.elementAt(i));	
						}
					}
					break;
			case 3:	 System.out.println("Enter the name of product");
						String g=sc.next();
						for(int i=0;i<v.size();i++)
						{
							VectorsMenu o=v.elementAt(i);
							
							if(g.compareTo(o.pname)==0)
							{
								v.remove(i);	
							}
						}
						break;
			case 4:System.out.println(v);
					break;
			case 5 :break;
			}
	
		}
		while(choice!=5);
		
	}

}


