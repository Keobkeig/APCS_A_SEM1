/**
 modify some parameters
 */

public class UserOfModifyParam {

    public static void main( String[] commandLine) {

        // primitive type
        System.out.println( System.lineSeparator()
                          + "-----  primitive param  -----");
        double speedOfLight = 3e8;
        ModifyParam.gimmePrimitive( speedOfLight);
        System.out.println( "after gimmePrimitive: speedOfLight = "
                          + speedOfLight
                          );


        // reference type: change the REFERENCE
        System.out.println( System.lineSeparator()
                          + "-----  change the REFERENCE  -----");
        UnitID framisUnitIdReference = new UnitID();
        System.out.println( "before referenceChange: framisUnitIdReference "
                          + framisUnitIdReference
                          + "   maxSoFar = "
                          + framisUnitIdReference.maxSoFar
                          );
        ModifyParam.referenceChange( framisUnitIdReference);
        System.out.println( "after referenceChange: framisUnitIdReference "
                          + framisUnitIdReference
                          + "   maxSoFar = "
                          + framisUnitIdReference.maxSoFar
                          );


        // change the OBJECT that is referred to
        System.out.println( System.lineSeparator()
                          + "-----  change the OBJECT  -----");
        ModifyParam.objectChange( framisUnitIdReference);
        System.out.println( "after objectChange: framisUnitIdReference "
                          + framisUnitIdReference
                          + "   maxSoFar = "
                          + framisUnitIdReference.maxSoFar
                          );
    }
}
