/* 
Richie   Xue
hw016
worked with Zidane Karim (pd 2)
advised by no one

***Goals***
Goal 0: The date representation can be used implementated in a daily weather forecast. 
Goal 1: The date representation can be used in a header of an assignment
Goal 2: The date representation can be used in a calendar
Goal 3: The date representation can be used in a birthday reminder
Goal 4: The date representation can be used in an alarm clock

***Fields***
int year;
int month;
int day;
int hour;
int minute;
int seconds;

***Methods***
0)
String yearMonthDay(int year, int month, int day); #will return a String in the format 'year-month-day', method will work for goals 0,1, and 2
1)
String birthdayRemind(int year, int month, int day, String name); will return a String inndicating that "It is 'name''s birthday!", method 
willwork for goal 3
2)
String alarmClock(int month, int day, int hour, int minutes, int seconds); #will return a String message indicating that the alarm has hit its
given time to activiate, method will work for goal 4
*/
