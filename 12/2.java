import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class mouse extends Applet implements MouseListener, MouseMotionListener
{
	int p,q;
	public void init(){addMouseListener(this);addMouseMotionListener(this);}
	public void mouseClicked(MouseEvent k){p=k.getX();q=k.getY();repaint();}
	public void mouseEntered(MouseEvent k){}
	public void mouseExited(MouseEvent m){}
	public void mousePressed(MouseEvent n){}
	public void mouseReleased(MouseEvent k){}
	public void mouseDragged(MouseEvent p){}
	public void mouseMoved(MouseEvent e){}
	public void paint(Graphics f){f.drawOval(p-70,q-70,140,140);}
}