#include<iostream>
#include<vector>

using namespace std;

void printVector (vector<int> a)
{
    for(int i=0; i< a.size(); i++)
    {
        cout<< a[i] << "\n ";
    }
}

int main()
{
    vector <int> a;
    a.push_back(1);
    a.push_back(2);
    a.push_back(3);
    a.push_back(4);

    a.insert(a.begin(), 10); //10 1 2 3 4

    printVector(a);

    a.insert(a.begin()+2, 20); //10 1 20 2 3 4

    printVector(a);

    a.erase(a.begin()+3); //10 1 20 3 4 

    printVector(a);

    a.clear(); //empty vector

    printVector(a);

    cout<<a.empty(); //true | 1 (pancheck lang if empty, 1 if true)
}