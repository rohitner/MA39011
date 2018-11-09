import java.awt.*; import java.io.*;
import java.lang.*; import javax.swing.*;
import java.applet.*;

public class gr extends Applet
{
	int x,y; String a = " ";
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
			String[] arrOfStr = a.split(" ", 2); 
			x = Integer.parseInt(arrOfStr[0]);
			y = Integer.parseInt(arrOfStr[1]);
			g.drawRect(x,y,100,100);
		}while(1==1);
	}
}
