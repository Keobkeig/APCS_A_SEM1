/**
 Demo UnitID
 */

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

        // sim. for the whatsit model line
        UnitID whatsitUnitIdReference;
        whatsitUnitIdReference = new UnitID();
        whatsitUnitIdReference.maxSoFar = UnitID.nextID;
        whatsitUnitIdReference.suffix = "W";
        System.out.println( "via whatsitUIR: "
                          + whatsitUnitIdReference.getID() + ", "
                          + "class nextID = " + UnitID.nextID
                          );
    }
}