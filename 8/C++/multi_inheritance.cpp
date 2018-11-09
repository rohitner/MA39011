#include <iostream>
using namespace std;

class a{};
class b{};
class c: public a, public b{}; // unlike java no issues in multiple inheritance
main()
{
	c x;
}