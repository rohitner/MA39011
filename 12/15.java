import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;

public class mouse extends Applet implements MouseListener, MouseMotionListener
{
	int p,q,i=-1;String a=" ";
	public void init(){addMouseListener(this);addMouseMotionListener(this);
		try
		{
			BufferedReader o = new BufferedReader(new InputStreamReader(System.in));
			a = o.readLine();
		}
		catch(Exception t){}}
	public void mouseClicked(MouseEvent m){p=m.getX();q=m.getY();repaint();}
	public void mouseEntered(MouseEvent m){}
	public void mouseExited(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseDragged(MouseEvent m){}
	public void mouseMoved(MouseEvent m){}
	public void paint(Graphics f){if(i>=0){f.drawString(a.substring(i,i+1),p,q);}i++;}
}