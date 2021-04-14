#include <iostream>
#include <string>
using namespace std;

int main()
{
     int chessboard[8][8];

    int bk=21;
    int bq=22;
    int bbw=23;
    int bbb=24;
    int bh1=25;
    int bh2=26;
    int br1=27;
    int br2=28;
    int bp=29;

    int wk=11;
    int wq=12;
    int wbw=13;
    int wbb=14;
    int wh1=15;
    int wh2=16;
    int wr1=17;
    int wr2=18;
    int wp=19;
    int n = 0;
    int x = 0;

    chessboard[7][0] = br1;
    chessboard[7][1] = bh1;
    chessboard[7][2] = bbw;
    chessboard[7][3] = bk;
    chessboard[7][4] = bq;
    chessboard[7][5] = bbb;
    chessboard[7][6] = bh2;
    chessboard[7][7] = br2;
    chessboard[6][0] = bp;
    chessboard[6][1] = bp;
    chessboard[6][2] = bp;
    chessboard[6][3] = bp;
    chessboard[6][4] = bp;
    chessboard[6][5] = bp;
    chessboard[6][6] = bp;
    chessboard[6][7] = bp;


    chessboard[0][0] = wr1;
    chessboard[0][1] = wh1;
    chessboard[0][2] = wbb;
    chessboard[0][3] = wq;
    chessboard[0][4] = wk;
    chessboard[0][5] = wbw;
    chessboard[0][6] = wh2;
    chessboard[0][7] = wr2;
    chessboard[1][0] = wp;
    chessboard[1][1] = wp;
    chessboard[1][2] = wp;
    chessboard[1][3] = wp;
    chessboard[1][4] = wp;
    chessboard[1][5] = wp;
    chessboard[1][6] = wp;
    chessboard[1][7] = wp;

    for(n=2;n<6;n++)
    {
        for(x=0;x<8;x++)
        {
            chessboard[n][x]=10;
        }
    }
    string move;
    string position;

    cout<<"Enter the position of the piece you wish to move: ";
    cin>> position;
    cout<<"Enter where you wish to move the piece";
    cin>> move;

    if(position == "A1" or position == "B1" or position == "C1" or position == "D1")
    {
        cout<<"Nagana tol";
    }

 




    return 0;



}