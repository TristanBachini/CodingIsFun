#include <stdio.h>
#include <math.h>

int main()

{
    int counter = 0;
    int inputNumber;
    int reverseNumber = 0;
    int answer;
    int remainder;
    int finalAnswer;



    printf("Enter the number: ");
    scanf("%d", &inputNumber);

    reverseNumber = inputNumber+reverseNumber;

    while(inputNumber >= 10)
    {
        
        inputNumber=  inputNumber/10;
        ++counter;
    }


    while(reverseNumber > 0)
    {
        remainder = reverseNumber%10;
        answer  = pow(10, counter)*remainder;
        finalAnswer = finalAnswer + answer;
        reverseNumber = reverseNumber/10;
        counter = counter-1;

    

    }


    printf("The reversed number is: %d", answer);

    return 0;
    
}

