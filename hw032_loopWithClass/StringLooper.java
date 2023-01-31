/**
    Richie   Xue
    hw032
    worked with Anthony Chen (pd2), Zidane Karim (pd2), Shaurya Sen (pd7)
    advised by no one
  Exercise the StringLooper class
  Loop through Strings
 */
public class StringLooper {

    public String source;
    
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
     */
    public String verticalize() {

        int curPos = 0;
        String accumulateString = "";
        while (curPos < source.length())
            accumulateString += source.substring(curPos, ++curPos )  + System.lineSeparator();
        return accumulateString;
    }

}