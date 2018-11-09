import java.io.*;

class str
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String a; System.out.println("Give a string"); a = t.readLine();
		int i=a.indexOf('x');
		a=a.substring(0,i)+"a"+a.substring(i+1);
		int i1=a.indexOf('x');
		a=a.substring(0,i)+"x"+a.substring(i+1);
		System.out.println(a.substring(0,i1)+"y"+a.substring(i1+1));
	}
}