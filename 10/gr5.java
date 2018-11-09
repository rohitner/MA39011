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
			String[] arrOfStr = a.split(" ", 4);
			if(arrOfStr[0].equals("square"))
			{
				int x = Integer.parseInt(arrOfStr[1]);
				g.drawRect(100-(x/2),100-(x/2),x,x);
			}
			if(arrOfStr[0].equals("rectangle"))
			{
				int a = Integer.parseInt(arrOfStr[1]);
				int b = Integer.parseInt(arrOfStr[2]);
				g.drawRect(100,100,a,b);
			}
			if(arrOfStr[0].equals("circle"))
			{
				int a = Integer.parseInt(arrOfStr[1]);
				int b = Integer.parseInt(arrOfStr[2]);
				int c = Integer.parseInt(arrOfStr[3]);
				g.drawOval(a-c,b-c,2*c,2*c);
			}
		}while(1==1);
	}
}
