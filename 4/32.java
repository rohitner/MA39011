import java.io.*;

class str
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String a; System.out.println("Give a string"); a = t.readLine().trim();
		int i=a.indexOf(a.charAt(a.indexOf('x')-1));
		System.out.println(a.substring(0,i-1)+a.substring(i+1,i+2)+a.charAt(i)+a.substring(i-1,i)+a.substring(i+2));
	}
}