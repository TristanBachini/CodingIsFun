#include <iostream>
#include <stack>

using namespace std;

void print (stack<int> s)
{
    while(!s.empty())
    {
        cout << " \n"<<s.top();
        s.pop();
    }

    cout<<"\n";
}

int main()
{
    stack<int> mystack;
    mystack.push(1); 
    print(mystack); //1
    mystack.push(2);
    print(mystack); //1,2
    mystack.push(3);
    print(mystack); //1,2,3
    mystack.pop();
    print(mystack); //1,2 
    mystack.push(4);
    print(mystack); //1,2,4
    mystack.pop();
    print(mystack); //1,2
    mystack.pop();
    print(mystack); //1



    return 0;
}