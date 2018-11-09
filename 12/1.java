import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class mouse extends Applet implements MouseListener, MouseMotionListener
{
	int p,q;
	public void init(){addMouseListener(this);addMouseMotionListener(this);}
	public void mouseClicked(MouseEvent k){}
	public void mouseEntered(MouseEvent k){repaint();}
	public void mouseExited(MouseEvent m){p=m.getX();q=m.getY();}//if(p>=350) p=p-5; else p = p+5; if(q>=150) q=q-5; else q=q+5;}
	public void mousePressed(MouseEvent n){}
	public void mouseReleased(MouseEvent k){}
	public void mouseDragged(MouseEvent p){}
	public void mouseMoved(MouseEvent e){}
	public void paint(Graphics f){f.drawOval(p-10,q-10,10,10);}
}