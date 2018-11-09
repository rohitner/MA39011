import java.io.*;

class except
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();String t="12345";
		try {int c = Integer.parseInt(a);System.out.print("A");t=t.substring(0,c);}
		catch(NumberFormatException e){System.out.print("B");}
		System.out.println("C");
	}

}