import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.Random;
/*
<applet code=Smile.class width=200 height=200>
</applet>
*/
public class Smile extends Applet implements Runnable
{
	Thread t;
	int i=0,j=0;
public void paint(Graphics g)
{
	g.setColor(Color.yellow);
	g.fillOval(100+i,100+j,80,80);
	g.setColor(Color.red);
	g.drawOval(100+i,100+j,80,80);
	g.setColor(Color.black);
	g.drawLine(150+i,125+j,160+i,125+j);
	g.drawLine(120+i,125+j,130+i,125+j);
	g.setColor(Color.red);
	g.drawArc(120+i,135+j,40,30,180,180);
	g.setColor(Color.green);
	g.drawLine(140+i,135+j,140+i,150+j);
}
public void init()
{
	t=new Thread(this);
	t.start();
}
public void run()
{
	Random r=new Random();
	while(true)
	{
		i=r.nextInt(getWidth());
		j=r.nextInt(getHeight());
	    repaint();
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){}
	}
}


}