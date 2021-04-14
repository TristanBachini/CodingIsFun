#include <iostream>

using namespace std;

int main()
{
    int n;
    int first = 1;
    int second = 1;
    int fibonacci = 1;




    cout<<"Input a positive integer: ";
    cin>>n;

    cout<<"\n"<<first;
    cout<<"\n"<<second;

    while(fibonacci <= n)
    {

        fibonacci = first + second;
        first = second;
        second = fibonacci;
        if(fibonacci <= n)
        {
            cout<<"\n"<<fibonacci;
        }


    }

return 0;
    
}