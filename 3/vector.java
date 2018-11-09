import java.io.*;

class vector
{
	float i,j,k;
	public vector(float x, float y, float z){i=x;j=y;k=z;}
	public vector(){}
	public float dot(vector w){return i*w.i+j*w.j+k*w.k;}
	public void print(){System.out.println(i+"i+"+j+"j+"+k+"k");}
	public float mag(){return (float)Math.sqrt(dot(this));}
	public void cross(vector w, vector h){i=w.j*h.k-h.j*w.k;j=w.k*h.i-w.i*h.k;k=w.i*h.j-w.j*h.i;}
	public void divide(float c){i=i/c;j=j/c;k=k/c;}
	public void unit(){this.divide(this.mag());}
	public void direction(point p, point q){vector v = point.dir(p,q); i=v.i;j=v.j;k=v.k;}
}

class point
{
	float x,y,z;
	public point(float xc, float yc, float zc){x=xc;y=yc;z=zc;}
	public point(){}
	public static point mid(point q, point r){return new point((q.x+r.x)/2,(q.y+r.y)/2,(q.z+r.z)/2);}
	public static vector dir(point p, point q){return new vector(p.x-q.x,p.y-q.y,p.z-q.z);}
	public static double area(point p, point q, point r){vector a = dir(p,q); vector b = dir(p,r); vector c = new vector(); c.cross(a,b); return 0.5*c.mag();}
}

class babu
{
	public static  void main(String args[])
	{
		point a = new point(3,4,5);
		point b = new point(7,3,6);
		point c = new point(6,2,3);
		System.out.println(point.area(a,b,c));		
	}
}