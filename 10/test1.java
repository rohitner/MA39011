import java.awt.*; import java.io.*;
import java.lang.*; import javax.swing.*;
import java.applet.*;

public class test1 extends Applet
{
	int x,y; String a = " ";
	public void init()
	{
		setBackground(Color.white);
		setForeground(Color.red);
	}

	public void paint(Graphics g)
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
		double a1=0,a2=0,b1=x,b2=0,c1=x,c2=x,d1=0,d2=x,t1,t2;
		double a1t,a2t,b1t,b2t,c1t,c2t,d1t,d2t;
		double side = x;
		int count =0;
		while(side>y)
		{
			System.out.println(side);
			g.drawLine((int)a1,(int)a2,(int)b1,(int)b2);
			g.drawLine((int)b1,(int)b2,(int)c1,(int)c2);
			g.drawLine((int)c1,(int)c2,(int)d1,(int)d2);
			g.drawLine((int)d1,(int)d2,(int)a1,(int)a2);
			g.drawOval((int)(((a1+c1)/2)-side/2),(int)(((a2+c2)/2)-side/2),(int)side,(int)side);
			System.out.println(count);
			a1t=(a1+b1)/2;a2t=(a2+b2)/2;
			b1t=(b1+c1)/2;b2t=(b2+c2)/2;
			c1t=(c1+d1)/2;c2t=(c2+d2)/2;
			d1t=(d1+a1)/2;d2t=(d2+a2)/2;
			a1=a1t;a2=a2t;
			b1=b1t;b2=b2t;
			c1=c1t;c2=c2t;
			d1=d1t;d2=d2t;
			side = Math.sqrt((((a1-b1)*(a1-b1))+((a2-b2)*(a2-b2))));
			count ++;
		}
	}
}
