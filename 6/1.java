import java.io.*;

class except
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();int c;
		try{c = Integer.parseInt(a);}
		catch(Exception e){c=0;}
		System.out.println(2*c);
	}

}