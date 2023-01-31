/*
Richie  Xue
hw017 & hw018
worked with no one
advised by no one
  Represent a date
 */

/*
Hw017 needs no fields. This stub code is just for reference
on the datatypes and names we aim to use.
    short year
    byte  month_0_11
    byte  day_1_31
*/
public class DateForApcs {
  public int year;
  public int  month_0_11;
  public int  day_1_31;
 
  public static String iso8601(int year, int month, int day) { //returns the date in the internation year-month-day format
    String dashMonth = "-";
    String dashDay = "-";
    if (month < 8) {
      dashMonth = "-0";
    }
    if (day < 9 ); {
      dashDay = "-0";
    }
    return year + dashMonth + (month + 1) + dashDay + day;
  }

  public static boolean isLeapYear(int year) { //checks for if given year is a leap year
    return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
  }
}
