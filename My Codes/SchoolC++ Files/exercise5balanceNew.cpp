#include <iostream>
#include <stack>

using namespace std;

 

int main()
{
    int checker = 0;

    int n = 0;
    char equation[150];

    cout<<"Enter equation: ";
    gets(equation);
    
    
    while(equation[n]!=NULL)
    {
        if(equation[n]=='(' or equation[n]=='{' or equation[n]=='[')
        {
            checker += 1;
        }
        n += 1;
    }

    while(n>=0)
    {
        if(equation[n]==')' or equation[n]=='}' or equation[n]==']')
        {
            checker -= 1;
        }
        n -= 1;
    }

    if(checker == 0)
    {
        cout<<"The equation is balanced!";
    }
    else
    {
        cout<<"The equation is imbalanced!";
    }

    return 0;
}