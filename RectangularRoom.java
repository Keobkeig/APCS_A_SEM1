/**
  pd6 hw014 2022-10-06 Richie Xue
  worked with no one; advised by no one 

  Calculcate files, ranks, and person-numbers
 */

public class RectangularRoom {

    public static void main(String[] commandLine) {
        fileAndRank( "First person"
                   , 0
                   , "file 0 rank 0"
                   );
        fileAndRank( "another front person"
                   , 6  // invalid value as stub
                   , "file 1 rank 0"
                   );
        fileAndRank( "a back-of-file person"
                   , 29 // invalid value as stub
                   , "file 4 rank 5"
                   );
        fileAndRank( "a typical person"
                   , 15  // invalid value as stub
                   , "file 2 rank 3"
                   );

        // test calculating person numbers
        personTest( "The first person"
                  , 0, 0   // file and rank
                  , 0      // expected person number
                  );
        personTest( "Another front person"
                  , 1, 0   // file and rank
                  , 6      // expected person number
                  );
        personTest( "A back-of-file person"
                  , 4, 5   // file and rank
                  , 29      // expected person number
                  );
        personTest( "A typical person"
                  , 2, 3   // file and rank
                  , 15      // expected person number
                  );
    }

    /**
      run one test of calculating file and rank
     */
    private static void fileAndRank( String description
                                   , int person
                                   , String expect
                                   ) {
        System.out.println( description);
        System.out.println( "Person " + person
                          + " belongs in " + expect
                          + " and is calculated to sit in"
                          + " file " + file( person)
                          + " rank " + rank( person)
                          + System.lineSeparator());
    }

    private static int file( int person) {
        return person / 6;  
    }

    private static int rank( int person) {
        return person % 6;  
    }


    /**
      run one test of calculating a person number
     */
    private static void personTest( String description
                                  , int file
                                  , int rank
                                  , int expect
                                  ) {
        System.out.println( description);
        System.out.println( " sits at"
                          + " file " + file
                          + " rank " + rank
                          + " where one expects to find person " + expect
                          + ". We calculated finding person "
                          + person( file, rank)
                          );
    }

    private static int person( int file, int rank) {
        return file * 6 + rank; 
    }
}
