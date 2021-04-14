#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include <string.h>


int main()
{

    int x = 0;
    char input[100];

    printf("Enter an encrypted sentence: ");
    scanf("%s", &input);

  
  for(int key = 1;key<26;key++)
  {
    printf("%i",input-key%26);
    for(int i = strlen(input)-1;i>=0;i--)
    {
      printf("%c",input-key%26);
    }
  }
}