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
	public: void g(int w)
	{
		cout<<10*w<<endl;
	}
};

int main()
{
	b y;
	y.g(2);
}