#include <iostream>

using namespace std;
int main(int argc, char const *argv[])
{
    int number;
    cout << "Input a number: ";
    cin >> number;
    int newNumber = number + 5;
    cout << number << " + 5 = " << newNumber << endl;

    return 0;
    
}