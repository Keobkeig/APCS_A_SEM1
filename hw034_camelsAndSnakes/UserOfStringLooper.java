/**
    Richie   Xue
    hw034
    worked with Intia Ibnah (pd7)
    advised by no one
  Exercise the StringLooper class
 */

public class UserOfStringLooper {
    public static void main( String[] commandLine) {
        StringLooper s0 = new StringLooper();

        // toVariablesFormat
        System.out.println( System.lineSeparator()
                          + "----- toVariablesFormat -----");
        s0.source = "A_SNAKE_CASE_STUB";
        System.out.println( s0.toVariablesFormat());
        
        StringLooper s1 = new StringLooper();
        s1.source = "HEY_STUYPY";
        //           0123456789
        StringLooper s2 = new StringLooper();
        s2.source = "YESTERDAYS_NEWS";

        System.out.println(s1.toVariablesFormat());
        System.out.println(s2.toVariablesFormat());


        // toConstantsFormat
        System.out.println( System.lineSeparator()
                          + "----- toConstantsFormat -----");

        s0.source = "aCamelCaseStub";
        s1.source = "heyStuypy";
        s2.source = "yesterdaysNews";

        System.out.println( s0.toConstantsFormat());
        System.out.println( s1.toConstantsFormat());
        System.out.println( s2.toConstantsFormat());

        // System.out.println( System.lineSeparator()
                          // + "----- verticalize -----");
        // s0.source = "Go!";
        // System.out.println( s0.verticalize() );
    }
}