import java.io.*;import java.lang.*;
abstract class picture {abstract float area();abstract void set();abstract void get();}
class rectangle extends picture
{
	public float p,q;
	public rectangle(float a, float b){p=a;q=b;}
	public float area(){return p*q;}
	public void set(){p+=5;;q+=7;}
	public void get(){System.out.println("Length="+p+", Breadth="+q);}
}
class circle extends picture
{
	public float r;public circle(float a){r=a;}
	public float area(){return(float)3.14*r*r;}
	public void set(){r+=10;}
	public void get(){System.out.println("Radius="+r);}
}
class nointerfaces
{
	public static void main(String args[]) throws Exception
	{
		picture p[]=new picture[20];float a,b;int i,n=0;String s,t,u; char v,w;
		BufferedReader o = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			s=o.readLine();w=s.charAt(0);
			if(w=='C')
			{
				n=n+1;t=s.substring(1);a=Float.parseFloat(t);
				p[n]=new circle(a);System.out.println(n+" is circle of radius "+a);
			}
			if(w=='R')
			{
				n=n+1;
				i=s.indexOf(',');
				t=s.substring(1,i);a=Float.parseFloat(t);
				u=s.substring(i+1);b=Float.parseFloat(u);
				p[n]=new rectangle(a,b);
				System.out.println(n+" is a rectangle of length="+a+" breadth="+b);
			}
			if(w=='A')
			{
				v=s.charAt(1);i=(int)v-48;
				System.out.println(p[i].area());
			}
			if(w=='B')
			{
				v=s.charAt(1);i=(int)v-48;
				p[i].set();System.out.println(p[i].area());
			}
			if(w=='D')
			{
				v=s.charAt(1);i=(int)v-48;
				if(p[i] instanceof circle){p[i].get();}
				if(p[i] instanceof rectangle){p[i].get();}
			}

		} while(1==1);
	}
}
