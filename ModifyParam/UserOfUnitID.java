public class UserOfUnitID {

    public static void main( String[] commandLine) {

        // start the framis model line
        UnitID framisUnitIdReference;
        framisUnitIdReference = new UnitID();
        framisUnitIdReference.suffix = "F";
        System.out.println( "via framisUIR: "
                          + framisUnitIdReference.getID() + ", "
                          + "class nextID = " + UnitID.nextID
                          );

        // similarly for the whatsit model line
        UnitID whatsitUnitIdReference;
        whatsitUnitIdReference = new UnitID();
        whatsitUnitIdReference.maxSoFar = UnitID.nextID;
        whatsitUnitIdReference.suffix = "W";
        System.out.println( "via whatsitUIR: "
                          + whatsitUnitIdReference.getID() + ", "
                          + "class nextID = " + UnitID.nextID
                          );

        // another reference
        UnitID favUnitIdReference;
        favUnitIdReference = framisUnitIdReference;
        System.out.println( "suffix via favUIR: "
                          + favUnitIdReference.suffix);

        favUnitIdReference = whatsitUnitIdReference;
        System.out.println( "suffix via favUIR: "
                          + favUnitIdReference.suffix);

        favUnitIdReference.suffix = "P";  // or "Y", or "A", etc.
        System.out.println( "suffix via whatsitUIR: "
                          + whatsitUnitIdReference.suffix);
    }
}
