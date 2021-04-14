#include <stdio.h>

#define SIZE 20


void printarray(const int array2[], const int Size)
{
    int i =  0;
  
    printf("These are the entered numbers\n");

    while (i<SIZE)
    {
        printf("%d\n", array2[i]);
        ++i;
    } 
}

void printarray2(const int array3[], const int size)
{
  int i = 0;
    int x=0;
    int y=0;
    int none[size];
    int z=0;
    int newsize=0;
    {
        for(int x=i+1;z<size; x++)
        {
            if(array3[i]==array3[x])
            {
                y++;
            }
        }
        if (y==0)
        {
            none[x]=array3[i];
            z++;
            newsize++;
        }

   y=0;
    }
    printf("\nNew Array (No Duplicate): \n");
    printarray(none, newsize);
}

int main()

{
    int i = 0;
    
    int array1[SIZE];

     printf("Enter 20 numbers:\n");


    while(i<SIZE)
    {
   
    scanf("%d", &array1[i]);
    i++;
    }

    printarray(array1, SIZE);

 
    printarray2(array1, SIZE);


    return 0;
    
}