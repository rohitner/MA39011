import java.io.*;

class test1
{
	public static void main(String args[]) throws Exception
	{
		// DataInputStream t = new DataInputStream(System.in);
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String i;
		Double a=0.0,b=0.0,result=0.0;
		i = t.readLine();
		for (int j = 0 ; j<i.length() ; j++)
		{
			if (i.charAt(j) == '+')
			{
				a = Double.valueOf(i.substring(0,j));
				b = Double.valueOf(i.substring(j+1));
				result = a + b;
			}
			else if (i.charAt(j) == '-')
			{
				a = Double.valueOf(i.substring(0,j));
				b = Double.valueOf(i.substring(j+1));
				result = a - b;
			}
			else if (i.charAt(j) == '*')
			{
				a = Double.valueOf(i.substring(0,j));
				b = Double.valueOf(i.substring(j+1));
				result = a * b;
			}
			else if (i.charAt(j) == '/')
			{
				a = Double.valueOf(i.substring(0,j));
				b = Double.valueOf(i.substring(j+1));

				result = a*1.0 / b;
			}
		}
		System.out.println(result);
	}
}