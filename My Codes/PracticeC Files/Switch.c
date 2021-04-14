#include <stdio.h>

int main()
{
    int grade;
    int aCount = 0;
    int bCount = 0;
    int cCount = 0;
    int fCount = 0;

    printf("Enter the letter grades");
    printf("Enter the EOF character to end input");

    while(grade = getchar())
{
    switch(grade)
    {
        case 'A': case 'a':
        ++aCount;
        break;

        case 'B': case 'b':
        ++bcount;
        break;
        
    }
}
}