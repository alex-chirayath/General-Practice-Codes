import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class MyApplet extends Applet implements Runnable{
String s="Hello";
Thread t;
int x=200;
	public void init()
{
	t=new Thread(this);
	t.setDaemon(true);
	t.start();
}
public void run()
{
		while(true)
		{
			try
			{
				repaint();
				Thread.sleep(10);
			}
			catch (Exception e){}
		}
}
public void paint(Graphics g)
{	g.setColor(Color.red);
	g.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,25));
	g.drawString(s, x, 100);
	x=(x+1)%getWidth();
	s=s.charAt(s.length()-1)+s.substring(0,s.length()-1);
}
}