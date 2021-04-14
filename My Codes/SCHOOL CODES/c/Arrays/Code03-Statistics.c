/*************************************************************
 * Passing arrays and individual array elements to functions.
 ************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define SIZE    100

/************************************************************
 * Prints the elements of an array
 *
 * Parameters:
 *   a - array whose elements is to be printed
 *   size - size of array a
 ***********************************************************/
void printArray(const int a[], const int size)
{
    for(int i = 0; i < size; i++)
    {
        if (i % 20 == 0)
        {
            printf("\n");
        }

        printf("%2d", a[i]);
    }

}
/*************************************************************
 * Computes the mean of the elements of an array
 *
 * Parameters:
 *   a - array whose mean of the elements is to be computed
 *   size - size of the array
 *
 * Return:
 *   Mean of the elements of array a
 ************************************************************/
int mean(const int a[], const int size)
{
    int total = 0;
    for(int i = 0; i < size; i++)
    {
        total += a[i];
    }
    return total / size;
}

/*************************************************************
 * Computes the mode of the elements of an array
 *
 * Parameters:
 *    a - array whose mode of the elements is to be computed
 *    size - size of the array
 *    modeValue - stores the mode of the elements of array a
 *    modeValueFrequency - stores the frequency of the mode of
 *          array a
 ************************************************************/
void mode(const int a[], const int size, int *modeValue, int *modeValueFrequency)
{
    int frequency[10];
    for(int i = 0; i < 10; i++)
    {
        frequency[i] = 0;
    }

    for(int i = 0; i < size; i++)
    {
        ++frequency[a[i]];
    }

    *modeValue = 0;
    *modeValueFrequency = 0;
    for(int i = 0; i < 10; i++)
    {
        if (frequency[i] > *modeValueFrequency)
        {
            *modeValueFrequency = frequency[i];
            *modeValue = i;
        }
    }
}

/**********************************************************
 * Sorts the elements of an array
 *
 * Parameters:
 *    a - array whose elements are to be sorted
 *    size - size of array a
 *********************************************************/
void bubbleSort(int a[], const int size)
{
    for(int i = 1; i < size; i++)
    {
        for(int j = 0; j < size - 1; j++)
        {
            if (a[j] > a[j + 1])
            {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
}

/**********************************************************
 * Computes the median of the elements of an array
 *
 * Parameters:
 *    a - array whose median is to be computed
 *    size - size of array a
 *********************************************************/
int median(const int a[], const int size)
{
    int tempA[size];
    for(int i = 0; i < size; i++)
    {
        tempA[i] = a[i];
    }

    bubbleSort(tempA, size);

    return tempA[size / 2];
}

int main()
{
    int response[SIZE];

    srand(time(NULL));
    for(int i = 0; i < SIZE; i++)
    {
        response[i] = 1 + rand() % 9;
    }

    printf("The random responses are:");
    printArray(response, SIZE);

    printf("\n\nMean is %d\n", mean(response, SIZE));
    int modeValue;
    int modeValueFrequency;
    mode(response, SIZE, &modeValue, &modeValueFrequency);
    printf("Mode is %d which occurred %d times.\n", modeValue, modeValueFrequency);
    printf("Median is %d\n", median(response, SIZE));

    return 0;
}
