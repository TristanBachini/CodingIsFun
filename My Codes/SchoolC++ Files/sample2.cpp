#include<iostream>

using namespace std;

int main(int argc, char const *argv[])
{
    int x;
    cout << "Enter a value for x: ";
    cin >> x;

    int y;
    cout << "Enter a value for y: ";
    cin >> y;

    int sum = x + y;

    cout << x << " + " << y << " = " << sum << endl;

    return 0;
    
}