#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>

#define SIZE 50
#define NAME 20
#define YEAR 2019

typedef struct Health_Profile
{
    char first[NAME];
    char last[NAME];
    char gender;
    int day, month, year;
    int age;
    float  height, weight, BMI;
    float Maximal, LTarget, HTarget;
}Profile;

void Menu();
void Add();
void Show();
int Exit();
int Age();
float Maximal();
float LTarget();
float HTarget();
float BMI();

int main()
{
    Profile Start[SIZE];
    int count=0;
    Menu(Start, count);
return 0;
}

void Menu(Profile menu[SIZE], int counter)
{
    char choice;
    int x;
    printf("A. Add a profile\nB. Show a Profile\nC. Exit program\n\nSelect your choice: ");
    scanf("%c", &choice);
        fflush(stdin);
        switch (toupper(choice))
        {
            case 'A' :  Add(menu, counter); 
                        break;
            case 'B' :  {printf("Enter Patient ID: ");
                        scanf("%d", &x);
                        Show(menu, x);
                        Menu(menu, counter);
                        break;}
            case 'C' :  Exit(); 
                        break;
            default : Menu(menu, counter); 
                        break;
        }
}

void Add(Profile add[SIZE], int id)
{
    fflush(stdin);
    printf("Input First Name: ");
        scanf("%s[^\n]", &add[id].first);
        fflush(stdin);
    printf("Input Last Name: ");
        scanf("%s[^\n]", &add[id].last);
        fflush(stdin);
    printf("Input Gender (M for male, F for Female): ");
        scanf("%c", &add[id].gender);
        fflush(stdin);
    printf("Input Date of Birth\nDay(dd): ");
        scanf("%d", &add[id].day);
        fflush(stdin);
    printf("Day(mm): ");
        scanf("%d", &add[id].month);
        fflush(stdin);
    printf("Year(yyyy): ");
        scanf("%d", &add[id].year);
        fflush(stdin);
        add[id].age = Age(add, id);
        add[id].Maximal = Maximal(add, id);
        add[id].LTarget = LTarget(add, id);
        add[id].HTarget = HTarget(add, id);
    printf("Input Height(inches): ");
        scanf("%f", &add[id].height);
        fflush(stdin);
    printf("Input Weight(pounds): ");
        scanf("%f", &add[id].weight);
        fflush(stdin);
        add[id].BMI = BMI(add, id);

    printf("\n\n\n");
    Show(add, id);
    id++;
    Menu(add, id);

}

int Age(Profile age[SIZE], int id, int Age)
{

    if(age[id].month<=10)
    {
       Age= YEAR-age[id].year;
    }
    else
    {
        Age = YEAR-age[id].year - 1;
    }
    
    return Age;
}
float Maximal(Profile max[SIZE], int id)
{
    return (220 - max[id].age);
}
float LTarget(Profile ltarget[SIZE], int id)
{
    return ((ltarget[id].Maximal)*0.50);
}
float HTarget(Profile htarget[SIZE], int id)
{
    return ((htarget[id].Maximal)*0.85);
}
float BMI(Profile bmi[SIZE], int id)
{
    return (((bmi[id].weight)*703)/((bmi[id].height)*(bmi[id].height)));
}

void Show(Profile show[SIZE], int id)
{
    printf("\n\nPatient ID: %d\n", id);
    printf("Name: %s, %s\n", &show[id].last, &show[id].first);
    printf("Gender: %c\n", show[id].gender);
    printf("Date of Birth (dd/mm/yyyy): %02d/%02d/%04d\n", show[id].day, show[id].month, show[id].year);
    printf("Age: %d\n", show[id].age);
    printf("Height: %.2f\tWeight: %.2f\n", show[id].height, show[id].weight);
    printf("Maximal Heart Rate: %.2f\nTarget Heart Rate: %.2f to %.2f\n", show[id].Maximal, show[id].LTarget, show[id].HTarget);
    printf("BMI: %.2f\n", show[id].BMI);
        if(show[id].BMI<18.5)
        {
            printf("Rating: Underweight\n");
        }
        else if((show[id].BMI>=18.5)&&(show[id].BMI)<25)
        {
            printf("Rating: Normal Weight\n");
        }
        else if((show[id].BMI>=25)&&(show[id].BMI)<30)
        {
            printf("Rating: Overweight\n");
        }
        else
        {
            printf("Rating: Obese\n");
        }
    printf("BMI Values Chart: \n");
	printf("<18.5\tUnderweight\n18.5-24.99\tNormal Weight\n25-29.99\tOverweight\n>30\tObese\n\n");
    fflush(stdin);
}
 
int Exit()
{
    printf("\n\n\nThank you!\n");
return 0;
}