import java.io.*;

class link
{
	float d;
	link next;
}

class babu
{
	public static void main(String args[])
	{
		link a,b,c,d,e;
		a=new link();b=new link();c=new link();d=new link();e=new link();
		a.d=12;b.d=17;c.d=29;
		a.next=b;b.next=c;c.next=null;
		link i = a;
		while(i!=null)
		{
			System.out.println(i.d);
			i=i.next;
		}
	}
}
