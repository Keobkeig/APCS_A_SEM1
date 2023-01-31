/**
  Solve a maze.
*/
public class MazeSolver {

    /**
      @return an object that represents an explorer's path
              through a maze to a treasure,
              or null if no path exists
     */
    public MazeWithExplorer findPath( MazeWithExplorer candidate) {

        // /* for debugging, show the MazeWithExplorer that this invocation
        //    starts with */
        // System.out.println(
        //     "candidate in findPath: " + System.lineSeparator()
        //   + candidate
        //   + System.lineSeparator());

        // base cases
        int status = candidate.status();
        if( status == candidate.STATUS_NO_PATH_THRU_HERE) return null;
        if( status == candidate.STATUS_PATH_EXISTS)       return candidate;

        /* recursive case: status is STATUS_MAYBE_PATH_THRU_HERE
           When the recursive abstraction is asked to return
           [request, from above]
           the recursive abstraction can follow these instructions
           to return... STUB STUB STUB STUB STUB STUB STUB STUB
        */
        else{  // on stepping stone, status == STATUS_MAYBE_PATH_THRU_HERE
            // ways to extend a candidate
            final int[] DIRECTIONS =
              { MazeWithExplorer.EAST
              , MazeWithExplorer.NORTH
              , MazeWithExplorer.WEST
              , MazeWithExplorer.SOUTH
              };

            
            /* Create a snapshot of the candidate, so that,
                if a trial direction fails to find the treasure,
                findPath can return to configuration at invocation.
            */
            MazeWithExplorer snapshot = new MazeWithExplorer( candidate);

            // Try one of those directions, using the recursive abstraction.
            candidate.dropBreadcrumbAndGo( DIRECTIONS[0]);
            
            MazeWithExplorer path = findPath(candidate);
            if (path != null) {
              return path;
            }
            /* If there is no treasure in that direction,
            0.  Use the snapshot to re-create the candidate's
                previous configuration.
            1. Try another direction. */
            else {
              candidate = new MazeWithExplorer(snapshot);
              candidate.dropBreadcrumbAndGo( DIRECTIONS[1]);
              path = findPath(candidate);
              if (path != null) 
                  return path; 
              else { // that is, there is no path to the East or North 
                  candidate = new MazeWithExplorer(snapshot);
                  candidate.dropBreadcrumbAndGo(DIRECTIONS[2]); // go West 
                  path = findPath(candidate); 
                  if (path != null) 
                      return path; 
                  else { // that is, there is no path to the East, North, or West
                    candidate = new MazeWithExplorer(snapshot);
                    candidate.dropBreadcrumbAndGo(DIRECTIONS[3]); // go South 
                    path = findPath(candidate); 
                    if (path != null) 
                      return path; 
                    else // that is, there are no possible paths at all 
                      return null; 
                  }
                }
            }
        }
    }
}