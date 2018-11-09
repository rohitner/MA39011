import java.io.*;

class str
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String a,b; System.out.println("Give a string"); a = t.readLine();
		b = a.substring(2,5);
		System.out.println(b);

		String c; System.out.println("Give two strings");a=t.readLine();b=t.readLine();
		c=a+b;System.out.println(c);
	}
}