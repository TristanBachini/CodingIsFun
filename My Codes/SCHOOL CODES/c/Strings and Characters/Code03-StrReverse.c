/*******************************************************************
 * Using gets and putchar
 ******************************************************************/
#include <stdio.h>

void reverse(const char const sentence[])
{
    if(sentence[0] == '\0')
    {
        return;
    }
    else
    {
        reverse(&sentence[1]);
        putchar(sentence[0]);
    }
}

int main()
{
    char sentence[80];

    printf("Enter a line of text:\n");
    gets(sentence);

    printf("\nThe line printed backwards is:\n");
    reverse(sentence);

    return 0;
}