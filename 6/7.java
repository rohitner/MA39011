import java.io.*;

class except
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();int c;
		try{c = Integer.parseInt(a);System.out.print("A");}
		catch(Exception e){}
		System.out.print("B");
		System.out.println("C");
	}

}