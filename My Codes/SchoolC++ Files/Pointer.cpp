#include <iostream>

using namespace std;

int main()
{
    int x = 10;

    cout<<x; //10(value of x)
    cout<<"\n";
    cout<<&x; //(address of x)
    cout<<"\n";

    int *p = &x; //asterisk(pointer) p points to address of x

    cout<<p; //(address of x)
    cout<<"\n";
    cout<<*p; //(10)

    *p=20; //(changes value of x from 10 --> 20)
    cout<<"\n";
    cout<<x;



    return 0;
    



}