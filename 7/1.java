import java.io.*;
import java.lang.*;

class f
{
	public static String delkth(String a, int k)
	{
		return a.substring(0,k)+a.substring(k+1);
	}

	public static String delfirst(String a)
	{
		return delkth(a,a.indexOf('x'));
	}

	public static String delfirsttwo(String a)
	{
		return delfirst(delfirst(a));
	}

	public static int secloc(String a)
	{
		return delfirst(a).indexOf('x') + 1;
	}

	public static int firstloc(String a)
	{
		return secloc("x"+a) - 1;
	}

	public static String delfirstk(String a, int k)
	{
		for(int i=0;i<k;i++)
		{
			a = delfirst(a);
		}

		return a;
	}

	public static String delall(String a)
	{
		while(a.indexOf('x')!=-1)
		{
			a = delfirst(a);
		}

		return a;
	}

	public static int count(String a)
	{
		return a.length() - delall(a).length();
	}

	public static int loc(String a, int k)
	{
		return k - 1 + delfirstk(a,k-1).indexOf('x');
	}

	public static String aft(String a, char b)
	{
		String after = "";
		
		while(a.indexOf(b)!=-1)
		{
			int i = a.indexOf(b);
			a = delkth(a,i);
			after = after+a.charAt(i);
		}

		return after;
	}

	public static String mr(String a)
	{
		if(delkth(a,0).indexOf(a.substring(0,1))!=-1)
		{
			return "yes";
		}
		else
		{
			return "no";
		}
	}

	public static String more(String a)
	{
		String[] arr = a.split(" ",-1);
		String ans = "";
		for(String i : arr)
		{
			if(mr(i) == "yes") ans = ans + " " + i;
		}

		return ans;
	}

	public static int cnt(String a, String b)
	{
		int count = 0;
		char[] arr = a.toCharArray();
		for(char i : arr)
		{
			if(mr(i+b)=="yes") count++;
		}

		return count;
	}

	public static int length(String a)
	{
		return cnt(a,a);
	}

	public static String subset(String a, String b)
	{
		if(cnt(a,b)==length(a)) return "yes";
		return "no";
	}

	public static String subset_loop(String a, String b)
	{
		char[] arr = a.toCharArray();
		int count = 0;
		for(char i : arr)
		{
			if(mr(i+b)=="yes") count++;
		}
		if(count==length(a)) return "yes";
		return "no";
	}

	public static String every_first(String a)
	{
		String[] arr = a.split(" ",-1);
		String ans = "";
		for(String i : arr)
		{
			ans = ans + i.substring(0,1);
		}
		return ans;
	}

	public static String present(String a, String b)
	{
		String[] arr = a.split(" ",-1);
		String ans = "";
		for(String i : arr)
		{
			if(subset(i,b)=="yes") ans = ans + i + " ";
		}
		return ans;

	}

	public static String presentfirst(String a, String b)
	{
		return every_first(present(a,b).trim());
	}

	public static String prfirst(String a, String b)
	{
		String[] arr = a.split(" ",-1);
		String ans = "";
		for(String i : arr)
		{
			if(subset(i.substring(1),b)=="yes" && length(i)!=1) ans = ans + i + " ";
		}
		return every_first(ans.trim());
	}
}

class function
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		int c = Integer.parseInt(bf.readLine());
		System.out.println(f.delkth(a,c));
	}
}