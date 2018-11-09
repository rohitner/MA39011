import java.io.*;

class str
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String a,b,c; System.out.println("Give three string");a=t.readLine().trim();b=t.readLine().trim();c=t.readLine().trim();
		int iab=a.compareTo(b);int ibc=b.compareTo(c);int ica=c.compareTo(a);
			 if(iab> 0 && ibc>0)			System.out.println(1);
		else if(iab< 0 && ibc>0)			System.out.println(2);
		else if(ica> 0 && ibc<0)			System.out.println(3);
		else if(iab==0 && ibc==0 && ica==0)	System.out.println(0);
		else if(iab==0 && ibc>0)			System.out.println(-1);
		else if(ibc==0 && ica>0)			System.out.println(-2);
		else if(ica==0 && ibc>0)			System.out.println(-3);
	}
}