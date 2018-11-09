import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class mouse extends Applet implements MouseListener, MouseMotionListener
{
	int p,q;
	public void init(){addMouseListener(this);addMouseMotionListener(this);}
	public void mouseClicked(MouseEvent m){p=m.getX();q=m.getY();repaint();}
	public void mouseEntered(MouseEvent m){}
	public void mouseExited(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseDragged(MouseEvent m){}
	public void mouseMoved(MouseEvent m){}
	public void paint(Graphics f){f.drawString("ram",p,q);}
}