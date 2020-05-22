package cs2114.mazesolver;

import student.TestCase;

/**
 * @author Logan Cooper
 * @version 2017.3.30
 *
 */
public class MazeTest 
    extends TestCase
{
    private Maze maze;
    /**
     * constructor
     */
    public MazeTest()
    {
        /**
         * empty for testing
         */
    }
    /**
     * setup for testing
     */
    public void setUp()
    {
        maze = new Maze(5);
    }
    /**
     * tests size()
     */
    public void testSize() {
        assertEquals(5, maze.size());
    }
    /**
     * tests getStartLocation()
     */
    public void testGetStartLocation()
    {
        Location location = new Location(0, 0);
        assertTrue(location.equals(maze.getStartLocation()));
    }
    /**
     * tests getGoalLocation()
     */
    public void testGetGoalLocation()
    {
        Location location = new Location(4, 4);
        assertTrue(location.equals(maze.getGoalLocation()));
    }
    /**
     * tests solve()
     */
    public void testSolve1()
    {
        maze.setGoalLocation(maze.getStartLocation());
        assertEquals("(0, 0) ", maze.solve());
    }
    /**
     * tests solve()
     */
    public void testSolve2()
    {
        Location location = new Location(0, 1);
        maze.setGoalLocation(maze.getStartLocation());
        maze.setStartLocation(location);
        assertNotNull(maze.solve());
    }
    /**
     * tests solve()
     */
    public void testSolveNone()
    {
        maze.setCell(maze.getStartLocation().north(), MazeCell.WALL);
        maze.setCell(maze.getStartLocation().east(), MazeCell.WALL);
        maze.setCell(maze.getStartLocation().south(), MazeCell.WALL);
        maze.setCell(maze.getStartLocation().west(), MazeCell.WALL);
        assertNull(maze.solve());
    }
}
