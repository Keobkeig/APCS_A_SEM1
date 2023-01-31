/**
Richie Xue
hw062
worked with: Intia Ibnah, Joseph Mei 
advised by: no one

/**
  Solve a maze.

  Requires command line arguments:
  o  the path to a file containing a maze.
  o  the offsetEast and offsetSouth at which an explorer starts

  For example,
      # explorer on treasure
      # explorer on treasure
      java UserOfMazeSolver mazes/4cell_treasureWest.txt 0 0

      # explorer in wall
      java UserOfMazeSolver mazes/4cell_treasureWest.txt 3 0
 */

public class UserOfMazeSolver {
    public static void main(String[] commandLine)
        throws java.io.FileNotFoundException {

        MazeWithExplorer mazeWEx =
          new MazeWithExplorer( commandLine[0]
                              , Integer.parseInt( commandLine[1])
                              , Integer.parseInt( commandLine[2])
                              );

        MazeSolver solver = new MazeSolver();
        System.out.println(
              "path to Treasure from"
            + " offsetEast "  + commandLine[1]
            + " offsetSouth " + commandLine[2]
            + ": " + solver.findPath( mazeWEx));
    }
}