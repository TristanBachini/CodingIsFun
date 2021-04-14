#include <iostream>
#include <stack>

using namespace std;

 

int main()
{
    int checker = 1;

    int n = 0;
    string equation;

    cout<<"Enter equation(without space): ";
    cin>>equation;
    
    stack<char> mystack;

    while(equation[n]!=NULL)
    {
        
        mystack.push(equation[n]);
        n = n+1;
    }
    int a = n;
    
    
    stack<char> tempStack;
    tempStack = mystack;

    while(n>=0)
    {
        if(mystack.top == '5')
        {
            int checker = checker + 1;
        }
        mystack.pop();
        n = n-1;
    }

    cout<<checker;


    return 0;
}