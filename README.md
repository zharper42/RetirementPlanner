# RetirementPlanner
EE333 - Group 2 team project

Input Fields:
Initial Investment: Money available to you to immediately invest.
Monthly Investment: What you can allocate monthly to invest.
Annual Percentage Rate: The percent your investment returns each year.
Years = How long you want this investment to compound.

Results Fields:
Directly Invested = scenario where total amount directly invested 
  never compounds. (0% interest savings account).
Final Balance = Grand total after x years of compounding.
Dividend = What is collected monthly after compounding is finished.
  This is your retirement fund. (3% of balance every month)
Inflated Balance = The equivalent value of your future balance if
  you had it today. (Balance in today's dollars) (2.5% avg).
Inflated Dividend = The equivalent value of your future dividend if
  you had it today. (Dividend in today's dollars) (2.5% avg).

How it works:
Our application, Retirement Planner, uses a custom, intuitive GUI 
to read in certain information from the user including an initial 
investment amount , a monthly investment amount, an interest rate or 
APR, and the amount of years the investment will sit. The program will 
calculate the full value of the investment after x amount of years. 
It will also calculate and provide a “dividend” to be collected 
on a monthly basis from there on out rather than compounding. 
This amount will be what is collected for retirement. The full value 
of the investment as well as the monthly dividend will also be 
provided in inflated numbers, today’s dollars, at a rate of 2.5% 
per year on average.

Calculations are done on a monthly basis. At the begining of each
year the apr for the current balance is taken. The current year is
then calculated separately as new money is being added every
month. For example, the monthly investment added in january will
recieve the full APR since it will have been in the account for
the full 12 months of the year. However, the monthly investment
added in December will only recieve 1/12 of the APR having only
been compounding for 1 month by the end of the year. At the end
of the year the total for that year is added to the balance.

Group2:       
   Willaim Benefield <wbb31@uab.edu>
   Clayton Dalton <cgdalton@uab.edu>
   Luis Figueroa <alefigue@uab.edu>
   Zachary Harper <zharper@uab.edu>
   Daniel Pineda <mdpineda@uab.edu>
   Joe Wong <jawong1@uab.edu>
   
