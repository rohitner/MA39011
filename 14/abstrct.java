import java.io.*;
class abstrct
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader u = new BufferedReader(new InputStreamReader(System.in));
		queue t = new queue();
		String a,b;char p;
		do
		{
			a = u.readLine();
			p = a.charAt(0);
			if(p=='A')
			{
				b = a.substring(1);
				t.put(b);
			}
			if(p=='B') t.take();
			if(p=='C') t.find();
			if(p=='D') t.pt();
		}while(1==1);
	}
}

class queue
{
	private String a[] = new String[10000];
	private int front = 0, rear = 0;
	public void put(String e){ a[rear] = e; rear++;	}
	public String take(){ front++; return a[front-1]; }
	public void find(){ System.out.println(a[front]); }
	public int size(){ return rear-front; }
	public void pt(){ int i;
		for(i=front;i<rear;i++)
			System.out.print(a[i]+",");
		System.out.println();
	}
}

class stack
{
	private queue g;
	public stack(){ g = new queue(); }
	public void put(String e){ g.put(e); }
	public String take()
	{
		int i; String k;
		for(i=1;i<g.size();i++)
		{
			k = g.take(); g.put(k);
		}
		return g.take();
	}
	public void find()
	{
		int i; String k="";
		for(i=1;i<=g.size();i++)
		{
			k = g.take();
			g.put(k);
		}
		System.out.println(k);
	}
	public void pt(){ g.pt();}
}