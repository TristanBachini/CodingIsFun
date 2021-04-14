#include <ctime>
#include <cstdlib>
#include <iostream>
#include <stdlib.h>

using namespace std;

int main()
{
    srand(time(NULL));
    int randomNum = rand()%30 + 1;

    int number;


    int x = 1;

    while(x>0)
    {

    cout<<"Input a Number: ";
    cin>>number;
        
        
    if(number == randomNum)
    {
        cout<<"You guessed the right number!";
        exit(1);
    }
    else
    {
        cout<<"\nWrong number, try again!\n";
    }


    }




    
    



    return 0;
}