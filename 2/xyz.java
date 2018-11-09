
class xyz
{
	private float x, y;
	public xyz(float p, float q)
	{
		x = p;
		y = q;
	}

	public void pt()
	{
		System.out.println("("+x+","+y+")");
	}

	public point f()
	{	
		float t = x;
		float u = y;
		x = x + y;
		y = 2*t;
		return new point(t+u,t);
	}

	public point g()
	{
		return new point(10*x,30*y);
	}

	public static point h(point p)
	{
		return new point(p.x+1,p.y+1);
	}

	public static void main(String args[])
	{
		xyz a,b;
		a = new xyz(1,2);
		a.pt();

	}
}
