/**
  Richie   Xue
  hw034
  worked with Intia Ibnah (pd7)
  advised by no one
  Loop through Strings
 */
public class StringLooper {

    public String source;

    /**
       @return a camel-case String without underscores
       when "source" is a snake-case String with underscores
     */
    public String toVariablesFormat() {
      String accumulator = "";  
      int curPos = 0      ;
      while (curPos < source.length()) {
          if (source.substring(curPos, curPos + 1).equals("_") ) {
              ++curPos;
              accumulator += source.substring(curPos, curPos + 1).replace("_", "");
          }
          else  accumulator += (source.substring(curPos, curPos + 1).toLowerCase());
          ++curPos; 
      }
      return accumulator;
    }

        /**
      @return an imitation of Java's String.toUpperCase()
     */
    public String toLowerCase() {
      String accumulator = "";

      int curPos = 0;
      while( curPos < source.length())
          accumulator += source.substring( curPos, ++curPos).toLowerCase();

      return accumulator;
  }
    /**
       @return an all-caps, snake-case String with underscores
       when "source" is a camel-case String
     */

    public String toConstantsFormat() {
      String accumulator = "";
      int curPos = 0 ;

      while (curPos < source.length()){
          String curChar = source.substring(curPos, curPos + 1); 
          if (isAllUpper(curChar)) {
              accumulator += "_" + curChar;
          }
          else accumulator += (curChar.toUpperCase()) ;
          ++curPos ;
      }
      return accumulator;
    } 

    /**
      @return an imitation of Java's String.toUpperCase()
     */
    public String toUpperCase() {
        String accumulator = "";

        int curPos = 0;
        while( curPos < source.length())
            accumulator += source.substring( curPos, ++curPos).toUpperCase();

        return accumulator;
    }

    /**
      @return an bool of if every character of a String is uppercase
     */

    private static boolean isAllUpper( String s) {
      return s.equals( s.toUpperCase());
    }

    /**
      @return a version of a string that prints vertically,
              by introducing the value returned by
              System.lineSeparator() between each character.
     */
    public String verticalize() {
        String accumulator = "";

        int curPos = 0;
        while (curPos < source.length())
          accumulator += source.substring(curPos, ++curPos) + System.lineSeparator();
        return accumulator;
    }
}