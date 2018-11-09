#include <iostream>
using namespace std;

class a
{
	public: void f()
	{
		cout<<"hari"<<endl;
	}
};

class b
{
	public: void f()
	{
		cout<<"ravi"<<endl;
	}
};

void g()
{
	a x;
	x.f();
}

void h()
{
	b x;
	x.f();
}

int main()
{
	g();
	h();
}