/**
 hw011: precedence and cast
 with arithmetic on DOUBLEs and INTs
 */

public class IntAndDoubleHolmes {

    public static void main(String[] commandLine) {
        System.out.println( "Fibonacci numbers:  "
                          + fib( 0)   // expecting 0
                          + System.lineSeparator()
                          + fib( 7)  // expecting 13
                          + System.lineSeparator()
                          + "Summations:  "
                          + sumThru( 0)  // edge case, expecting 0
                          + System.lineSeparator()
                          + sumThru( 4)  // expecting 10
                          + System.lineSeparator()
                          + sumThru( 99)  /* how Mr. Katz remembers the
                             phone number for where packages go at Stuy */
                          );
    }

    /**
      Return Fibonacci number at the given index.
      fib(0) --> 0
      fib(1) --> 1
      fib(2) --> 1
      fib(3) --> 2
     */
    private static int fib( int index) {

        /* To avoid computing the square root of 5 twice,
           reserve a 64-bit chunk of memory,
           tell Java to interpret its contents as a floating point value,
           and associate it with the name "sqrt5".
        */
        double sqrt5;
        // Have Java compute the square root of 5, and store it.
        sqrt5 = Math.sqrt( 5.0);

        /* precedences for the operators in Binet's formula, from
           https://introcs.cs.princeton.edu/java/11precedence/
           operator                precedence
           ---------------------   ----------
           +, - ("additive" ops)   11
           /  ("multiplicative")   12
           () ("cast")             13
        */
        return (int)(  (   Math.pow(1 + sqrt5, index)
                         - Math.pow(1 - sqrt5, index)
                       )
                       / Math.pow( 2, index) / sqrt5
                    );
    }

    /**
       Return the sum of the integers from 0 up to and including n
    */
    private static int sumThru( int n) {
        return n * (n+1) / 2;
    }
}
