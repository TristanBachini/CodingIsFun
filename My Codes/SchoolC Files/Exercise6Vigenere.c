#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include <string.h>

#define STRING 50

int main (int argc, char* const argv[])
{
  //one command-line argument limit

  if(argc!=2)
  {
      printf("USage: ./vigenere.exe k");
      return 1;

  }

  for (int x=0; x<strlen(argv[1]); x++)
  {
      if(!isalpha(argv[1][x]))
      {
          printf("usage: ./vigenere.exe k");
          return 1;

      }
  }

  //key

  int key[strlen(argv[1])];

  for(int y=0;  y<strlen(argv[1]); y++)
  {
      if(isupper(argv[1][y]))
      {
          key[y]=argv[1][y]-65;
      }
      else
      {
          key[y]=argv[1][y] - 97;
      }
  }
//User-input for plain text
    printf("plaintext: ");
    char plaintext[STRING];
    gets(plaintext);

    printf("ciphertext: ");

// encryption part
int v = 0;
for(int z=0; z<strlen(plaintext); z++)
{
    if(!isalpha(plaintext) || isspace(plaintext))
    {
        printf("%c", plaintext[z]);
        continue;
    }

    int offset = isupper(plaintext[z]) ? 'A' : 'a';
    int plaintextIndex = plaintext[z] - offset;
    int ciphertextIndex = (plaintextIndex + key[v]) % 26;

    if(v<strlen(argv[1]))
    {
        v++;
        if(v>= strlen(argv[1]))
        {
            v = 0;
        }
    }
    char ciphertext =  ciphertextIndex + offset;
    printf("%c", ciphertext);
}

printf("\n");
    return 0;
}