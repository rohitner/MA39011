import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;

public class mouse extends Applet implements MouseListener, MouseMotionListener
{
	int p,q,r1=30,r2=30;
	public void init(){addMouseListener(this);addMouseMotionListener(this);}
	public void mouseClicked (MouseEvent m){p=m.getX();q=m.getY();repaint();}
	public void mouseEntered (MouseEvent m){}
	public void mouseExited  (MouseEvent m){}
	public void mousePressed (MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseDragged (MouseEvent m){}
	public void mouseMoved   (MouseEvent m){}
	public void paint(Graphics f){f.drawOval(100-r1,100-r1,2+*r1,2*r1);f.drawOval(200-r2,200-r2,2*r2,2*r2);}
}