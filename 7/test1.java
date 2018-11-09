import java.io.*;
import java.lang.*;

class test
{
	public static String powerset(int i)
	{	
		String s = "";
		while(i!=0)
		{
			s = i%2 + s;
			i = i/2;
		}
		return s;
		
	}

	public static void main(String[] args) throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		for(int i=0;i<Math.pow(2,n);i++)
		{
			String num = powerset(i);
			while(num.length()!=n) num = "0" + num;
			int l = 1;
			String subset = "{";
			for(int j=0;j<num.length();j++)
			{
				if(num.charAt(j)=='1') subset = subset + l + ",";
				l++;
			}
			subset = subset + "}";
			System.out.println(subset);
		}
	}
}