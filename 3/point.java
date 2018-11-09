import java.io.*;

class point
{
	float x,y;
	public point(float xc, float yc){x=xc;y=yc;}
	public point(){}
	public void mid(point q){x=(x+q.x)/2;y=(y+q.y)/2;}
	public void print(){System.out.println("("+x+","+y+")");}
	public void intersection(line g,line h){x=(g.b*h.c-h.b*g.c)/(g.a*h.b-h.a*g.b);y=(g.c*h.a-h.c*g.a)/(g.a*h.b-h.a*g.b);}
	public void intersection(point a,point b,point c,point d){point p = new point();line l1= new line(); l1.eq(a,b); line l2=new line(); l2.eq(c,d);p.intersection(l1,l2);x=p.x;y=p.y;}
}

class line
{
	float a,b,c;
	public line(float al,float bl,float cl){a=al;b=bl;c=cl;}
	public line(){}
	public void print(){System.out.println(a+"x+"+b+"y+"+c+"=0");}
	public void eq(point p, point q){a=(q.y-p.y)/(q.x-p.x);b=-1;c=p.y-a*p.x;}
	public static float distance(point p, line l){return (float)(Math.abs(l.a*p.x+l.b*p.y+l.c)/Math.sqrt(l.a*l.a+l.b*l.b));}
}

class circle
{
	point c;float r;
	public circle(point cent, float rad){c=cent;r=rad;}
	public circle(){}
	public void print(){System.out.println("x^2+y^2-"+2*c.x+"x-"+2*c.y+"y+"+(c.x*c.x+c.y*c.y-r*r)+"=0");}
	public void form(float g,float h,float k){c = new point(-g/2,-h/2);r=(float)Math.sqrt((g*g+h*h)/4-k);}
	public void pt(){System.out.println("c=("+c.x+","+c.y+")");System.out.println("r="+r);}
	public float chord(line b){float d=line.distance(c,b);return 2*(float)Math.sqrt(r*r-d*d);}
	public void intersection(float b){float d = r*r-(b-c.x)*(b-c.x); if(d<0){System.out.println("No intersection.");}else{float p1=c.y+(float)Math.sqrt(d);float p2=c.y-(float)Math.sqrt(d);System.out.println("The points are ("+b+","+p1+") and ("+b+","+p2+").");}}
}

class babu
{
	public static void main(String args[])
	{
		point a = new point(7,2);
		line l = new line(5,12,10);
		circle c = new circle(a,5);
		c.intersection(10);
	}
}