/**
  use two String methods
 */

public class StringParts {
    public static void main(String[] commandLine) {
        String sand = "bar";
        // indexes:    012  pro tip: labeling strings' indexes saves errors

        int size;
        size = sand.length();
        System.out.print( size);
        System.out.println( " ...expecting 3");

        System.out.println( sand.substring(0,2)  + " ...expecting 'ba'");
        System.out.println( sand.substring(0,3)  + " ...expecting 'bar'");
        // System.out.println( sand.substring(0,4)  + " ...expecting error OutOfBounds");
        System.out.println( sand.substring(1,2)  + " ...expecting 'a'");
        System.out.println( sand.substring(1,1)  + " ...expecting ''");
        System.out.println( sand.substring(1)    + " ...expecting 'ar'");
        // System.out.println( sand.substring(1,7)  + " ...expecting error OutOfBounds");
        // System.out.println( sand.substring(7)    + " ...expecting error OutOfBounds");
        
        // The substring method can be applied to any String expression.
        System.out.println(
             "a literal representation of a string".substring(10, 13)
        //              1         2         3           
        //    01234567890123456789012345678901234567890
           + " ...expecting 'rep'");
        System.out.println(
            ("an expression " + "that produces a string").substring(7)
        //              1              2         3           
        //    01234567890123     456789012345678901234567890
          + " ...expecting 'ession that produces a string'");
        System.out.println(
            "...including substring".substring(8).substring(2, 7)
        //             1         2         3           
        //   01234567890123456789012345678901234567890    
        //           01234567890 
          + " ...expecting 'ng su'");

    }
}
