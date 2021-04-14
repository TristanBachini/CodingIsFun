#include <stdio.h>
#include <unistd.h>

int main()
{
    int i = 1;
    do {
        printf("%i\n",i);
        i*= 2;
        sleep(1);
    }
    while(i < 100);

    return 0;
    
}