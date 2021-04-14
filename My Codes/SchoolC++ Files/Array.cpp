#include <iostream>

using namespace std;

int main()
{
    int array[10] = {10,20,30,40,50,60,70,80,90,100};

    for (int i = 0; i<10; i++)
    {
        cout<<array[i]<<"\n";
    }

    array[5] = 123;

    for(int i=0; i<10; i++)
    {
        cout<<array[i]<<"\n";
    }



}