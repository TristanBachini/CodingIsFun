#include <iostream>

using namespace std;



int onePlayer()
{
     int chessboard[8][8];


     string position;
     string move;
     int checker = 1;

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
    int n;
    int x;

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

if(x==1)
{
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

    cout<<"White turn to move!\n";
    
    cout<<"Enter the position of the piece you wish to move: ";
    cin>> position;



    switch(position[0])
    {
        case 'A':
        switch(position[1])
        {
            case '1':
            cout<<"To which location do you wish to move this piece?: ";
            cin>>move;
            switch(move[0])
            {
                case 'A':
                switch(move[1])
                {    

                    case '1':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[0][0] != 10)
                    {
                        if(chessboard[0][0]>20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[0][0] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '2':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[0][1] != 10)
                    {
                        if(chessboard[0][1]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[0][1] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '3':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[0][2] != 10)
                    {
                        if(chessboard[0][2]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[0][2] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '4':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[0][3] != 10)
                    {
                        if(chessboard[0][3]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[0][3] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '5': 
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[0][4] != 10)
                    {
                        if(chessboard[0][4]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[0][4] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '6':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[0][5] != 10)
                    {
                        if(chessboard[0][5]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[0][5] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '7':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[0][6] != 10)
                    {
                        if(chessboard[0][6]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[0][6] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '8':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[0][7] != 10)
                    {
                        if(chessboard[0][7]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[0][7] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;
                }
                break;

                
                case 'B':
                switch(move[1])
                {    

                    case '1':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[1][0] != 10)
                    {
                        if(chessboard[1][0]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[1][0] = chessboard[0][0];
                    chessboard[0][0] = 10;

                    case '2':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[1][1] != 10)
                    {
                        if(chessboard[1][1]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[1][1] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '3':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[1][2] != 10)
                    {
                        if(chessboard[1][2]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[1][2] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '4':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[1][3] != 10)
                    {
                        if(chessboard[1][3]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[1][3] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '5': 
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[1][4] != 10)
                    {
                        if(chessboard[1][4]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[1][4] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '6':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[1][5] != 10)
                    {
                        if(chessboard[1][5]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[1][5] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '7':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[1][6] != 10)
                    {
                        if(chessboard[1][6]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[1][6] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '8':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[1][7] != 10)
                    {
                        if(chessboard[1][7]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[1][7] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;
                }
                break;

                case 'C':
                switch(move[1])
                {    

                    case '1':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[2][0] != 10)
                    {
                        if(chessboard[2][0]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[2][0] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '2':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[2][1] != 10)
                    {
                        if(chessboard[2][1]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[2][1] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '3':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[2][2] != 10)
                    {
                        if(chessboard[2][2]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[2][2] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '4':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[2][3] != 10)
                    {
                        if(chessboard[2][3]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[2][3] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '5': 
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[2][4] != 10)
                    {
                        if(chessboard[2][4]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[2][4] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '6':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[2][5] != 10)
                    {
                        if(chessboard[2][5]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[2][5] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '7':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[2][6] != 10)
                    {
                        if(chessboard[2][6]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[2][6] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '8':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[2][7] != 10)
                    {
                        if(chessboard[2][7]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[2][7] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;
                }
                break;
                

                case 'D':
                switch(move[1])
                {    

                    case '1':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[3][0] != 10)
                    {
                        if(chessboard[3][0]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[3][0] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '2':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[3][1] != 10)
                    {
                        if(chessboard[3][1]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[3][1] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '3':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[3][2] != 10)
                    {
                        if(chessboard[3][2]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[3][2] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '4':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[3][3] != 10)
                    {
                        if(chessboard[3][3]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[3][3] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '5': 
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[3][4] != 10)
                    {
                        if(chessboard[3][4]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[3][4] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '6':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[3][5] != 10)
                    {
                        if(chessboard[3][5]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[3][5] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '7':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[3][6] != 10)
                    {
                        if(chessboard[3][6]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[3][6] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '8':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[3][7] != 10)
                    {
                        if(chessboard[3][7]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[3][7] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;
                }
                break;

                case 'E':
                switch(move[1])
                {    

                    case '1':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[4][0] != 10)
                    {
                        if(chessboard[4][0]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[4][0] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '2':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[4][1] != 10)
                    {
                        if(chessboard[4][1]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[4][1] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '3':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[4][2] != 10)
                    {
                        if(chessboard[4][2]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[4][2] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '4':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[4][3] != 10)
                    {
                        if(chessboard[4][3]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[4][3] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '5': 
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[4][4] != 10)
                    {
                        if(chessboard[4][4]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[4][4] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '6':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[4][5] != 10)
                    {
                        if(chessboard[4][5]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[4][5] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '7':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[4][6] != 10)
                    {
                        if(chessboard[4][6]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[4][6] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '8':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[4][7] != 10)
                    {
                        if(chessboard[4][7]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[4][7] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;
                }
                break;

                case 'F':
                switch(move[1])
                {    

                    case '1':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[5][0] != 10)
                    {
                        if(chessboard[5][0]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[5][0] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '2':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[5][1] != 10)
                    {
                        if(chessboard[5][1]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[5][1] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '3':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[5][2] != 10)
                    {
                        if(chessboard[5][2]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[5][2] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '4':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[5][3] != 10)
                    {
                        if(chessboard[5][3]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[5][3] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '5': 
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[5][4] != 10)
                    {
                        if(chessboard[5][4]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[5][4] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '6':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[5][5] != 10)
                    {
                        if(chessboard[5][5]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[5][5] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '7':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[5][6] != 10)
                    {
                        if(chessboard[5][6]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[5][6] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '8':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[5][7] != 10)
                    {
                        if(chessboard[5][7]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[5][7] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;
                }
                break;

                case 'G':
                switch(move[1])
                {    

                    case '1':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[6][0] != 10)
                    {
                        if(chessboard[6][0]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[6][0] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '2':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[6][1] != 10)
                    {
                        if(chessboard[6][1]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[6][1] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '3':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[6][2] != 10)
                    {
                        if(chessboard[6][2]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[6][2] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '4':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[6][3] != 10)
                    {
                        if(chessboard[6][3]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[6][3] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '5': 
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[6][4] != 10)
                    {
                        if(chessboard[6][4]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[6][4] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '6':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[6][5] != 10)
                    {
                        if(chessboard[6][5]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[6][5] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '7':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[6][6] != 10)
                    {
                        if(chessboard[6][6]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[6][6] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '8':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[6][7] != 10)
                    {
                        if(chessboard[6][7]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[6][7] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;
                }
                break;

                case 'H':
                switch(move[1])
                {    

                    case '1':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[7][0] != 10)
                    {
                        if(chessboard[7][0]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[7][0] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '2':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[7][1] != 10)
                    {
                        if(chessboard[7][1]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[7][1] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '3':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[7][2] != 10)
                    {
                        if(chessboard[7][2]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[7][2] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '4':
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[7][3] != 10)
                    {
                        if(chessboard[7][3]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[7][3] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '5': 
                      if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[7][4] != 10)
                    {
                        if(chessboard[7][4]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[7][4] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '6':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[7][5] != 10)
                    {
                        if(chessboard[7][5]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[7][5] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '7':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[7][6] != 10)
                    {
                        if(chessboard[7][6]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[7][6] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;

                    case '8':
                    if(move == position)
                    {
                        cout<<"You can't move there!";
                        break;
                    }
                    if(chessboard[7][7] != 10)
                    {
                        if(chessboard[7][7]<20)
                        {
                            cout<<"You can't move there!";
                            break;
                        }
                    }
                    chessboard[7][7] = chessboard[0][0];
                    chessboard[0][0] = 10;
                    break;
                }
                break;

            }
            break;

            case 2:
            return 0;
            break;

            case 3:
            return 0;
            break;

            case 4:
            return 0;
            break;

            case 5:
            return 0;
            break;

            case 6:
            return 0;
            break;

            case 7:
            return 0;
            break;

            case 8:
            return 0;
            break;

        }
    }

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