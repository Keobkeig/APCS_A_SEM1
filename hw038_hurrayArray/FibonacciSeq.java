/**
 *  Richie   Xue
    hw038
    worked with no one
    advised by no one
   Represent a Fibonacci sequence
 */
public class FibonacciSeq {

    // Create a private instance field to eventually
    // hold a reference to an array of int values.
    // your code here
    private int[] fibArr;


    /**
       Initialize this object with an array of the
       first 8 Fibonacci numbers, starting at 1.
     */
    public void gimme8() {
      fibArr = new int[8];
      fibArr[0] = 1;
      fibArr[1] = 1;
      fibArr[2] = fibArr[0] + fibArr[1];
      fibArr[3] = fibArr[1] + fibArr[2];
      fibArr[4] = fibArr[2] + fibArr[3];
      fibArr[5] = fibArr[3] + fibArr[4];
      fibArr[6] = fibArr[4] + fibArr[5];
      fibArr[7] = fibArr[5] + fibArr[6];
      // fibArr[8] = fibArr[6] + fibArr[7];
    }


    /**
       @return a string representation of this instance
     */
    public String toString() {
        String result;
        result = "the sequence: "
                 + fibArr[0] + ", " + fibArr[1] + ", " + fibArr[2] + ", " + fibArr[3] + ", " + fibArr[4] + ", " + fibArr[5] + ", " + fibArr[6] + ", " + fibArr[7]
                 ;
        result += "   Number of array entries available: " + fibArr.length;
        return result;
    }

}
