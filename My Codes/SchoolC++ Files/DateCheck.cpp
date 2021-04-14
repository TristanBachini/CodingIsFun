#include <iostream>
#include <string>
#include <vector>
#include <cmath>
using namespace std;


int dayCheckerLeapYear(int day, int month, int year)
{

// count how many leap years had passed

int counter = 1800;
int limit = 1900;
int leap = 0;

while(counter < year)
{
    leap += 1;
    counter += 4;
    if (counter == limit)
    {
        if(counter % 400 == 0)
        {
            leap += 1;
        }

        counter += 4;
        limit += 100;
    }

}

if(month <= 2)
{
    if(day <= 29)
    {
        leap = leap - 1;
    }
}

int year1 = year - 1800;
int month1;
int monthday;

switch(month)
{
    case 1:
    month1 = 0;
    monthday =  0;
    break;

    case 2:
    month1 = 1;
    monthday =  31;
    break;

    case 3:
    month1 = 2;
    monthday = 59;
    break;

    case 4:
    month1 = 3;
    monthday = 90;
    break;

    case 5:
    month1 = 4;
    monthday =  120;
    break;

    case 6:
    month1 = 5;
    monthday = 151;
    break;

    case 7:
    month1 = 6;
    monthday = 181;
    break;
    
    case 8:
    month1 = 7;
    monthday = 212;
    break;

    case 9:
    month1 = 8;
    monthday = 243;
    break;

    case 10:
    month1 = 9;
    monthday = 273;
    break;

    case 11:
    month1 = 10;
    monthday = 304;
    break;

    case 12:
    month1 = 11;
    monthday = 334;
    break;


}

int finalDays = leap + year1*365 + day + monthday;

int dayChecker = finalDays % 7;

switch(dayChecker)
{
    case 0:
    cout<<"Tuesday";
    break;
    
    case 1:
    cout<<"Wednesday";
    break;

    case 2:
    cout<<"Thursday";
    break;

    case 3:
    cout<<"Friday";
    break;

    case 4:
    cout<<"Saturday";
    break;

    case 5:
    cout<<"Sunday";
    break;
    
    case 6:
    cout<<"Monday";
    break;
}


}





int dayCheckerNotLeapYear(int day, int month, int year)
{

int counter = 1804;
int limit = 1900;
int leap = 0;


while(counter < year)
{
    leap += 1;
    counter += 4;
    if (counter < year)
    {
    if (counter == limit)
    {
        if(counter % 400 == 0)
        {
            leap += 1;
        }
        
        counter += 4;
        limit += 100;
    }
    }

}



int year1 = year - 1800;
int month1;
int monthday;

switch(month)
{
    case 1:
    month1 = 0;
    monthday =  0;
    break;

    case 2:
    month1 = 1;
    monthday =  31;
    break;

    case 3:
    month1 = 2;
    monthday = 59;
    break;

    case 4:
    month1 = 3;
    monthday = 90;
    break;

    case 5:
    month1 = 4;
    monthday =  120;
    break;

    case 6:
    month1 = 5;
    monthday = 151;
    break;

    case 7:
    month1 = 6;
    monthday = 181;
    break;
    
    case 8:
    month1 = 7;
    monthday = 212;
    break;

    case 9:
    month1 = 8;
    monthday = 243;
    break;

    case 10:
    month1 = 9;
    monthday = 273;
    break;

    case 11:
    month1 = 10;
    monthday = 304;
    break;

    case 12:
    month1 = 11;
    monthday = 334;
    break;


}

int finalDays = leap + year1*365 + day + monthday;

int dayChecker = finalDays % 7;

switch(dayChecker)
{
    case 0:
    cout<<"Tuesday";
    break;
    
    case 1:
    cout<<"Wednesday";
    break;

    case 2:
    cout<<"Thursday";
    break;

    case 3:
    cout<<"Friday";
    break;

    case 4:
    cout<<"Saturday";
    break;

    case 5:
    cout<<"Sunday";
    break;
    
    case 6:
    cout<<"Monday";
    break;
}

return 0;
}

int main()
{
    int year;
    int day;
    int month;


    cout<<"Enter the month(1-12): ";
    cin>> month;

    cout<<"Enter the day: ";
    cin>> day;

    cout<<"Enter the year (From 1800): ";
    cin>> year;



    //check if leap year



    if(year % 4 == 0)
    {
      if(year % 100  == 0)
      {
          if(year % 400 == 0)
          {
              dayCheckerLeapYear(day, month, year);
          }
          else
          {
            dayCheckerNotLeapYear(day, month, year);
          }
          
      }
      else
      {
          dayCheckerLeapYear(day, month, year);
      }
    }

    else
    {
        dayCheckerNotLeapYear(day, month, year);
    }




    return 0;
}


