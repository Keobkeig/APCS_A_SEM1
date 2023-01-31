/**
    Richie   Xue
    hw030
    worked with no one
    advised by no one
    Loop through the characters in a string, introducing
    line separators
 */

public class Verticalize {

    /**
      First cut, expecting
          V
          e
          r
          t
          i
          c
          a
          l
          i
          z
          e

          m
          e
          !
     */
    public static void main( String[] commandLine) {
        String input = "Verticalize me!";
        //                        1                  
        //              012345678901234 
        int index = 0;
        System.out.println("First cut, expecting");
        while (index < 15) {
            System.out.println(input.substring(index, index + 1));
            index += 1;
        }
    }
}
