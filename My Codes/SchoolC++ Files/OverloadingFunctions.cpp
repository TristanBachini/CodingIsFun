#include<iostream>

using namespace std;

double area(double radius)
{
    return 3.14*radius*radius;
}

double area(double width, double length)
{
    return width*length;
}

int main()
{
    cout<<area(1);
    cout<<"\n";
    cout<<area(1,2);
    return 0;
}