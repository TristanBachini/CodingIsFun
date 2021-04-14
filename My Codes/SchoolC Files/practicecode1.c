#include <stdio.h>
#include <math.h>




int main()
{
    long long int binaryNumber; 
    int remainder;
    int multiplier;
    int n=0;
    long long int value=0;
   


    printf("Enter binary number:  ");
    scanf("%lld", &binaryNumber);


    while(binaryNumber > 0)
    {
        remainder = binaryNumber  % 2;
        
        if(remainder == 1)
        {
            value = value + pow(2, n);
        }
        else
        {    
         value += 0;  
        }
        


        binaryNumber = binaryNumber/10;


        ++n;
        


    }

  

    printf("Decimal number: %lld", value);


    return 0;

}