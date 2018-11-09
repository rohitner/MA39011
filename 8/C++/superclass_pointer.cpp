#include <iostream>
using namespace std;

class a
{
	public: void g()
	{
		cout<<"anil"<<endl;
	}
};

class b: public a
{
	public: void g(int w){cout<<"hari"<<endl;}
};

int main()
{
	a *x;
	b y;
	x = &y;
	(*x).g();
}