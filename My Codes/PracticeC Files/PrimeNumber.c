#include <stdio.h>

int main(int argc, char const *argv[])
{

    int number;
    printf("Input a number: ");
    scanf("%d", &number);

    if ((number ==0 || number ==1))
    {
        printf("%d is not prime!\n", number);
    }
    else
    {
        int isPrime = 1;
        for(int i = 2; i  < number; i++)
        {
            if (number % i == 0)
            {
                printf("%d is not prime!\n", number);
                isPrime = 0;
                break;
            }
        }

        if (isPrime == 1)
        {
            printf("%d is prime!", number);
        }
    }

    return 0;
}