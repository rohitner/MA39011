import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class mouse extends Applet implements MouseListener, MouseMotionListener
{
	int p=0,q=0,p1=0,q1=0;
	public void init(){addMouseListener(this);addMouseMotionListener(this);}
	public void mouseClicked(MouseEvent m){p1=p;q1=q;p=m.getX();q=m.getY();repaint();}
	public void mouseEntered(MouseEvent m){}
	public void mouseExited(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseDragged(MouseEvent m){}
	public void mouseMoved(MouseEvent m){}
	public void paint(Graphics f){f.drawOval(p1-5,q1-5,10,10);}
}