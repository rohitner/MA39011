import java.io.*;

class str
{
	public static void main(String args[]) throws Exception
	{
 		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String a; System.out.println("Give a string"); a = t.readLine();
		System.out.println(a.substring(4)+a.substring(3,4)+a.substring(0,3));
	}
}