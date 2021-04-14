#include <iostream>

using namespace std;

int factorial(int y, int v)
{

    if(y>1)
    {
        v = v * (y-1);
        int z = y-1;
        factorial(z,v);
    }
    else
    {
        return v;
    }

}

int main()
{

int x1;


cout<<"Enter number to find factorial: ";
cin>>x1;

int p = x1;

cout<< factorial(x1,p);

return 0;
}