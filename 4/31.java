import java.io.*;

class str
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String a; System.out.println("Give a string"); a = t.readLine().trim();
		String b=a.substring(a.indexOf('x')+1);
		int i=b.indexOf('y');
		System.out.println(a.substring(0,a.indexOf('x')+1)+b.substring(0,i)+b.substring(i+1));
	}
}