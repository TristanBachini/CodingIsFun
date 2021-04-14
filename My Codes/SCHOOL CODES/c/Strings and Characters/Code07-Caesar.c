/*******************************************************************
 * Caesar cipher
 ******************************************************************/
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

#define STRING_LENGTH   50

int main(int argc, char const *argv[])
{

    if (argc != 2)
    {
        printf("Usage: ./caesar k");
        return 1;
    }

    int key = atoi(argv[1]) % 26;

    char plaintext[STRING_LENGTH];
    printf("Plaintext: ");
    scanf("%s", plaintext);

    for(int i = 0; i < strlen(plaintext); i++)
    {
        if (!isalpha(plaintext[i]))
        {
            printf("%c", plaintext[i]);
            continue;
        }

        int offset = isupper(plaintext[i]) ? 'A' : 'a';
        int plaintextCharIndex = plaintext[i] - offset;
        int ciphertextCharIndex = (plaintextCharIndex + key) % 26;
        char ciphertextChar = ciphertextCharIndex + offset;

        printf("%c", ciphertextChar);
    }
    printf("\n");

    return 0;
}
