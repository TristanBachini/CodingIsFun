#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Node
{
    char name[50];
    struct Node *nextPtr;
} Node;

void insert(Node **list, char *key)
{
    Node *newNode = (Node *)malloc(sizeof(Node));
    strcpy(newNode->name, key);
    newNode->nextPtr = NULL;
        if(*list==NULL)
        {
            *list = newNode;
        }
        else
        {
            Node *currentPtr = *list;
            Node *prevPtr = NULL;
          
            while(currentPtr!=NULL && strcmp(currentPtr->name, newNode->name)<0)
            {
                	prevPtr = currentPtr;
                	currentPtr = currentPtr->nextPtr;
            }
            newNode->nextPtr = currentPtr;
            if (prevPtr == NULL)
            {
                *list = newNode;
            }
            else
            {
                prevPtr->nextPtr = newNode;
            }
        }
}

void printList(Node *currentPtr)
 {
     // If list is empty
     if(currentPtr == NULL)
     {
         puts("List is empty.\n");
     }
     else
     {
         puts("The list is:");

         // while not the end of the list
         while(currentPtr != NULL)
         {
             printf("%s --> ", currentPtr->name);
             currentPtr = currentPtr->nextPtr;
         }

         puts("NULL\n");
     }
 }
 void reverseList(Node **list)
 {
         
    Node *prevPtr, *currentPtr;
    Node *head = *list;
    if(head != NULL)
    {
        prevPtr = head;
        currentPtr = head->nextPtr;
        head = head->nextPtr;
        prevPtr->nextPtr = NULL;
            while(head != NULL)
            {
                head = head->nextPtr;
                currentPtr->nextPtr = prevPtr;

                prevPtr = currentPtr;
                currentPtr = head;
            }
        head = prevPtr;
        *list = head;
    }
 }

int main()
{
    FILE *gotPtr;
    Node *nameListPtr = NULL;

    if ((gotPtr = fopen("GOT.txt", "r")) == NULL)
    {
        puts("File could not be opened\n");
    }
    else
    {
        char name[50];
        fscanf(gotPtr, "%[^\n]%*c", name);
        while(!feof(gotPtr))
        {
            insert(&nameListPtr, name);
            fscanf(gotPtr, "%[^\n]%*c", name);
        }
        fclose(gotPtr);

        printf("Content of list:\n");
        printList(nameListPtr);

        reverseList(&nameListPtr);
        printf("\n\nContents of the list in reverse:\n");
        printList(nameListPtr);
    }

    return 0;
}
