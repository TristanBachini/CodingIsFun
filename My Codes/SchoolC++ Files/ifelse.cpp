#include <iostream>

using namespace std;

int main()
{
    int age;
    cout<<"Enter your age: ";
    cin>>age;

    if(age<18)
    {
        cout<<"you are a minor";
    }
    else if(18 <= age && age < 60 )
    {
        cout<<"You are an adult";
    }
    else
    {
        cout<<"You are a senior";
    }
    
    

  

    return 0;
    

}