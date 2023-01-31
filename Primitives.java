/**
 Demonstrate Java syntax for number semantics
 */

public class Primitives {
    
    public static void main(String[] commandLine) {
        System.out.println( floatingPoint( 6.0)
                          + System.lineSeparator()
                          + integer( 11)
                          );
    }

    /**
      compute a floating point value
     */
    private static double floatingPoint( double changeMe) {

        /* Reserve a 64-bit chunk of memory,
           tell Java to interpret its contents as a floating point value,
           and associate it with the name "intermediateValue".
        */
        double intermediateValue;
        
        /* Calculate a floating point number and 
           store it in the memory location named "intermediateValue".
        */
        intermediateValue = changeMe / 2.0;
        
        return Math.sqrt( Math.pow( intermediateValue, 4e0));
    }

    /**
      compute an integer value
     */
    private static int integer( int changeMe) {

        /* Reserve a 32-bit chunk of memory,
           tell Java to interpret its contents as an integer value,
           and associate it with the name "intermediateValue".
        */
        int intermediateValue;

        /* Calculate an integer number and 
           store it in the memory location named "intermediateValue".
        */
        intermediateValue = changeMe / 2;

        return intermediateValue * 3;
    }

}
