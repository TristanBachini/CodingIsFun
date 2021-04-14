#include <iostream>

using namespace std;



void Ashift(string name1, string name2, string name3)
{
    string temp1;
    string temp2;
    string temp3;

    temp1 = name1;
    temp2 = name2;
    name1 = name3;
    name2 = temp2;
    name3 = temp1;

    cout<<"\n"<< name1 <<"\n"<< name2<<"\n"<<name3;

}


void Bshift(string name1, string name2, string name3)
{
    string temp1;
    string temp2;
    string temp3;

    temp1 = name1;
    temp2 = name2;
    name1 = name3;
    name2 = temp1;
    name3 = temp1;

    cout<<"\n"<< name1 <<"\n"<< name2<<"\n"<<name3;

}

int main()
{
    string name1;
    string name2;
    string name3;
    cout<<"Enter first name:\n ";
    cin>>name1;
    cout<<"Enter second name: \n";
    cin>>name2;
    cout<<"Enter third name: \n";
    cin>>name3;


    int a = 0;


    cout<<"\n\nHere are the names:\n";

    cout<<"\n1."<<name1;
    cout<<"\n2."<<name2;
    cout<<"\n3."<<name3;
   

    while(a >= 0)
    {
    cout<<"\nEnter number of shifts: ";
    cin>> a;
    

    

    a = a  % 3;

    switch(a)
    {
        case 0:
        cout<<"\n"<< name1 <<"\n"<< name2<<"\n"<<name3;
        break;

        case 1:
        Ashift(name1,name2,name3);
        break;

        case 2:
        Bshift(name1,name2,name3);
        break;

    }

    }


    return 0;




}