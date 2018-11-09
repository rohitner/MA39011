import java.io.*;
import java.lang.*;
import java.util.Stack;

class stack
{
	public static void main(String args[]) throws Exception
	{
		Stack<String>s = new Stack<String>();
		Stack<String>t = new Stack<String>();
		BufferedReader u = new BufferedReader(new InputStreamReader(System.in));
		String a, b, c; char p, q; int i, j, size = 0;
		do
		{
			a = u.readLine();
			p = a.charAt(0);
			if(p=='A')
			{
				b = a.substring(1);
				s.push(b);
				size = size + 1;
			}
			if(p=='B')
			{
				s.pop();
				size = size - 1;
			}
			if(p=='C')
			{
				b = s.pop();
				System.out.println(b);
				s.push(b);
			}
			if(p=='D')
			{
				for(i = 1;i <= size; i++)
				{
					b = s.pop();
					t.push(b);
				}
				for(i = 1;i <= size; i++)
				{
					b = t.pop();
					System.out.print(b+", ");
					s.push(b);
				}
				System.out.println();
			}
			if(p=='E')
			{
				q = a.charAt(1);
				c = a.substring(2);
				j = (int)q - 48;
				j = size + 2 - j;
				size = size + 1;
				for(i = 1;i <= j - 1 ; i++)
				{
					b = s.pop();
					t.push(b);
				}
				s.push(c);
				for(i = 1;i <= j - 1 ; i++)
				{
					b = t.pop();
					s.push(b);
				}
			}
			if(p=='F')
			{
				for(i = 1;i <= size; i++)
				{
					b = s.pop();
					System.out.print(b+", ");
					t.push(b);
				}
				System.out.println();
				for(i = 1;i <= size; i++)
				{
					b = t.pop();
					s.push(b);
				}
			}
			if(p=='G')
			{	
				b = "";
				for(i = 1;i <= size; i++)
				{
					b = s.pop();
					t.push(b);
				}
				System.out.println(b);
				for(i = 1;i <= size; i++)
				{
					b = t.pop();
					s.push(b);
				}

			}
			if(p=='H')
			{
				b = a.substring(1);
				j = Integer.parseInt(b) - 1;
				for(i = 1;i <= size - j; i++)
				{
					b = s.pop();
					t.push(b);
				}
				System.out.println(b);
				for(i = 1;i <= size - j; i++)
				{
					b = t.pop();
					s.push(b);
				}

			}
			if(p=='I')
			{
				c = a.substring(1);
				for(i = 1;i <= size; i++)
				{
					b = s.pop();
					t.push(b);
				}
				s.push(c);
				for(i = 1;i <= size; i++)
				{
					b = t.pop();
					s.push(b);
				}
				size = size + 1;				
			}
			if(p=='J')
			{
				for(i = 1;i <= size; i++)
				{
					b = s.pop();
					t.push(b);
				}
				t.pop();
				size = size - 1;				
				for(i = 1;i <= size; i++)
				{
					b = t.pop();
					s.push(b);
				}

			}
			if(p=='K')
			{	
				j = 0;
				int max = 0;
				for(i = 1;i <= size; i++)
				{
					b = s.pop();
					if((int)b.charAt(0) >= max)
					{
						max = (int)b.charAt(0);
						j = i;
					}
					t.push(b);
				}
				for(i = 1;i <= size; i++)
				{
					b = t.pop();
					if(i == size - j + 1)
					{
						System.out.println(b);
					}
					s.push(b);
				}
			}
			if(p=='L')
			{
				j = 0;
				int max = 0;
				for(i = 1;i <= size; i++)
				{
					b = s.pop();
					if((int)b.charAt(0) >= max)
					{
						max = (int)b.charAt(0);
						j = i;
					}
					t.push(b);
				}
				for(i = 1;i <= size; i++)
				{
					b = t.pop();
					if(i == size - j + 1)
					{
						continue;
					}
					s.push(b);
				}
				size = size - 1;
			}
			if(p=='M')
			{
				q = a.charAt(1);
				j = 0;
				for(i = 1;i <= size; i++)
				{
					b = s.pop();
					if(((int)q >= (int)b.charAt(0)) && (j==0))
					{
						t.push(q+"");
						j = 1;
					}
					t.push(b);
				}
				size = size + 1;
				for(i = 1;i <= size; i++)
				{
					b = t.pop();
					s.push(b);
				}
			}
			if(p=='N')
			{
				q = a.charAt(1);
				c = a.substring(2);
				j = (int)q - 48;
				j = size + 2 - j;
				for(i = 1;i <= j - 1 ; i++)
				{
					b = s.pop();
					t.push(b);
				}
				s.push(c);
				t.pop();
				for(i = 1;i <= j - 2 ; i++)
				{
					b = t.pop();
					s.push(b);
				}
			}
			if(p=='P')
			{
				System.out.println("Class is over.");
			}
			if(p=='Q')
			{
				j = 0;
				c = a.substring(1);
				for(i = 1;i <= size; i++)
				{
					b = s.pop();
					if(b.equals(c) && j == 0 )
					{
						j = 1;
						System.out.println(c+" is present.");
					}
					t.push(b);
				}
				for(i = 1;i <= size; i++)
				{
					b = t.pop();
					s.push(b);
				}
			}
			if(p=='R')
			{
				j = 0;
				c = a.substring(1);
				for(i = 1;i <= size; i++)
				{
					b = s.pop();
					if(b.equals(c))
					{
						j = j + 1;
						continue;
					}
					t.push(b);
				}
				size = size - j;
				for(i = 1;i <= size; i++)
				{
					b = t.pop();
					s.push(b);
				}

			}
			if(p=='S')
			{

			}
			if(p=='W')
			{
				j = 0;
				int max = 0;
				for(i = 1;i <= size; i++)
				{
					b = s.pop();
					if((int)b.charAt(0) >= max)
					{
						max = (int)b.charAt(0);
						j = i;
					}
					t.push(b);
				}
				for(i = 1;i <= size; i++)
				{
					b = t.pop();
					s.push(b);
				}
				c = "";
				for(i = 1;i <= size; i++)
				{
					b = s.pop();
					if(i == j)
					{
						c = b;
						continue;
					}
					t.push(b);
				}
				for(i = 1;i <= size - 1; i++)
				{
					b = t.pop();
					s.push(b);
				}
				s.push(c);
			}
			if(p=='Y')
			{
				int sizetrue = size;
				do
				{
					j = 0;
					int max = 0;
					for(i = 1;i <= size; i++)
					{
						b = s.pop();
						if((int)b.charAt(0) >= max)
						{
							max = (int)b.charAt(0);
							j = i;
						}
						t.push(b);
					}
					for(i = 1;i <= size; i++)
					{
						b = t.pop();
						s.push(b);
					}
					c = "";
					for(i = 1;i <= size; i++)
					{
						b = s.pop();
						if(i == j)
						{
							c = b;
							continue;
						}
						t.push(b);
					}
					for(i = 1;i <= size - 1; i++)
					{
						b = t.pop();
						s.push(b);
					}
					s.push(c);
					size = size - 1;
				}while(size>0);
				size = sizetrue; 
			}
		}while(1==1);
	}
}