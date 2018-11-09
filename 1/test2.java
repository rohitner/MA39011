import java.io.*;

class test2
{
	public static int palindrome(String i)
	{
		Integer count = 0, flag =0;
		char a[] = i.toCharArray();
		for (int j = 0 ; j<i.length() ; j++)
		{
			if(a[j] != a[i.length()-j-1])
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1) return 0;
		return 1;
	}

	public static void main(String args[]) throws Exception
	{
		BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
		String i= t.readLine();
		int p = palindrome(i);
		System.out.println(p);		
	}
}