import java.io.*;
import java.lang.*;

class a //inheritance supports overloading in java but not in c++
{
	void g()
	{
		System.out.println("anil");
	}
}

class b extends a
{
	void g(int w)
	{
		System.out.println(10*w);
	}
}

class kapil
{
	public static void main(String[] args) {
		b y;
		y = new b();
		y.g(2);
	}
}