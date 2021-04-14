#include<iostream>
#include<vector>
#include<string>
#include<cstring>

using namespace std;


void printVector (vector<string> names)
{

    int x = 1;
    for(int i=0; i< names.size(); i++)
    {
        cout<<"\n"<< x<<". "<<names[i] << "\n ";
        ++x;
    }

}

int main()
{
    string choice; 
    int a = 0;
    int x = 1;
    int n = 1;
    int y = 0;
    int b = 0;
    int result;
    string name;
    string deleted;
    vector <string> names;


   


    while(a==0)
    {
    
    cout<<"Input(add,delete,display,clear,exit): ";
    cin>>choice;

    if(choice == "add")
    {
       cout<<"Enter a name: ";
       cin>>name;
       names.push_back(name);
       x = x + 1;
    }
    else if(choice == "delete")
    {
       cout<<"Enter name to delete: ";
       cin>>deleted;

       while(b<names.size())
       {

       result= strcmp(deleted.c_str(), names[b].c_str());

       if(result == 0)
       {
           names.erase(names.begin()+b);
           x = x-1;
           b = 2*names.size() + 1;
           
       }
       else
       {
           b = b+1;
          
       }

       }

       if(b == names.size())
       {
           cout<<"The name does not exist in the list\n\n";
       }

       
       b = 0;
       

    }
    else if(choice == "display")
    {
        printVector(names);
    }
    else if(choice == "clear")
    {
         names.clear();
         b = 0;
    }
    else if(choice == "exit")
    {
        cout<<"The program will now exit. If this is not your intention please check your input choice. Thank you!";
        exit(0);
    }
    else
    {
        cout<<"Please enter a valid choice\n";
    }
    

    }


    return 0;
}