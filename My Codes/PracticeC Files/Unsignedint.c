#include <stdio.h>
#include <unistd.h>

int main ()
{
    printf("Size of int is %ld bytes", sizeof(float));
    for(unsigned int i = 1.0; ; i = i*2.5)
    {
        printf("%f\n", i);
        sleep(1);

    }

    return 0;

     
}
 