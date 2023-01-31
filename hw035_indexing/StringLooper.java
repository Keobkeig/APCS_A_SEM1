/**
  Loop through Strings
 */
public class StringLooper {

    public String source;

    /**
       @return a camel-case String without underscores
       when "source" is a snake-case String with underscores
     */
    public String toVariablesFormat() {
        String accum = "";

        int curPos = 0;
        String curChar;
        while( curPos < source.length()) {
            curChar = source.substring( curPos, ++curPos);
            if( curChar.equals("_"))
                 accum += source.substring( curPos, ++curPos).toUpperCase();
            else accum += curChar.toLowerCase();
        }
        return accum;
    }


    /**
       @return an all-caps, snake-case String with underscores
       when "source" is a camel-case String
     */
    public String toConstantsFormat() {
        String accum = "";

        int curPos = 0;
        String curChar;
        while( curPos < source.length()) {
            curChar = source.substring( curPos, ++curPos);

            if( isAllUpper( curChar))
                 accum += "_" + curChar;
            else accum += curChar.toUpperCase();
        }
        return accum;
    }


    /**
       @return the boolean value of the assertion
               "s" is entirely upper case.

       Technically, the assertion is
           "s" has no non-upper case characters
       Under this definition, the "surpised" emoticon O_O
       counts as "entirely upper case"
     */
    private static boolean isAllUpper( String s) {
        return s.equals( s.toUpperCase());
    }


    /**
       indexOf1  (The name ends with the digit "one")
       @return the index of the first occurrence of
               the single character "seek1" 
               in "within"
               or -1 if "seek1" does not occur in "within".
     */
    public static int indexOf1(String seek1, String within) {
        int curPos = 0;
        while (curPos < within.length()) {
          String curChar = within.substring( curPos, curPos + 1);
          if (seek1.equals(curChar)) {
            return curPos;
          }
          else ++curPos;}
        return -1;
    }


    /**
       indexOfSubstring
       @return the index of the first occurrence of
               "seek"  (which can have any number of characters)
               in "within"
               or -1 if "seek" does not occur in "within".
     */
    public static int indexOfSubstring( String seek, String within) {
        int curPos = 0;
        while (curPos <= within.length() - seek.length()) {
          String curString = within.substring( curPos, curPos + seek.length());
          if (createSubstring(seek).equals(curString)) {
            return curPos;
          }
          else ++curPos;
          if (seek == "") return -1;
        }
        return -1;
      }
      
      // helper method for creating multi-character substring to use in indexOfSubstring
    public static String createSubstring( String seekString) {
        String accum = "";
        int indexAt = 0;
        while (indexAt < seekString.length()) {
          accum += seekString.substring(indexAt, indexAt + 1);
          indexAt++;
        }
        return accum;
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
      @return a version of a string that prints vertically,
              by introducing the value returned by
              System.lineSeparator() between each character.

      based on https://piazza.com/class/l7z53v3xdiq1hu/post/209 with
      redundant curly braces removed
     */
    public String verticalize() {
        String accumulator = "";

        int curPos = 0;
        while (curPos < source.length())
            accumulator +=   source.substring(curPos, ++curPos)
                           + System.lineSeparator();
        return accumulator;
    }
    
    public static boolean isFullMatch () 
    {
    	while(seekPos < seek.length()) 
    	{
                fullMatch &= within.substring( withinPos + seekPos 
                                             , withinPos + seekPos +1).equals(
                               seek.substring( seekPos, ++seekPos));
            }
       if( fullMatch) return withinPos;
            ++withinPos; }
    
    
    /**
       Test methods in this class, especially private methods
       like isAllUpper
     */
    public static void main( String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "----- test StringLooper.isAllUpper() -----");
        System.out.println( isAllUpper( "Brian Kernighan"));

        // punctuation should have no effect
        System.out.println( isAllUpper( "I SAID, BRIAN KERNIGHAN!!!"));
        System.out.println( isAllUpper( "O_O"));

        System.out.println(indexOfSubstring("ban", "banana")); //expecting 0
        System.out.println(indexOfSubstring("an", "banana")); //expecting 1
        System.out.println(indexOfSubstring("", "banana")); //expecting -1
        System.out.println(indexOfSubstring("bananas", "banana")); //expecting -1
        System.out.println(indexOfSubstring("ana", "banana")); //expecting 1
  
        // // helperMethodTest
        // System.out.println(createSubstring("ban"));
        // System.out.println(createSubstring("an"));
        // System.out.println(createSubstring("ana"));
    }
}
