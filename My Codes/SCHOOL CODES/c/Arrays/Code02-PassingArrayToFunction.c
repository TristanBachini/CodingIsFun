/*************************************************************
 * Passing arrays and individual array elements to functions.
 ************************************************************/
#include <stdio.h>

#define SIZE    5

void modifyArray(int b[], int size)
{
    for(int j = 0; j < size; j++)
    {
        b[j] *= 2;
    }
}

void modifyElement(int e)
{
    printf("Value in modifyElement is %d\n", e *= 2);
}

int main()
{
    int a[SIZE] = {0, 1, 2, 3, 4};

    printf("Effects of passing entire array call "
           "by reference:\n\nThe values of the "
           "original array are:\n");
    for(int i = 0; i < SIZE; i++)
    {
        printf("%3d", a[i]);
    }

    printf("\n");
    modifyArray(a, SIZE);       // passed call by reference
    printf("The values of the modified array are:\n");
    for(int i = 0; i < SIZE; i++)
    {
        printf("%3d", a[i]);
    }

    printf("\n\n\nEffects of passing array element call "
           "by value:\n\nThe value of a[3] is %d\n", a[3]);
    modifyElement(a[3]);
    printf("The value of a[3] is %d\n", a[3]);

    return 0;
}
