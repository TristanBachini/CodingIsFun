#include <iostream>

using namespace std;

double volume(double width=1, double length=1, double height=1)
{
    return width*length*height;
}

int main()
{
    cout<<volume(3,2);
    
    return 0;
    
}