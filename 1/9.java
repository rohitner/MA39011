import java.io.*;

class q9
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String i;
		i = t.readLine();
		for (int j = 0 ; j<i.length() ; j++)
        {
        	if (i.charAt(j) == 'x')
	        {
				System.out.println(i.charAt(j+1));
				break;
	        }
        }
	}
}