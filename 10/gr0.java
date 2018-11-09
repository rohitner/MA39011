import java.awt.*; import java.io.*;
import java.lang.*; import javax.swing.*;
import java.applet.*;

public class gr extends Applet
{
	int x = 70; String a = " ";
	public void init()
	{
		setBackground(Color.white);
		setForeground(Color.red);
	}

	public void paint(Graphics g)
	{
		// g.drawRect(10,100,50,70);
		// g.fillOval(10,100,50,70);
		// g.drawString("Kapil",x,7);
		// g.drawLine(100,20,400,70);
		// g.setColor(Color.blue);
		// g.drawOval(100,200,50,10);

		do
		{
			try
			{
				BufferedReader o = new BufferedReader(new InputStreamReader(System.in));
				a = o.readLine();
			}

			catch(Exception t){}
			x = Integer.parseInt(a);
			g.drawLine(x,100,x+50,200);
		}while(1==1);
	}
}
