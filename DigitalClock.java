
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;
public class DigitalClock extends Applet implements Runnable
{
	String s;
	Thread t;
    public void  paint(Graphics g)
    {
    	g.setColor(Color.green);
    	g.setFont(new Font("New Times Roman",Font.ITALIC,25));
    	g.drawString(s,100,200);
    }
    public void run()
    {
    	while(true)
    	{
    		Calendar c=Calendar.getInstance();
    		s=c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND);
    		repaint();
    		try{
    			Thread.sleep(1000);
    		}
    		catch(Exception e)
    		{
    			
    		}
    	}
    }
    public void init()
    {
    	t=new Thread(this);
    	t.setDaemon(true);
    	t.start();
    }
}

