/**
  Exercise the StringLooper class
  
  Bill Withers
  hw034
  worked with no one
  advised by no one
 */

public class UserOfStringLooper {
    public static void main( String[] commandLine) {
        StringLooper s0 = new StringLooper();

        // toVariablesFormat
        System.out.println( System.lineSeparator()
                          + "----- toVariablesFormat -----");
        s0.source = "A_SNAKE_CASE_NAME";
        System.out.println( s0.toVariablesFormat());

        s0.source = "ZEROUNDERSCORES";
        System.out.println( s0.toVariablesFormat());

        s0.source = "WHOLE_LOTTA_SNAKIN_GOIN_ON";
        System.out.println( s0.toVariablesFormat());


        // toConstantsFormat
        System.out.println( System.lineSeparator()
                          + "----- toConstantsFormat -----");
        s0.source = "aCamelCaseName";
        System.out.println( s0.toConstantsFormat());

        s0.source = "zerocaps";
        System.out.println( s0.toConstantsFormat());

        s0.source = "odd_But_Ok";
        System.out.println( s0.toConstantsFormat());



        // System.out.println( System.lineSeparator()
                          // + "----- verticalize -----");
        // s0.source = "Go!";
        // System.out.println( s0.verticalize() );

        // indexOf1
        System.out.println( System.lineSeparator()
                         + "----- indexOf1 -----");

        System.out.println(StringLooper.indexOf1("b", "banana")); // expecting 0
        System.out.println(StringLooper.indexOf1("a", "banana")); // expecting 1
        System.out.println(StringLooper.indexOf1("n", "banana")); // expecting 2

        // indexOfSubstring
        System.out.println( System.lineSeparator()
                            + "----- indexOfSubstring -----");

        System.out.println(StringLooper.indexOfSubstring("ban", "banana")); //expecting 1 
        System.out.println(StringLooper.indexOfSubstring("an", "banana")); //expecting 2
        System.out.println(StringLooper.indexOfSubstring("", "banana")); //expecting -1
        System.out.println(StringLooper.indexOfSubstring("bananas", "banana")); //expecting -1
        System.out.println(StringLooper.indexOfSubstring("ana", "banana")); //expecting 2
    }
}