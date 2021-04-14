#include <stdio.h>
#include <unistd.h>

int main()

{
    
    int accountNumber = 0;
    float balance;
    float charges;
    float credits;
    float creditLimit;

    while (accountNumber != -1)

    {
            printf("Enter account number (-1 to end): ");
            scanf("%d", &accountNumber);

            if(accountNumber != -1)

            {
                printf("Enter beginning balance: ");
                scanf("%f", &balance);
    
                printf("Enter total charges: ");
                scanf("%f", &charges);
    
                printf("Enter total credits: ");
                scanf("%f", &credits);

                printf("Enter credit limit: ");
                scanf("%f", &creditLimit);

                if((balance + charges - credits) > creditLimit)

                {
                    printf("Account:      %d\n", accountNumber);
                    printf("Credit Limit: %.2f\n", creditLimit);
                    printf("Balance:      %.2f\n", balance + charges - credits);
                    printf("Credit Limit Exceeded\n");
                }

            }

    }


    return 0;

    
}
