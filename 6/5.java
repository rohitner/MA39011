import java.io.*;

class except
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();String t="1234";
		try{int c = Integer.parseInt(a);System.out.print("A");}
		catch(Exception e){int f=a.length();try{t.substring(0,f);System.out.print("B");}catch(Exception e1){System.out.print("D");}}
		System.out.println("C");
	}
}