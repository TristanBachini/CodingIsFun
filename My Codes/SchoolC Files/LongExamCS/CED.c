#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define STRING_LENGTH 75

void caesarDecrypt(int key, char sentence[STRING_LENGTH])
{
	key = key % 26;
	for(int i = 0; i < strlen(sentence); i++)
    {
        if (!isalpha(sentence[i]))
        {
            printf("%c", sentence[i]);
            continue;
        }

        int offset = isupper(sentence[i]) ? 'A' : 'a';
        int sentenceCharIndex = sentence[i] - offset;
        int ciphertextCharIndex = (sentenceCharIndex - key + 26) % 26;
        char ciphertextChar = ciphertextCharIndex + offset;

        printf("%c", ciphertextChar);
    }
}



int main(int argc, char const *argv[])
{
	int menuChoice;
	int key;
	char sentence[STRING_LENGTH];
	char filename[20];

	do{
		fflush(stdin);
		printf("\nSelect process.\n");
		printf("1. Decrypt an encrypted sentence\n");
    	printf("2. Crack an encrypted sentence.\n");
    	printf("3. Decrypt an encrypted file.\n");
    	printf("4. Exit\n");

    	printf("Input: ");
    	scanf("%d", &menuChoice);
    	fflush(stdin);

    	switch(menuChoice)
    	{
    		case 1:
    			printf("\nInput key: ");
				scanf("%d", &key);
				key = key % 26;
				fflush(stdin);

				printf("\nInput sentence to decrypt:\n");
				gets(sentence);

				printf("\nDecrypted sentence is:\n");
				caesarDecrypt(key, sentence);

				printf("\n\n");
    			break;
    		case 2:
   				printf("\nInput sentence to decrypt:\n");
				gets(sentence);
				
				printf("\nPossible decryptions are:\n");
    			for (int i = 0; i < 26; ++i)
    			{
    				key = (i + 1) % 26;
    				caesarDecrypt(key, sentence);
    				printf("\n");
    			}

    			printf("\n\n");
    			break;
    		case 3:
    			printf("\nInput key: ");
				scanf("%d", &key);
				key = key % 26;
				fflush(stdin);

				printf("\nInput filename to decrypt (including filetype): \n");
				gets(filename);

				FILE * cipher = fopen(filename, "r");

				if (cipher  == NULL)
				{
					printf("Error. File not found.");
					break;
				}

				while(!feof(cipher))
				{					
					fscanf(cipher, "%[^\n]%*c", &sentence);
					caesarDecrypt(key, sentence);
					printf("\n");
				}

        		fclose(cipher);


				printf("\n\n");
    			break;
    		case 4:
				printf("\nThank you. Have a wonderful day.\n");
				break;
    		default:
    			printf("Error. Please input a correct value.\n");
    			break;
    	}

	}while(menuChoice != 4);


	return 0;
}