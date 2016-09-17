//C12-25, Date-16.8.13
class prime
{int i,j;
void pr()

{
for(i=0;i<=100;i++)
{
for(j=2;j<=i;j++)
{
if(i%j==0)
break;
}
if(i==j)
System.out.println("Prime no.="+i);
}
}
}

class Primenumber
{
public static void main(String args[])
{
prime obj=new prime();
obj.pr();
}
}