/**
 Represent a facility to generate UnitIDs
 */

public class UnitID {

    // class field: one value for whole class
    public static int nextID = 32767;

    // instance fields
    public int    maxSoFar;  // for this object
      // NOT max over all instances of the UnitId class
    public String suffix;

    /**
      @return an ID for the firm's next unit

      One sequence for the entire program;
      not one sequence for each model line.
     */
    public String getID() {
        nextID = nextID + 1;
        maxSoFar = nextID;
        return nextID
             + "-" + suffix;
    }

    public static void skipForward( int count) {
        nextID += count;
    }
}
