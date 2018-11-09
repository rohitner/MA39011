import java.awt.*; import java.io.*;
import java.lang.*; import javax.swing.*;
import java.applet.*;

public class gr extends Applet
{
	int radius = 40;
	int x=1; String a = " ";
	public void init()
	{
		setBackground(Color.white);
		setForeground(Color.red);
	}

	public void paint(Graphics g)
	{
		x=1;
		radius-=10;
		do
		{
			try
			{
				BufferedReader o = new BufferedReader(new InputStreamReader(System.in));
				a = o.readLine();
			}
			catch(Exception t){}
			if(a.equals("ram"))
			{
				g.setColor(Color.red);
			}
			else if(a.equals("gagan"))
			{
				g.setColor(Color.green);
			}
			else if(a.equals("bimu"))
			{
				g.setColor(Color.blue);
			}
			else if(a.equals("hari"))
			{
				x = 0;
			}
			else
			{
				continue;
			}
			g.fillOval(60-radius,60-radius,2*radius,2*radius);
			radius+=5;
		}while(x>0);repaint();
	}
}
