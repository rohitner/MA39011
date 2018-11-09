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
		String a= t.readLine().trim();
		int l = (a+" ").lastIndexOf(' ');
		String max=a.substring(0,1);
		int maxl=1;
		for(int i=1;i<=l;i++)
		{
			for(int j=0;j<=l-i;j++)
			{
				String temp=a.substring(j,j+i);
				if(palindrome(temp)==1)
				{
					if(temp.length()>maxl) max=temp;
				}
			}
		}
		System.out.println(max);
	}
}