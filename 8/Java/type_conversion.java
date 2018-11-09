import java.io.*;
import java.lang.*;

class a
{
	void g(int a)   {System.out.println(a+2);}
	// void g(float a) {System.out.println(a+3);}
	// void g(double a){System.out.println(a+4);}

	public static void main(String[] args) throws Exception
	{
		a x=new a();
		int p=5;
		float q=5;
		double r=5;
		x.g(q);
	}
}