
import java.io.*;
import java.lang.*;

class point
{
	private float x, y;
	public point(float a, float b)
	{
		x = a;
		y = b;
	}
	public point(){}

	public void print()
	{
		System.out.println("("+x+","+y+")");
	}

	public void abc()
	{
		x = 2*x;
		y = 3*y;
	}

	public static point pqr(point a)
	{
		point t;
		t = new point(2*a.x,3*a.y);
		return t;
	}

	public void ghi(point a)
	{
		x = 2*a.x;
		y = 3*a.y;
	}

	public float getx()
	{
		return x;
	}

	public void fa()
	{
		x = x+y;
		y = 2*y;
	}

	public void fb()
	{
		y = x+y;
		x = 2*x;
	}

	public void fc()
	{
		float t = x;
		x = x + y;
		y = t*y;
	}

	public point fd()
	{
		return new point(x+y, x*y);
	}

	public point ga()
	{
		return new point(x+y, 2*y);
	}

	public static point gb(point p)
	{
		return new point(p.x+p.y,2*p.y);
	}

	public static point kb(point p)
	{
		return p.ga();
	}

	public void gc(point p)
	{
		x = p.x + p.y;
		y = 2*p.y;
	}

	public void kc(point p)
	{
		x = p.ga().x;
		y = p.ga().y;
	}

	public void gd(float k)
	{
		x = x+k;
		y = 2*y;
	}

	public point ha()
	{
		return ga();
	}

	public static abc faa(point p)
	{
		return new abc(p.x+p.y,p.x*p.y,p.x-p.y);
	}

	public static abc kaa(point p)
	{
		return abc.fab(p);
	}

	public void fad(abc q)
	{
		x = q.fac().x;
		y = q.fac().y;
	}

	public void kad(abc q)
	{
		x = q.fac().x;
		y = q.fac().y;
	}
}

class abc
{
	private float a, b, c;
	public abc(float p, float q, float r)
	{
		a = p;
		b = q;
		c = r;
	}

	public abc(){}

	public void print()
	{
		System.out.println("("+a+","+b+","+c+")");
	}

	public static abc fab(point p)
	{
		return new abc(point.faa(p).a,point.faa(p).b,point.faa(p).c);
	}

	public static abc kab(point p)
	{
		return point.faa(p);
	}

	public point fac()
	{
		return new point(a+b,b*c);
	}

	public point kac()
	{
		return fac();
	}
}

class hari
{
	public static void main(String args[])
	{
		// point a, b, c; float t; abc k;
		// a = new point(2,4);
		// a.print();
		// a.abc();
		// a.print();
		// a = new point(2,4);
		// b = point.pqr(a);
		// b.print();
		// a = new point(2,4);
		// c = new point();
		// c.ghi(a);
		// c.print();
		// t = a.getx();
		// System.out.println(t);
		// k = new abc(2,4,9);
		// k.print();

		// question 1
		// point a = new point(20,4);
		// a.fa();
		// a.print();

		// question 2
		// point a = new point(20,4);
		// a.fb();
		// a.print();

		// question 3
		// point a = new point(20,4);
		// a.fc();
		// a.print();

		// question 4
		// point a = new point(20,4);
		// point q = a.fd();
		// q.print();

		// question 6
		// point a = new point(20,4);
		// point q = a.ga();
		// q.print();

		// question 7
		// point a = new point(20,4);
		// point q = point.gb(a);
		// q.print();

		// question 8
		// point p = new point(20,4);
		// point q = point.kb(p);
		// q.print();

		// question 9
		// point p = new point(20,4);
		// point q = new point(1,1);
		// q.gc(p);
		// q.print();

		// question 10
		// point p = new point(20,4);
		// point q = new point(1,1);
		// q.kc(p);
		// q.print();

		// question 11
		// point p = new point(5, 7);
		// p.gd(12);
		// p.print();

		// question 12
		// point a = new point(2,4);
		// point c = a.ha();
		// a.print();
		// c.print();

		// question 13
		// point p = new point(20,4);
		// abc q = point.faa(p);
		// q.print();

		// question 14
		// point p = new point(20,4);
		// abc q = abc.fab(p);
		// q.print();

		// question 15
		// point p = new point(20,4);
		// abc q = point.kaa(p);
		// q.print();

		// question 16
		// point p = new point(20,4);
		// abc q = abc.kab(p);
		// q.print();

		// question 17
		// abc q = new abc(1,2,3);
		// point p = q.fac();
		// p.print();

		// question 18
		// abc q = new abc(1,2,3);
		// point p = new point(20,4); 
		// p.fad(q);
		// p.print();

		// question 19
		// abc q = new abc(1,2,3);
		// point p = q.kac(); 
		// p.print();

		// question 20
		// abc q = new abc(1,2,3);
		// point p = new point(20,4);
		// p.kad(q); 
		// p.print();
	}
}