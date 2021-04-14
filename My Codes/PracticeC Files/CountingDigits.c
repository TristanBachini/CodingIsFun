#include <stdio.h>

int main()
{

    int inputNumber;
    int reverseNumber;
    int counter = 0;

    printf("Enter number: ");
    scanf("%d", &inputNumber);


     while(inputNumber >= 10)
    {
        inputNumber == reverseNumber;
        inputNumber = inputNumber/10;
        ++counter;
    }

    printf("This is the counter: %d", counter);

    return 0;
    
}