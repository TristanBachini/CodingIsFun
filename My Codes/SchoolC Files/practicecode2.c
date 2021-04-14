#include <stdio.h>
#include <math.h>



int main()
{

    int number;
    int number1;
    int counter;
    int counter1;
    int newNumber = 0;
    int remainder;
    int reverse;
    int reversedNumber;

    printf("Enter a number: ");
    scanf("%d", &number);

    number1 = number;

    while(number1 != 0)
    {
        number1 /= 10;
        ++counter1;

    }

    

    while(counter1 != 0)
    {
        remainder = number % 10;
        newNumber += pow(10, counter1-2)*remainder;
        number /= 10;
        --counter1;


    }


     printf("%d", newNumber);


}

