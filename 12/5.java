import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class mouse extends Applet implements MouseListener, MouseMotionListener
{
	int p,q,p1,q1;
	public void init(){addMouseListener(this);addMouseMotionListener(this);}
	public void mouseClicked(MouseEvent m){}
	public void mouseEntered(MouseEvent m){}
	public void mouseExited(MouseEvent m){}
	public void mousePressed(MouseEvent m){p=m.getX();q=m.getY();}
	public void mouseReleased(MouseEvent m){}
	public void mouseDragged(MouseEvent m){p1=m.getX();q1=m.getY();repaint();}
	public void mouseMoved(MouseEvent m){}
	public void paint(Graphics f){f.drawLine(p,q,p1,q1);}
}