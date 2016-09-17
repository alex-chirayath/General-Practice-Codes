
import java.io.*;
class Head
{
void leap(int yr)
{
if((yr%4==0&&yr%100!=0)||(yr%4==0&&yr%100==0&&yr%400==0))
System.out.println("It is a Leap Year");
else
System.out.println("It is not a Leap Year");
}
}
class Leap
{
public static void main(String args[])throws IOException
{
Head obj=new Head();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the year");
int yr=Integer.parseInt(br.readLine());
obj.leap(yr);
}
}