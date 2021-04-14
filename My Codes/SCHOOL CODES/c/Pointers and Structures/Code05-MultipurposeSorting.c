/**********************************************************************
 * Multipurpose sorting program using function pointers
 *********************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define SIZE    20

void generateContent(int a[], int n)
{
    srand(time(0));
    for(int i = 0; i < n; i++)
    {
        a[i] = rand() % 100;
    }
}

void print(int a[], int n)
{
    for(int i = 0; i < n; i++)
    {
        if ((i % 5) == 0)
        {
            printf("\n");
        }

        printf("%4d, ", a[i]);
    }

    printf("\n");
}

int ascending(int a, int b)
{
    return b < a;
}

int descending(int a, int b)
{
    return b > a;
}

void insertionSort(int a[], int n, int (*compare)(int, int))
{
    for(int i = 1; i < n; i++)
    {
        int j = i - 1;
        int key = a[i];
        while((j >= 0) && (*compare)(a[j], key) > 0)
        {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = key;
    }
}

int main()
{
    int a[SIZE];

    printf("Before sorting:");
    generateContent(a, SIZE);
    print(a, SIZE);

    int order;
    printf("\nEnter 1 to sort in ascending order.\n"
           "Enter 2 to sort in descending order: ");
    scanf("%d", &order);

    if (order == 1)
    {
        insertionSort(a, SIZE, ascending);
        printf("\n\nArray items sorted in ascending order:");
    }
    else
    {
        insertionSort(a, SIZE, descending);
        printf("\n\nArray items sorted in descending order:");
    }

    print(a, SIZE);

    return 0;
}
