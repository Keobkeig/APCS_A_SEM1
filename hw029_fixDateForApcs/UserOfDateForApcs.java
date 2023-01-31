/** 
  Richie   Xue
  hw029
  worked with Intia Ibnah pd 7
  advised by no one
  */ 
public class UserOfDateForApcs {

    public static void main( String[] commandLine) {
        DateForApcs nineElevenApcs;
        nineElevenApcs = new DateForApcs();
        nineElevenApcs.year = 2001;
        nineElevenApcs.month_0_11 = 8;
        nineElevenApcs.day_1_31 = 11;

        
        // hw018#4, from Piazza@130
        DateForApcs moonLanding =   myDateForApcs( 1969, 7, 20);
        DateForApcs futureTrouble = myDateForApcs( 2038, 7,  4);
        System.out.println();

        // display limits of the years that this class can represent
        System.out.println( System.lineSeparator()
                  + "----- limits of years -----");
        System.out.println( DateForApcs.REPRESENTS_YEARS_STARTING );
        System.out.println( DateForApcs.REPRESENTS_YEARS_BEFORE );

        //advanceCurrentYear test
        System.out.println( System.lineSeparator()
                          + "----- advanceCurrentYear test -----");
        advanceTest(nineElevenApcs);
        advanceTest(nineElevenApcs);
        advanceTest(nineElevenApcs);
        advanceTest(nineElevenApcs);

        // iso8601 test
        System.out.println( System.lineSeparator()
                          + "----- iso8601 test -----");
        System.out.println( //expect 2001-09-11
           nineElevenApcs.toString());
        System.out.println();

        // isLeapYear tests
        leapTest(nineElevenApcs);
        leapTest( moonLanding);
        leapTest( futureTrouble);
        System.out.println();

        // hw018#5 isEarlyJuly
        earlyTest( moonLanding);
        earlyTest( futureTrouble);

        // change futureTrouble to other dates to test
        futureTrouble.month_0_11 = 05;  // June precedes July 16
        futureTrouble.day_1_31 = 17;
        earlyTest( futureTrouble);

        // early November follows July 16
        futureTrouble.month_0_11 = 10;
        futureTrouble.day_1_31 = 12;
        earlyTest( futureTrouble);
    }


    /**
      Display starts of years with leaping days
     */
    private static void advanceTest(DateForApcs d) {
        d.advanceCurrentYear();
        System.out.println( DateForApcs.currentYear
                          + " starts on day "
                          + DateForApcs.weekdayAtCurrentYearStart);
    }


    /**
      Display whether a date is before July 16 in its year
     */
     private static void earlyTest( DateForApcs d) {
        String notOrNothing; // string " not" or nothing

        if( d.isEarlyJuly())
             notOrNothing = "";
        else notOrNothing = " not";

        System.out.println(
            d.toString()
          + " is" + notOrNothing
          + " before July 16 in its year"
          );
     }


    /**
      Build, display, and return a DateForApcs
     */
    private static
    DateForApcs myDateForApcs( int yyyy
                             , int mm
                             , int dd
                             ) {
        DateForApcs myDate;
        myDate = new DateForApcs();

        myDate.year = (short) yyyy;
        myDate.month_0_11 = (byte) (mm - 1);
        myDate.day_1_31 = (byte) dd;

        // check
        System.out.println(
            "built: "
          +  myDate.toString()

          + " ...expecting " + yyyy + "-" + mm + "-" + dd
          + " possibly with 0s added"
          );

        return myDate;
     }


    /**
      Display whether the year is a leap year.
     */ 
    public static void leapTest(DateForApcs d) {
        String notOrNothing; // string " not" or nothing

        if(d.isLeapYear())
             notOrNothing = "";
        else notOrNothing = " not";

        System.out.println( d.year + " is"
                          + notOrNothing
                          + " a leap year"
                          );
    }
}



