#include <iostream>
using namespace std;

class a
{
	public: a(){cout<<"h";} void b(){cout<<"a"<<endl;} // replacement of void b() with void a() gives error
};

main()
{
	a t;
	t.b();
}