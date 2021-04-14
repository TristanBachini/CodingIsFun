#include <iostream>

using namespace std;


int main()
{
    string name1;
    string name2;
    string name3;

    int shifts = 0;
    int a;

    cout<<"\nEnter first name: ";
    cin>>name1;

    cout<<"\nEnter second name: ";
    cin>>name2;

    cout<<"\nEnter third name: ";
    cin>>name3;

    cout<<"\n\nHere are the list of names: ";
    cout<<"\n1."<<name1;
    cout<<"\n2."<<name2;
    cout<<"\n3."<<name3;


    

    while(shifts >= 0)
    {

        cout<<"\n\n Enter number of shifts(negative number to end): ";
        cin>>shifts;

        a = shifts %3;


        string temp1;
        string temp2;
        string temp3;

        switch(a)
        {
            case 0:
            cout<<"\n1."<<name1;
            cout<<"\n2."<<name2;
            cout<<"\n3."<<name3;
            break;

            case 1:
            temp1 = name1;
            temp2 = name2;
            temp3 = name3;

            name1 = temp3;
            name2 = temp1;
            name3 = temp2;

            cout<<"\n1."<<name1;
            cout<<"\n2."<<name2;
            cout<<"\n3."<<name3;
            break;

            case 2:
            temp1 = name1;
            temp2 = name2;
            temp3 = name3;

            name1 = temp2;
            name2 = temp3;
            name3 = temp1;

            cout<<"\n1."<<name1;
            cout<<"\n2."<<name2;
            cout<<"\n3."<<name3;
            break;
        }


    }

return 0;

}