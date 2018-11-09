import java.io.*;

class test1
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String a; System.out.println("Give a string"); a = t.readLine().trim();
		System.out.println(("").compareTo(a)*-1);
	}
}