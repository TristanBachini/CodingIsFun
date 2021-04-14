#include <stdio.h>

int main()
{
    int inputNumber;
    int reverse = 0;

    printf("Enter a number: ");
    scanf("%d", &inputNumber);

    while (inputNumber != 0)
    {
        reverse = reverse*10;
        reverse = reverse + inputNumber%10;
        inputNumber = inputNumber/10;
    }

    printf("The reversed number is: %d", reverse);

    return 0;
    
}