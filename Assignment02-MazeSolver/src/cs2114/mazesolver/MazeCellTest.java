package cs2114.mazesolver;

import student.TestCase;

/**
 * @author Logan Cooper
 * @version 4/9/2017
 */
public class MazeCellTest extends TestCase
{

    private MazeCell testcell;
    private MazeCell testcell2;
    private MazeCell testcell3;
    private MazeCell testcell4;
    private MazeCell testcell5;
    /**
     * empty constructor
     */
    public MazeCellTest()
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
        testcell = MazeCell.UNEXPLORED;
        testcell2 = MazeCell.WALL;
        testcell3 = MazeCell.CURRENT_PATH;
        testcell4 = MazeCell.FAILED_PATH;
        testcell5 = MazeCell.INVALID_CELL;
    }
    
    /**
     * tests for UNEXPLORED
     */
    public void testUnexplored()
    {
        MazeCell n = MazeCell.valueOf("UNEXPLORED");
        assertEquals(testcell, n);
    }
    /**
     * tests for WALL
     */
    public void testWall()
    {
        MazeCell n = MazeCell.valueOf("WALL");
        assertEquals(testcell2, n);
    }
    /**
     * tests for CURRENT_PATH
     */
    public void testCurrentPath()
    {
        MazeCell n = MazeCell.valueOf("CURRENT_PATH");
        assertEquals(testcell3, n);
    }
    /**
     * tests for FAILED_PATH
     */
    public void testFailedPath()
    {
        MazeCell n = MazeCell.valueOf("FAILED_PATH");
        assertEquals(testcell4, n);
    }
    /**
     * tests for INVALID_CELL
     */
    public void testInvalidCell()
    {
        MazeCell n = MazeCell.valueOf("INVALID_CELL");
        assertEquals(testcell5, n);
    }
}
