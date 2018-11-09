import java.io.*;

class kapil
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader o = new BufferedReader(new InputStreamReader(System.in));
		String in = o.readLine();
		String nums[] = in.split(" ");
		int num1;
		try
		{
			num1 = Integer.parseInt(nums[1])*Integer.parseInt(nums[1]);
		}
		finally
		{
			System.out.println(Integer.toString(Integer.parseInt(nums[0])*Integer.parseInt(nums[0])));
		}
		System.out.println(num1);
	}
}