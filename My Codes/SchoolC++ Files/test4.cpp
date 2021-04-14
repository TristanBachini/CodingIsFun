#include <iostream>

using namespace std;



int onePlayer()
{
     int chessboard[8][8];
     int n = 0;
     int x = 0;
     int y;


     string position;
     string move;
     int checker = 1;
     int moveC;

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



cout<<"Which color do you want to be?"<<"\n"<<"1. White"<<"\n"<<"2. Black"<<"\n";
cin>> x; 

cout<<"Black: \n"<<"bk=21 \n"<<
    "bq=22 \n"
    <<"bbw=23 \n"
    <<"bbb=24 \n"
    <<"bh1=25 \n"
    <<"bh2=26 \n"
    <<"br1=27 \n"
    <<"br2=28 \n"
    <<"bp=29 \n\n"
    <<"White: \n"
    <<"wk=11 \n"
    <<"wq=12 \n"
    <<"wbw=13 \n"
    <<"wbb=14 \n"
    <<"wh1=15 \n"
    <<"wh2=16 \n"
    <<"wr1=17 \n"
    <<"wr2=18 \n"
    <<"wp=19 \n"
    <<"blank tile=10 \n";

    int positionC;

int turnChecker = 1;

while(turnChecker==1)
{
    if(x==1)
{
    cout<<"White turn to move!\n";
    
    cout<<"Enter the position of the piece you wish to move: ";
    cin>> position;

    int positionR;

    switch(position[0])
    {
        case 'A':
        positionR = 0;
        break;

        case 'B':
        positionR = 1;
        break;

        case 'C':
        positionR = 2;
        break;

        case 'D':
        positionR = 3;
        break;

        case 'E':
        positionR = 4;
        break;

        case 'F':
        positionR = 5;
        break;

        case 'G':
        positionR = 6;
        break;

        case 'H':
        positionR = 7;
        break;
    }

    switch(position[1])
    {
        case '1':
        positionC = 0;
        break;

        case '2':
        positionC = 1;
        break;

         case '3':
        positionC = 2;
        break;

        case '4':
        positionC = 3;
        break;

        case '5':
        positionC = 4;
        break;

        case '6':
        positionC = 5;
        break;

         case '7':
        positionC = 6;
        break;

        case '8':
        positionC = 7;
        break;


    }
    cout<<"Where do you wish to move this piece: ";
    cin>>move;

    int moveR;

    switch(move[0])
    {
        case 'A':
        moveR = 0;
        break;

        case 'B':
        moveR = 1;
        break;

        case 'C':
        moveR = 2;
        break;

        case 'D':
        moveR = 3;
        break;

        case 'E':
        moveR = 4;
        break;

        case 'F':
        moveR = 5;
        break;

        case 'G':
        moveR = 6;
        break;

        case 'H':
        moveR = 7;
        break;
    }


            switch(move[1])
            {
                case '1':
                moveC = 0;
                break;

                case '2':
                moveC = 1;
                break;

                case '3':
                moveC = 2;
                break;

                case '4':
                moveC = 3;
                break;

                case  '5':
                moveC = 4;
                break;

                case '6':
                moveC = 5;
                break;

                case '7':
                moveC = 6;
                break;

                case '8':
                moveC = 7;
                break;
                
            }


    int blankCheckerR = positionR+1;
    int blankCheckerC = positionC+1;
    int k; 



    if(chessboard[positionR][positionC]==29)
    {
        
        if(positionR==6)
        {
            if(chessboard[positionR-1][positionC]==10)
            {
                chessboard[positionR-1][positionC]=80;
                if(chessboard[positionR-2][positionC]==10)
                {
                    chessboard[positionR-2][positionC]=80;
                }
            }
        }
        if(positionR!=6)
        {
            if(chessboard[blankCheckerR][positionC]==10)
            {
                chessboard[blankCheckerR][positionC]=80; 
            }
        }
        if(chessboard[moveR][moveC]==80)
        {
            chessboard[moveR][moveC]=chessboard[positionR][positionC];
            chessboard[positionR][positionC]=10;
        }
        if(moveC==positionC-1)
        {
            if(moveR==positionR-1)
            {
                if(chessboard[moveR][moveC]<20)
                {
                    chessboard[moveR][moveC]=chessboard[positionR][positionC];
                    chessboard[positionR][positionC]=10;
                }
            }
        }
        if(moveC==positionC + 1)
        {
            if(moveR==positionR-1)
            {
                if(chessboard[moveR][moveC]<20)
                {
                    chessboard[moveR][moveC]=chessboard[positionR][positionC];
                    chessboard[positionR][positionC]=10;
                }
            }
        }
        if(chessboard[positionR][positionC]==29)
        {
            cout<<"Invalid move!";
        }
        for(n=0;n<8;n++)
        {
            for(k=0;k<8;k++)
            {
            if(chessboard[n][k]==80)
            {
                chessboard[n][k]=10;
            }
            }
        }
    }
 
    if(chessboard[positionR][positionC]==19)
    {
        
        if(positionR==1)
        {
            if(chessboard[blankCheckerR][positionC]==10)
            {
                chessboard[blankCheckerR][positionC]=80;
                blankCheckerR += 1;
                if(chessboard[blankCheckerR][positionC]==10)
                {
                    chessboard[blankCheckerR][positionC]=80;
                }
            }
        }
        if(positionR!=1)
        {
            if(chessboard[blankCheckerR][positionC]==10)
            {
                chessboard[blankCheckerR][positionC]=80; 
            }
        }
        if(chessboard[moveR][moveC]==80)
        {
            chessboard[moveR][moveC]=chessboard[positionR][positionC];
            chessboard[positionR][positionC]=10;
        }
        if(moveC==positionC-1)
        {
            if(moveR==positionR+1)
            {
                if(chessboard[moveR][moveC]>20)
                {
                    chessboard[moveR][moveC]=19;
                    chessboard[positionR][positionC]=10;
                }
            }
        }
        if(moveC==positionC + 1)
        {
            if(moveR==positionR+1)
            {
                if(chessboard[moveR][moveC]>20)
                {
                    chessboard[moveR][moveC]=19;
                    chessboard[positionR][positionC]=10;
                }
            }
        }
        if(chessboard[positionR][positionC]==19)
        {
            cout<<"Invalid move!";
        }
        for(n=0;n<8;n++)
        {
            for(k=0;k<8;k++)
            {
            if(chessboard[n][k]==80)
            {
                chessboard[n][k]=10;
            }
            }
        }
    }

    if(chessboard[positionR][positionC]==25 or chessboard[positionR][positionC]==26 or chessboard[positionR][positionC]==15 or chessboard[positionR][positionC]==16)
    {
        if(positionC-moveC==2 or positionC-moveC==-2)
        {
            if(positionR-moveR==1 or positionR-moveR==-1)
            {
                if(chessboard[positionR][positionC]==25 or chessboard[positionR][positionC]==26)
                {
                    if(chessboard[moveR][moveC]==10 or chessboard[moveR][moveC]<20)
                    {
                        chessboard[moveR][moveC] = chessboard[positionR][positionC];
                        chessboard[positionR][positionC] = 10;
                    }

                }
                if(chessboard[positionR][positionC] == 15 or chessboard[positionR][positionC]==16)
                {
                    if(chessboard[moveR][moveC]==10 or chessboard[moveR][moveC]>20)
                    {
                        chessboard[moveR][moveC] = chessboard[positionR][positionC];
                        chessboard[positionR][positionC] = 10;
                        cout<<"ops";
                    }
                }
            }
        }
        if(positionC-moveC==1 or positionC-moveC==-1)
        {
            if(positionR-moveR==2 or positionR-moveR==-2)
            {
                if(chessboard[positionR][positionC]>20)
                {
                    if(chessboard[positionR][positionC]==25 or chessboard[positionR][positionC]==26)
                    {
                        chessboard[moveR][moveC] = chessboard[positionR][positionC];
                        chessboard[positionR][positionC] = 10;
                    }

                }
                if(chessboard[positionR][positionC] == 15 or chessboard[positionR][positionC]==16)
                {
                    if(chessboard[moveR][moveC]==10 or chessboard[moveR][moveC]>20)
                    {
                        chessboard[moveR][moveC] = chessboard[positionR][positionC];
                        chessboard[positionR][positionC] = 10;
                       
                    }
                }
            }
        }
        for(n=0;n<8;n++)
        {
            for(k=0;k<8;k++)
            {
            if(chessboard[n][k]==80)
            {
                chessboard[n][k]=10;
            }
            }
        }
        if(chessboard[positionR][positionC]!=10)
        {
            cout<<"Invalid move!";
        }
    }

    if(chessboard[positionR][positionC]==27 or chessboard[positionR][positionC]==28 or  chessboard[positionR][positionC]==17 or chessboard[positionR][positionC]==18)
    {
        if(positionC == moveC)
        {
            int verticalRook = moveR - positionR;

            if(chessboard[positionR][positionC]==17 or chessboard[positionR][positionC]==18)
            {
                if(verticalRook>0)
                {
                    int testPositionR = positionR;
                    for(int verticalRookMovement = 0; verticalRookMovement < 8; verticalRookMovement++)
                    {
                        testPositionR = testPositionR + 1;
                        if(chessboard[testPositionR][positionC]==10)
                        {
                            chessboard[testPositionR][positionC]=80;//stuck here lmao
                        }
                        if(chessboard[testPositionR][positionC]==21 or chessboard[testPositionR][positionC]==22 or chessboard[testPositionR][positionC]==23 or chessboard[testPositionR][positionC]==24 or chessboard[testPositionR][positionC]==25 or chessboard[testPositionR][positionC]==26 or chessboard[testPositionR][positionC]==27 or chessboard[testPositionR][positionC]==28 or chessboard[testPositionR][positionC]==29)
                        {
                            break;
                        }
                    }
                    if(chessboard[moveR][moveC]==80)
                    {
                        chessboard[moveR][moveC] = chessboard[positionR][positionC];
                        chessboard[positionR][positionC]=10;
                    }
                    if(chessboard[moveR][moveC]>20)
                    {
                        if(chessboard[moveR+1][moveC]==80 or chessboard[moveR-1][moveC]==80)
                        {
                            chessboard[moveR][moveC]=chessboard[positionR][positionC];
                            chessboard[positionR][positionC] = 10;
                        }
                    }
                }
                if(verticalRook<0)
                {
                    int testPositionR = positionR;
                    for(int verticalRookMovement = 0; verticalRookMovement < 8; verticalRookMovement++)
                    {
                        testPositionR = testPositionR - 1;
                        if(chessboard[testPositionR][positionC]==10)
                        {
                            chessboard[testPositionR][positionC]=80;
                        }
                        if(chessboard[testPositionR][positionC]==21 or chessboard[testPositionR][positionC]==22 or chessboard[testPositionR][positionC]==23 or chessboard[testPositionR][positionC]==24 or chessboard[testPositionR][positionC]==25 or chessboard[testPositionR][positionC]==26 or chessboard[testPositionR][positionC]==27 or chessboard[testPositionR][positionC]==28 or chessboard[testPositionR][positionC]==29)
                        {
                            break;
                        }
                    }
                    if(chessboard[moveR][moveC]==80)
                    {
                        chessboard[moveR][moveC] = chessboard[positionR][positionC];
                        chessboard[positionR][positionC]=10;
                    }
                    if(chessboard[moveR][moveC]>20)
                    {
                        if(chessboard[moveR+1][moveC]==80 or chessboard[moveR-1][moveC]==80)
                        {
                            chessboard[moveR][moveC]=chessboard[positionR][positionC];
                            chessboard[positionR][positionC] = 10;
                        }
                    }
                }
            }
        }
        if(positionR == moveR)
        {
            int horizontalRook = moveC - positionC;

            if(chessboard[positionR][positionC]==17 or chessboard[positionR][positionC]==18)
            {
                if(horizontalRook>0)
                {
                    int testPositionC = positionC;
                    for(int horizontalRookMovement = 0; horizontalRookMovement < 8; horizontalRookMovement++)
                    {
                        testPositionC = testPositionC + 1;
                        if(chessboard[positionR][testPositionC]==10)
                        {
                            chessboard[positionR][testPositionC]=80;//stuck here lmao
                        }
                        if(chessboard[positionR][testPositionC]==21 or chessboard[positionR][testPositionC]==22 or chessboard[positionR][testPositionC]==23 or chessboard[positionR][testPositionC]==24 or chessboard[positionR][testPositionC]==25 or chessboard[positionR][testPositionC]==26 or chessboard[positionR][testPositionC]==27 or chessboard[positionR][testPositionC]==28 or chessboard[positionR][testPositionC]==29)
                        {
                            break;
                        }
                    }
                    if(chessboard[moveR][moveC]==80)
                    {
                        chessboard[moveR][moveC] = chessboard[positionR][positionC];
                        chessboard[positionR][positionC]=10;
                    }
                    if(chessboard[moveR][moveC]>20)
                    {
                        if(chessboard[moveR][moveC+1]==80 or chessboard[moveR][moveC-1]==80)
                        {
                            chessboard[moveR][moveC]=chessboard[positionR][positionC];
                            chessboard[positionR][positionC] = 10;
                        }
                    }
                }
                if(horizontalRook<0)
                {
                    int testPositionC = positionC;
                    for(int horizontalRookMovement = 0; horizontalRookMovement < 8; horizontalRookMovement++)
                    {
                        testPositionC = testPositionC - 1;
                        if(chessboard[positionR][testPositionC]==10)
                        {
                            chessboard[positionR][testPositionC]=80;//stuck here lmao
                        }
                        if(chessboard[positionR][testPositionC]==21 or chessboard[positionR][testPositionC]==22 or chessboard[positionR][testPositionC]==23 or chessboard[positionR][testPositionC]==24 or chessboard[positionR][testPositionC]==25 or chessboard[positionR][testPositionC]==26 or chessboard[positionR][testPositionC]==27 or chessboard[positionR][testPositionC]==28 or chessboard[positionR][testPositionC]==29)
                        {
                            break;
                        }
                    }
                    if(chessboard[moveR][moveC]==80)
                    {
                        chessboard[moveR][moveC] = chessboard[positionR][positionC];
                        chessboard[positionR][positionC]=10;
                    }
                    if(chessboard[moveR][moveC]>20)
                    {
                        if(chessboard[moveR][moveC+1]==80 or chessboard[moveR][moveC-1]==80)
                        {
                            chessboard[moveR][moveC]=chessboard[positionR][positionC];
                            chessboard[positionR][positionC] = 10;
                        }
                    }
                }
            }
        }
        for(n=0;n<8;n++)
        {
            for(k=0;k<8;k++)
            {
            if(chessboard[n][k]==80)
            {
                chessboard[n][k]=10;
            }
            }
        }
        if(chessboard[positionR][positionC]!=10)
        {
            cout<<"Invalid move!";
        }
    }
    //to make others, like bishop, make chessboard[positionR][positionC] then do +1+1 respectively then make it =80. 
    //then, use chessboard[moveR][moveC] to see if the move is = to 80. If not, then it is an invalid move.

}
else
{
      cout<<"Black: \n"<<"bk=21 \n"<<
    "bq=22 \n"
    <<"bbw=23 \n"
    <<"bbb=24 \n"
    <<"bh1=25 \n"
    <<"bh2=26 \n"
    <<"br1=27 \n"
    <<"br2=28 \n"
    <<"bp=29 \n"
    <<"White: \n"
    <<"wk=11 \n"
    <<"wq=12 \n"
    <<"wbw=13 \n"
    <<"wbb=14 \n"
    <<"wh1=15 \n"
    <<"wh2=16 \n"
    <<"wr1=17 \n"
    <<"wr2=18 \n"
    <<"wp=19 \n"
    <<"blank tile=10 \n";
    
}
    cout<<"\n\n";


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
}

return 0;
}








int main()
{
    int choice;

    cout<<"Welcome to Chess! Select mode:"<<"\n";
    cout<<"1. 1 player\n2. 2 player"<<"\n";
    cin>>choice;


    if(choice == 1)
    {
        onePlayer();
    }

    return 0;
}