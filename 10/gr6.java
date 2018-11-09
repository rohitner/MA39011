import java.awt.*; import java.io.*;
import java.lang.*; import javax.swing.*;
import java.applet.*;

public class gr extends Applet
{
	String a = " ";
	public void init()
	{
		setBackground(Color.white);
		setForeground(Color.red);
	}

	public void paint(Graphics g)
	{
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
			g.fillOval(60,60,40,40);
		}while(1==1);
	}
}
