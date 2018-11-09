import java.io.*;

class str
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String a,b; System.out.println("Give two string");a=t.readLine().trim();b=t.readLine().trim();
		int i=a.compareTo(b);
		if(i>=0){ System.out.println(a);System.out.println(b); }
		else{ System.out.println(b);System.out.println(a); }
	}
}