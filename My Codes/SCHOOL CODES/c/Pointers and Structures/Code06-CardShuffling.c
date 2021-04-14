/****************************************************************
 * The card shuffling and deadling program using structures.
 ***************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct card
{
    const char *face;
    const char *suit;
};

typedef struct card Card;

void fillDeck(Card* const wDeck, const char* wFace[],
              const char* wSuit[])
{
    for(int i = 0; i < 52; i++)
    {
        wDeck[i].face = wFace[i % 13];
        wDeck[i].suit = wSuit[i / 13];
    }
}

void shuffle(Card* const wDeck)
{
    for(int i = 0; i < 52; i++)
    {
        int j = rand() % 52;
        Card temp = wDeck[i];
        wDeck[i] = wDeck[j];
        wDeck[j] = temp;
    }
}

void deal(const Card* const wDeck)
{
    for(int i = 0; i < 52; i++)
    {
        printf("%5s of %-8s%c", wDeck[i].face,
               wDeck[i].suit,
               (i + 1) % 2 ? '\t' : '\n' );
    }
}

int main()
{
    Card deck[52];
    const char *face[] = {"Ace", "Deuce", "Three",
                          "Four", "Five",
                          "Six", "Seven", "Eight",
                          "Nine", "Ten",
                          "Jack", "Queen", "King"};
    const char *suit[] = {"Hearts", "Diamonds",
                          "Clubs", "Spades"};

    srand(time(NULL));
    fillDeck(deck, face, suit);
    shuffle(deck);
    deal(deck);

    return 0;
}
