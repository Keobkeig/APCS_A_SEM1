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

       @return
     */
    public boolean equals( UnitID other) {
        return suffix.equals( other.suffix)
               && maxSoFar == other.maxSoFar;
    }

    /**
      @return an ID for the firm's next unit

      One sequence for the entire program;
      not one sequence for each model line.
     */
    public String getID() {
        nextID = nextID + 1;
        maxSoFar = nextID;
        return buildID();
    }

    /**
      Leave "count" ids unused
     */
    public static void skipForward( int count) {
        nextID += count;
    }

    /**
      @return a human-readable representation of this UnitID
     */
    public /* instance */ String toString() {
        return "most recent ID: " + buildID();
    }

    /**
      @return an id, built from the parts
     */
    private String buildID() {
        return nextID + "-" + suffix;
    }
}