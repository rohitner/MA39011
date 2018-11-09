import java.io.*;
import java.lang.*;

class stack
{
	protected String s[]=new String[10];int sp=1; public void put(String e) {s[sp]=e;sp++;}
	public String take() {sp--; return s[sp];}	  public String top() {return s[sp-1];}
	public void pt(){int i; for(i=1;i<sp;i++) System.out.print(s[i]+" ");}
}

class queue extends stack
{
	public String take() {String min=s[1]; for(int i=1;i<sp;i++){ s[i]=s[i+1]; }sp--; return min;}
	public String top() {return s[1];}
}

class pqueue extends stack
{
	public void put(String e)
	{	
		if(sp==1){super.put(e); return;}
		if(Integer.parseInt(e)>Integer.parseInt(s[sp-1])){super.put(e);}
		else{for(int l=1;l<sp;l++){if(Integer.parseInt(e)<Integer.parseInt(s[l]))
			{int i; for(i=sp;i>l;i--) s[i]=s[i-1]; s[l]=e;sp++;break;}}}
	}
}

class inherit
{
	public static void main(String args[]) throws Exception
	{
		String a=" ",b; int i; queue x = new queue();
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			a=t.readLine();i=a.indexOf(' '); if(i!=-1) b=a.substring(0,i); else b=a;
			if(b.compareTo("put")==0) x.put(a.substring(i+1));
			if(b.compareTo("take")==0) System.out.println("The taken element "+x.take());
			if(b.compareTo("top")==0) System.out.println("The first element "+x.top());
			if(b.compareTo("print")==0) {x.pt();System.out.println();}
		} while (b.compareTo("exit")!=0);
	}
}