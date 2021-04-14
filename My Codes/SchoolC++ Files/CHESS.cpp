#include <iostream>

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

    chessboard[0][0] = br1;
    chessboard[0][1] = bh1;
    chessboard[0][2] = bbw;
    chessboard[0][3] = bk;
    chessboard[0][4] = bq;
    chessboard[0][5] = bbb;
    chessboard[0][6] = bh2;
    chessboard[0][7] = br2;
    chessboard[1][0] = bp;
    chessboard[1][1] = bp;
    chessboard[1][2] = bp;
    chessboard[1][3] = bp;
    chessboard[1][4] = bp;
    chessboard[1][5] = bp;
    chessboard[1][6] = bp;
    chessboard[1][7] = bp;


    chessboard[7][0] = wr1;
    chessboard[7][1] = wh1;
    chessboard[7][2] = wbb;
    chessboard[7][3] = wq;
    chessboard[7][4] = wk;
    chessboard[7][5] = wbw;
    chessboard[7][6] = wh2;
    chessboard[7][7] = wr2;
    chessboard[6][0] = wp;
    chessboard[6][1] = wp;
    chessboard[6][2] = wp;
    chessboard[6][3] = wp;
    chessboard[6][4] = wp;
    chessboard[6][5] = wp;
    chessboard[6][6] = wp;
    chessboard[6][7] = wp;

    for(n=2;n<6;n++)
    {
        for(x=0;x<8;x++)
        {
            chessboard[n][x]=10;
        }
    }

    




    cout<<"  "<< "1 " << " "<<"2 "<<" "<<"3 "<<" "<<"4 "<<" "<<"5 "<<" "<<"6 "<<" "<<"7 "<<" "<<"8 "<<"\n";
    cout<<"A "<< chessboard[0][0] << " "<<chessboard[0][1]<<" "<<chessboard[0][2]<<" "<<chessboard[0][3]<<" "<<chessboard[0][4]<<" "<<chessboard[0][5]<<" "<<chessboard[0][6]<<" "<<chessboard[0][7]<<" A"<<"\n";
    cout<<"B "<< chessboard[1][0] << " "<<chessboard[1][1]<<" "<<chessboard[1][2]<<" "<<chessboard[1][3]<<" "<<chessboard[1][4]<<" "<<chessboard[1][5]<<" "<<chessboard[1][6]<<" "<<chessboard[1][7]<<" B"<<"\n";
    cout<<"C "<< chessboard[2][0] << " "<<chessboard[2][1]<<" "<<chessboard[2][2]<<" "<<chessboard[2][3]<<" "<<chessboard[2][4]<<" "<<chessboard[2][5]<<" "<<chessboard[2][6]<<" "<<chessboard[2][7]<<" C"<<"\n";
    cout<<"D "<< chessboard[3][0] << " "<<chessboard[3][1]<<" "<<chessboard[3][2]<<" "<<chessboard[3][3]<<" "<<chessboard[3][4]<<" "<<chessboard[3][5]<<" "<<chessboard[3][6]<<" "<<chessboard[3][7]<<" D"<<"\n";
    cout<<"E "<< chessboard[4][0] << " "<<chessboard[4][1]<<" "<<chessboard[4][2]<<" "<<chessboard[4][3]<<" "<<chessboard[4][4]<<" "<<chessboard[4][5]<<" "<<chessboard[4][6]<<" "<<chessboard[4][7]<<" E"<<"\n";
    cout<<"F "<< chessboard[5][0] << " "<<chessboard[5][1]<<" "<<chessboard[5][2]<<" "<<chessboard[5][3]<<" "<<chessboard[5][4]<<" "<<chessboard[5][5]<<" "<<chessboard[5][6]<<" "<<chessboard[5][7]<<" F"<<"\n";
    cout<<"G "<< chessboard[6][0] << " "<<chessboard[6][1]<<" "<<chessboard[6][2]<<" "<<chessboard[6][3]<<" "<<chessboard[6][4]<<" "<<chessboard[6][5]<<" "<<chessboard[6][6]<<" "<<chessboard[6][7]<<" G"<<"\n";
    cout<<"H "<< chessboard[7][0] << " "<<chessboard[7][1]<<" "<<chessboard[7][2]<<" "<<chessboard[7][3]<<" "<<chessboard[7][4]<<" "<<chessboard[7][5]<<" "<<chessboard[7][6]<<" "<<chessboard[7][7]<<" H"<<"\n";
    cout<<"  "<< "1 " << " "<<"2 "<<" "<<"3 "<<" "<<"4 "<<" "<<"5 "<<" "<<"6 "<<" "<<"7 "<<" "<<"8 "<<"\n";
return 0;




}