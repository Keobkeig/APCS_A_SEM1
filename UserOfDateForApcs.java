import java.sql.Date;

/*
Richie  Xue
hw017 & hw018
worked with no one
advised by no one
  Exercise the DateForApcs class
 */
public class UserOfDateForApcs {
    public static void main(String[] args) {
      DateForApcs july20th;
      DateForApcs july4th;
      july20th = new DateForApcs();
      july20th.year = 1969;
      july20th.month_0_11 = 6; 
      july20th.day_1_31 = 20;
      july4th = new DateForApcs();
      july4th.year = 2038;
      july4th.month_0_11 = 6; 
      july4th.day_1_31 = 4;

      System.out.println("Should return: '1920-3-3' " + DateForApcs.iso8601(1920, 2, 3));
      System.out.println("Should return: '2022-11-20' " + DateForApcs.iso8601(2022, 10, 20));
      System.out.println("Should return: '2021-5-24' " + DateForApcs.iso8601(2021, 4, 24));
      System.out.println("Should return: 'true' " + DateForApcs.isLeapYear(1600));
      System.out.println("Should return: 'false' " + DateForApcs.isLeapYear(2500));
      System.out.println("Should return: 'false' " + DateForApcs.isLeapYear(2022));
      System.out.println("Should return: 'true' " + DateForApcs.isLeapYear(2020));
      System.out.println("Should return: 'true' " + DateForApcs.isLeapYear(2016));
    }
}

            
          
