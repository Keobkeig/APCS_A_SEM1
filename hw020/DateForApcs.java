/**
  Represent a date

  Richie Xue
  hw020
  worked with Zidane Karim, Anthony Chen, Vanessa Huang
  advised by no one
 */
public class DateForApcs {


    // instance fields
    public short year;
    public byte  month_0_11;
    public byte  day_1_31;
    
    static int REPRESENTS_YEARS_STARTING = 1600;
    static int REPRESENTS_YEARS_BEFORE   = 2501;
    static int currentYear = 2022;
    static int weekdayAtCurrentYearStart = 6;

    /**
      @return an ISO-8601 format of the date
      Processing courtesy of Intia
     */
    public static String iso8601( short year
                                , byte month_0_11
                                , byte day_1_31
                                ){
        String afterYear = "-"; 
        String afterMonth = "-"; 
        if( month_0_11 <= 8) afterYear =  "-0";
        if( day_1_31 <= 9)   afterMonth = "-0";
        return year + afterYear 
             + (month_0_11 + 1) + afterMonth
             + day_1_31;
    }

    public static boolean isLeapYear( short year) {
        return    year % 400 == 0
               ||    year % 4 == 0
                  && year % 100 != 0
               ;
    }


    public boolean isEarlyJuly() {
        return    month_0_11 < 6     // before July
               ||
                     month_0_11 == 6    // in July, so...
                  && day_1_31 < 16;   // check the day
         /* If neither of those is true, the date must
            be in a month after July.
         */
    }

    public static void advanceCurrentYear() {
        currentYear++;
        if (isLeapYear((short) (currentYear - 1))) weekdayAtCurrentYearStart = (weekdayAtCurrentYearStart + 2) % 7; 
        else                                 weekdayAtCurrentYearStart = (weekdayAtCurrentYearStart + 1) % 7;
    }
}