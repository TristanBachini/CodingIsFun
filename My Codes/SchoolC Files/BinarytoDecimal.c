
#include <stdio.h>
#include <math.h>
int Binary(long long n);
long long n;
int main()
{
 
    printf("Enter a binary number: ");
    scanf("%lld", &n);

    int Binary (long long n)
{
    int decimal = 0, i = 0, remainder;
    while (n!=0)
    {
        remainder = n%10;
        n /= 10;
        decimal += remainder*pow(2,i);
        ++i;
    }
    return decimal;
}

    
   
    printf("%lld in binary = %d in decimal", n, Binary(n));
    return 0;
}

