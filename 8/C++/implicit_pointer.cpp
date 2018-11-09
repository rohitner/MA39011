#include <iostream>
using namespace std;

class a
{
	public: int p,q;
};

main()
{
	a x,y;
	x.p=3;
	y = x;
	y.p=4;
	cout<<x.p<<endl;
}