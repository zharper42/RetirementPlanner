# RetirementPlanner
EE333 - Group 2 team project

Our application, Retirement Planner, will use a custom, intuitive GUI 
to read in certain information from the user including an initial 
investment amount , a monthly investment amount, an interest rate or 
APR, and the amount of years the investment will sit. The program will 
calculate the full value of the investment after x amount of years. 
It will also calculate and provide a “dividend” to be collected 
on a monthly basis from there on out rather than compounding. 
This amount will be what is collected for retirement. The full value 
of the investment as well as the monthly dividend will also be provided 
in inflated numbers, today’s dollars, at a rate of 2% per year on average.

This project is object oriented and contains two classes - Account and Planner.
The Account class creates and holds Account objects which contain the variables
listed below. The Planner class contains the main() method and will produce
an easy to read chart in the console.

Calculations are done on a monthly basis. At the begining of each
year the apr for the current balance is taken. The current year is
then calculated separately as new money is being added every
month. For example, the monthly investment added in january will
recieve the full APR since it will have been in the account for
the full 12 months of the year. However the monthly investment
added in December will only recieve 1/12 of the APR having only
been compounding for 1 month by the end of the year. At the end
of the year the total for that year is added to the balance.

Variables:
int years = the amount of years the investment compounds
double balance = main fund that experiences compounding
double monthly = monthly investment amount
double percent = annual percent return
double totalInvested = scenario where total amount directly 
  invested never compounds
double dividend = what is collected monthly after compounding 
  is finished (3% of balance)
double infBalance and infDividend = original variables in
  "today's dollars" (inflated versions)
double yrate and mrate = APR in decimal form and its
  monthly counterpart (yrate/12)
double inflation = yeah (2% per year average)
double monthYield = Yield for current month (resets every year)
double yearTotal = a mini balance for a specific year
  (resets every year)

Group2:       
   Willaim Benefield <wbb31@uab.edu>
   Clayton Dalton <cgdalton@uab.edu>
   Luis Figueroa <alefigue@uab.edu>
   Zachary Harper <zharper@uab.edu>
   Daniel Pineda <mdpineda@uab.edu>
   Joe Wong <jawong1@uab.edu>
   
