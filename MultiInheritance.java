class Pperson
{
	String name;
	int age;
	void set(String n,int a)
	{
		name=n;
		age=a;
		
	}
	public String toString()
	{
		return("Name: "+name+"\tAge: "+age+"\t");
	}
}
class Sstudent extends Pperson 
{
	int roll;
	void set(String n,int a,int r)
	{
		super.set(n, a);
		roll=r;
	}
	public String toString()
	{
		return super.toString()+"\tRoll: "+roll;
		
	}
	
}
class Teacher extends Pperson
{
	String subject;
	void set(String n,int a,String m)
	{
		set(n,a);
		subject=m;
		
	}
	public String toString()
	{
		return super.toString()+"\tSubject: "+subject;
		
	}
}
class Hod extends Teacher
{
	String dept;
	void set(String n,int a,String m,String d)
	{
		set(n,a,m);
		dept=d;
		
	}
	public String toString()
	{
		return super.toString()+"\tDepartment: "+dept;
		
	}
}
public class MultiInheritance {
	public static void main(String args[])
	{
		Sstudent s=new Sstudent();
		Teacher t=new Teacher();
		Hod h=new Hod();
		s.set("Dash",18,25);
		t.set("Nisarg",18,"Java");
		h.set("Jude",50,"Java","Comps");
		System.out.println("Student:"+s);
		System.out.println("Teacher:"+t);
		System.out.println("HOD:    "+h);
	}
	
	

}
