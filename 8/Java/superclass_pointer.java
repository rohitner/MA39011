import java.io.*;
import java.lang.*;

class a
{
	void g()
	{
		System.out.println("anil");
	}
}
class b extends a
{
	void g()
	{
		System.out.println("hari");
	}
}

class kapil
{
	public static void main(String[] args) {
		a x;
		b y;
		y = new b();
		x = y;
		x.g();
	}
}