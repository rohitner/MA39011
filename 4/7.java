import java.io.*;

class str
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String a; System.out.println("Give a string"); a = t.readLine();
		System.out.println(a.substring(0,4)+a.substring(10,11)+a.substring(5,10)+a.substring(4,5)+a.substring(11));
	}
}