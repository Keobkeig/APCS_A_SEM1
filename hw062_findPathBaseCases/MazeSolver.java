/**
  Solve a maze.
 */
public class MazeSolver {

    /**
      Construct an instance, using the default constructor,
      which does nothing.
     */
    public MazeSolver() {
      
    }


    /**
      @return STUB STUB STUB STUB STUB STUB STUB
      May modify "candidate".
     */

    /**
     * @return an object that represents the path the explorer takes 
     *    through the maze
     *    to the treasure using stepping stones 
     *  or null if there is no path  
     */
    public MazeWithExplorer findPath( MazeWithExplorer candidate) {

        // base cases
        if (candidate.status() == candidate.STATUS_PATH_EXISTS)
            return candidate; 
        else if( candidate.status() == candidate.STATUS_NO_PATH_THRU_HERE ) // stub
            return null;  // stub

        // recursive case: status is STATUS_MAYBE_PATH_THRU_HERE
        else return candidate;  // stub; to be replaced in next assignment
    }
}