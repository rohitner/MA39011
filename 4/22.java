import java.io.*;

class str
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String a; System.out.println("Give a string"); a = t.readLine().trim();
		int i=a.indexOf(' ');
		a=a.substring(0,i)+"x"+a.substring(i+1);
		int i1=a.indexOf(' ');
		a=a.substring(0,i)+" "+a.substring(i+1);
		a=a.substring(0,i-1)+a.substring(i1-1,i1)+" "+a.substring(i+1,i1-1)+a.substring(i-1,i)+" "+a.substring(i1+1);
		System.out.println(a);
	}
}