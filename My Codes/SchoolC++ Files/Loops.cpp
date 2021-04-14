#include<iostream>

using namespace std;

int main()
{
    int i = 1;
    while(i<=10)
    {
        cout<<i<<"\n ";
        i++;
    }

    i = 2;
    while(i<=10)
    {
        cout<<i<<"\n ";
        i+=2;
    }

    for(int j = 2; j<=10; j+=2)
    {
        cout<<j<<" ";
    }

    for(int j = 1; j<=10; j++)
    {
        cout<<j<<" ";
    }

    



    return 0;

}