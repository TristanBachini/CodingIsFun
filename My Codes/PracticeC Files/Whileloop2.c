#include <stdio.h>
#include <unistd.h>

int main ()
{
    int i = 1;
    while (i<100)
    {
        printf("%i\n", i);
        i*= 2;
        sleep(1);
    }
    return 0;
    
}

