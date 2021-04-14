#include <stdio.h>

int printText(int ave){

   if (ave > 100)
     {
     	printf("Please input a valid score (100-0)");
     }


     else if (ave >= 93)
     {
     	printf("MATALINO\n");
     }

     else if (ave >= 80)
     {
        printf("MAGALING\n");
     }

     else if (ave >= 60)
     {
     	printf("OK LANG\n");
     }

     else if (ave >= 0)
     {
     	printf("MAG-ARAL KA\n");
     }

     else
     	{
     	printf("Input a valid score") ;
     	}
   return 0;
}

int main()
{

     int x;
     printf("Enter first exam score: ");
     scanf ("%d",&x);

     int y;
     printf("Enter second exam score: ");
     scanf("%d",&y);

     int z;
     printf("Enter third exam score: ");
     scanf("%d",&z);


     printText((x + y + z)/3);
      printText((x + y + z)/3);

printText((x + y + z)/3);


     return 0;
}

