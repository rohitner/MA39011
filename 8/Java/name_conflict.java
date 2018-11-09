import java.io.*;
import java.lang.*;

class a
{
	a() // if replaced by b() gives error
	{
		System.out.println("h");
	}
	void a()
	{
		System.out.println("a");
	}
}

class kapil
{
	public static void main(String[] args) throws Exception {
		a t = new a();
		t.a();
	}
}