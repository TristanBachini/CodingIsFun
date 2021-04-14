#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>


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


void Decrypt(char message[STRING_LENGTH], int key)
{
	char ch;
	for(int i = 0; message[i] != '\0'; ++i)
	{
		ch = message[i];
		
		if(ch >= 'a' && ch <= 'z')
		{
			ch = ch - key;
			
			if(ch < 'a'){
				ch = ch + 'z' - 'a' + 1;
			}
			
			message[i] = ch;
		}
		else if(ch >= 'A' && ch <= 'Z')
		{
			ch = ch - key;
			
			if(ch < 'A'){
				ch = ch + 'Z' - 'A' + 1;
			}
			
			message[i] = ch;
		}

	}
	printf("%s\n", message);

}


int main()
{
    int choice = 0;

    

while (choice != 4)
{
    printf("\n1 Decrypt a sentence\n");
    printf("2 Crack a sentence\n");
    printf("3 Decrypt a file\n");
    printf("4 Exit\n");

    printf("Input the number of your choice: ");
    scanf("%d", &choice);



    if(choice == 1)
    {
        char message[100], ch;
	int i, key;
	
		printf("Enter key: ");
	scanf("%d", &key);
    fflush(stdin);


    
    printf("Enter a message to decrypt: ");
	gets(message);
  




	
	for(i = 0; message[i] != '\0'; ++i){
		ch = message[i];
		
		if(ch >= 'a' && ch <= 'z'){
			ch = ch - key;
			
			if(ch < 'a'){
				ch = ch + 'z' - 'a' + 1;
			}
			
			message[i] = ch;
		}
		else if(ch >= 'A' && ch <= 'Z'){
			ch = ch - key;
			
			if(ch < 'A'){
				ch = ch + 'Z' - 'A' + 1;
			}
			
			message[i] = ch;
		}
	}
	
	printf("Decrypted message: %s", message);
	}

    if(choice==2)
    {
        char sentence[STRING_LENGTH];

        int key;


        fflush(stdin);



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

        
    			
    }


    if(choice == 3)
    {

        char sentence[STRING_LENGTH];
        char cipher[STRING_LENGTH];
        int key;
        FILE *filePtr;


      printf("Enter key: ");
						scanf("%d", &key);
							fflush(stdin);


						printf("Enter file name: ");
						gets(sentence);
						if((filePtr = fopen(sentence, "r")) == NULL)
						{
							puts("File could not be opened\n");
						}
						else
						{
							fscanf(filePtr, "%[^\n]%*c", cipher);
							while(!feof(filePtr))
							{
							Decrypt(cipher, key);
							fscanf(filePtr, "%[^\n]%*c", cipher);
							}
						}  
    }

    
    
    
    }	



    return 0;
}

    

    
