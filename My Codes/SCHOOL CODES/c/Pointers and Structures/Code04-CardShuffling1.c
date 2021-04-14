/****************************************************************
 * Card shuffling dealing program using arrays
 ***************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void shuffle(int wDeck[][13])
{
    for(int card = 1; card <= 52; card++)
    {
        int row;
        int column;
        do {
            row = rand() % 4;
            column = rand() % 13;
        }while(wDeck[row][column] != 0);

        wDeck[row][column] = card;
    }
}

void deal(const int wDeck[][13], const char *wFace[], const char *wSuit[])
{
    for(int card = 1; card <= 52; card++)
    {
        for(int row = 0; row < 4; row++)
        {
            for(int column = 0; column < 13; column++)
            {
                if (wDeck[row][column] == card)
                {
                    printf("%5s of %-8s%c",
                           wFace[column], wFace[row],
                           card % 2 == 0 ? '\n' : '\t');
                }
            }
        }
    }
}

int main()
{
    const char *suit[4] = {"Hearts", "Diamonds", "Clubs", "Spades"};
    const char *face[13] = {"Ace", "Deuce", "Three", "Four", "Five",
                    "Six", "Seven", "Eight", "Nine", "Ten",
                    "Jack", "Queen", "King"};
    int deck[4][13];

    for(int i = 0; i < 4; i++)
    {
        for(int j = 0; j < 13; j++)
        {
            deck[i][j] = 0;
        }
    }

    srand(time(0));

    shuffle(deck);
    deal(deck, face, suit);

    return 0;
}
