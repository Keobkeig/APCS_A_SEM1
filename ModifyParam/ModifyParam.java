/**
 Demo results of modifying a parameter
 */
public class ModifyParam {

    /**
      primitive param
     */
    public static void gimmePrimitive( double c) {
        System.out.println( "param: " + c);

        // change param variable and display new value
        c = 2.997e8;
        System.out.println( "param after change: " + c);
    }

    /**
      change a reference param
     */
    public static void referenceChange( UnitID u) {
        System.out.println( "reference in param: " + u
                          + "  maxSoFar = " + u.maxSoFar
                          );

        // change param variable and display new value
        u = new UnitID();
        u.maxSoFar = -7;
        System.out.println( "reference to new object: " + u
                          + "  maxSoFar after change to param = "
                          + u.maxSoFar
                          );
    }


    /**
      change an object, given a reference to it
     */
    public static void objectChange( UnitID u) {
        System.out.println( "reference in param: " + u
                          + "  maxSoFar = " + u.maxSoFar
                          );

        // change param variable and display new value
        // REMOVED:   u = new UnitID();
        u.maxSoFar = 2;
        System.out.println( "reference in param: " + u
                          + "  maxSoFar after change = "
                          + u.maxSoFar
                          );
    }
}
