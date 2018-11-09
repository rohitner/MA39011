import java.io.*;
import java.lang.*;

class a
{
	int p,q;
}

class kapil
{
	public static void main(String[] args) throws Exception{
		a x,y;
		x = new a();
		y = new a();
		x.p = 3;
		y = x;
		y.p=4;
		System.out.println(x.p);
	}
}