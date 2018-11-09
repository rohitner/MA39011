import java.io.*;

class except
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		int num=0;
		try{num=Integer.parseInt(input);System.out.print("B");int test1=1/Math.max(0,(num-4));System.out.print("D");
			int test2=1/Math.min(0,(num-11));System.out.print("E");}
		catch(Exception e){System.out.print("A");}
		System.out.println("C");
	}
}