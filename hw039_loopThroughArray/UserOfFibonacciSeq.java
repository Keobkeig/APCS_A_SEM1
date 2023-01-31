/**
    Richie   Xue
    hw039
    worked with no one
    advised by no one
   Exercise the FibonacciSeq class
 */
public class UserOfFibonacciSeq {
    public static void main( String[] commandLine) {

        // first 8 Fibonacci numbers, starting a at 1
        FibonacciSeq thruF8 = new FibonacciSeq();
        FibonacciSeq thruF16 = new FibonacciSeq();
        FibonacciSeq thruF5 = new FibonacciSeq();
        thruF16.seq = new int[16]; 
        thruF5.seq = new int[5];
        thruF8.seq = new int[8];
        thruF16.gimme8();
        thruF5.gimme8();
        thruF8.gimme8();

        System.out.println(
            System.lineSeparator()
          + "----- first 8 Fibonacci numbers -----"
          + System.lineSeparator()
          + thruF8
          + System.lineSeparator()
          + thruF16
          + System.lineSeparator()
          + thruF5
          );
    }
}
