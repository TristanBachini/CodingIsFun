#include <iostream>
#include <queue>

using namespace std;

void print (queue<int> q)
{
    while(!q.empty())
    {
        cout << q.front() << " ";
        q.pop();
    }

    cout<<"\n";
}

int main()
{
    queue<int> myqueue;
    myqueue.push(1); 
    print(myqueue); //1
    myqueue.push(2);
    print(myqueue); //1,2
    myqueue.push(3);
    print(myqueue); //1,2,3
    myqueue.pop();
    print(myqueue); //1,2 
    myqueue.push(4);
    print(myqueue); //1,2,4
    myqueue.pop();
    print(myqueue); //1,2
    myqueue.pop();
    print(myqueue); //1
}