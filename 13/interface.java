import java.io.*;import java.lang.*;
interface picture {float area();void set(float a, float b);void set(float a); float[] get();}
class rectangle implements picture
{
	public float p,q;
	public rectangle(float a, float b){p=a;q=b;}
	public float area(){return p*q;}
	public void set(float a, float b){p+=a;q+=b;}
	public void set(float a){};
	public float[] get(){System.out.println("Length="+p+", Breadth="+q); float[] a = {p,q}; return a;}
}
class circle implements picture
{
	public float r;public circle(float a){r=a;}
	public float area(){return(float)3.14*r*r;}
	public void set(float a, float b){}
	public void set(float a){r+=a;};
	public float[] get(){System.out.println("Radius="+r); float[] a = {r}; return a;}
}
class interfaces
{
	public static void main(String args[]) throws Exception
	{
		picture p[]=new picture[20];float a,b;int i,j,k,n=0;String s,t,u; char v,w;
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
				if(p[i] instanceof circle){p[i].set(10);System.out.println(p[i].area());}
				if(p[i] instanceof rectangle){p[i].set(5,7);System.out.println(p[i].area());}

			}
			if(w=='D')
			{
				v=s.charAt(1);i=(int)v-48;
				if(p[i] instanceof circle){p[i].get();}
				if(p[i] instanceof rectangle){p[i].get();}
			}
			if(w=='E')
			{
				i=s.indexOf(',');
				t=s.substring(1,i);j=Integer.parseInt(t);
				u=s.substring(i+1);k=Integer.parseInt(u);
				System.out.println(Math.max(p[j].get()[0],p[k].get()[0]));
				if((p[k] instanceof circle) && (p[j] instanceof circle)){if(p[k].get()[0]>p[j].get()[0]) p[j].set(p[k].get()[0]-p[j].get()[0]);}
				if((p[k] instanceof rectangle) && (p[j] instanceof rectangle)){
					if(p[k].get()[0]>p[j].get()[0]) p[j].set(p[k].get()[0]-p[j].get()[0],0);
					if(p[k].get()[1]>p[j].get()[1]) p[j].set(0,p[k].get()[1]-p[j].get()[1]);}
			}
		} while(1==1);
	}
}
