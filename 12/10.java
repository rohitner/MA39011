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
	public void mouseReleased(MouseEvent m){p1=m.getX();q1=m.getY();repaint();}
	public void mouseDragged(MouseEvent m){}
	public void mouseMoved(MouseEvent m){}
	public void paint(Graphics f){int x,y;if((p-p1)<0) x=p; else x=p1;if((q-q1)<0) y=q; else y=q1;f.drawRect(x,y,Math.abs(p1-p),Math.abs(q1-q));}
}