import java.io.*;

class str
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String a; System.out.println("Give a string"); a = t.readLine().trim();
		int i=a.indexOf('x');
		a=a.substring(0,i)+" "+a.substring(i+1);
		int i1=a.indexOf('x');
		a=a.substring(0,i)+"x"+a.substring(i+1);
		int b=a.indexOf(a.charAt(i1+1));
		System.out.println(a.substring(0,b)+a.charAt(i-1)+a.substring(b+1,i1+1)+a.charAt(b)+a.substring(i1+2));
	}
}