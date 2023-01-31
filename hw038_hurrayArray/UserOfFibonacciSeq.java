/**
 *  Richie   Xue
    hw038
    worked with no one
    advised by no one
   Exercise the FibonacciSeq class
 */
public class UserOfFibonacciSeq {
    public static void main( String[] commandLine) {

        // first 8 Fibonacci numbers, starting a at 1
        // expecting 1, 1, 2, 3, 5, 8, 13, 21
        FibonacciSeq thruF8 = new FibonacciSeq();
        thruF8.gimme8();

        System.out.println(
            System.lineSeparator()
          + "----- first 8 Fibonacci numbers -----"
          + System.lineSeparator()
          + thruF8
          );
    }
}
