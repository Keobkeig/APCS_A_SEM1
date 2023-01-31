/**
   demo issues with checking for equality
 */
public class Equality {
    public static void main( String[] commandLine) {

        // primitives
        System.out.println( System.lineSeparator()
                          + "----- primitive -----");
        System.out.println( 2 + 3 == 7 - 2);
        System.out.println( 0.1 + 0.1 + 0.1 == 0.3 );

        // UnitID objects
        System.out.println( System.lineSeparator()
                          + "----- UnitID class -----");
        UnitID u0 = new UnitID();
        UnitID u1 = new UnitID();
        // Assignment is an operation, producing a value,
        // so you can chain assignments:
        u0.maxSoFar = u1.maxSoFar = UnitID.nextID - 1;
        u0.suffix   = u1.suffix   = "G";

        System.out.println( u0 == u1);

        // a third variable
        UnitID currentUnitID = u0;
        System.out.println( currentUnitID == u0);
        System.out.println( );


        // String, via operator new
        System.out.println( System.lineSeparator()
                          + "----- String, via operator new -----");
        String s0 = new String();
        String s1 = new String();
        System.out.println( "   s0: |" + s0 + "|" + System.lineSeparator()
                          + "   s1: |" + s1 + "|"
                          );

        System.out.println( s0 == s1);
        // // ok, but not usually what we care about

        // solution:
        System.out.println( s0.equals( s1) );
        System.out.println( s1.equals( s0) );


        // String, via String literal
        System.out.println( System.lineSeparator()
                          + "----- String, via String literal -----");
        s0 = "String literal, which is interned";
        s1 = "String literal, which is interned";
        System.out.println( "   s0: |" + s0 + "|" + System.lineSeparator()
                          + "   s1: |" + s1 + "|"
                          );

        System.out.println( s0 == s1);
        System.out.println( s0.equals( s1) );
        System.out.println( s1.equals( s0) );


        // UnitID.equals
        System.out.println( System.lineSeparator()
                          + "----- UnitID.equals -----");
        System.out.println( u0 == u1); // compare references again

        // fields were initialized to match, above
        System.out.println( u0.equals( u1) );

        u1.suffix = "notG";  // now this field differs
        System.out.println( u0.equals( u1) );
    }
}
