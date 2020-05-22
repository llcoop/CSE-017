package cs2114.minesweeper;

/**
 * @author Logan Cooper
 * @version March 9, 2017
 */
public class MineSweeperBoardTest extends student.TestCase
{

    private MineSweeperBoard test1;
    private MineSweeperBoard test2;
    /**
     * empty constructor for testing
     */
    public MineSweeperBoardTest()
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
        test1 = new MineSweeperBoard(10, 10, 0);
        test2 = new MineSweeperBoard(0, 0, 0);
    }
    //My test methods
    /**
     * tests width()
     */
    public void testWidth1()
    {
        test1.loadBoardState("          ",
                             "          ",
                             "          ",
                             "          ",
                             "          ",
                             "          ",
                             "          ",
                             "          ",
                             "          ",
                             "          ");
        assertEquals(10, test1.width());
    }
    /**
     * test width()
     */
    public void testWidth2()
    {
        assertEquals(10, test2.width());
    }
    /**
     * tests height()
     */
    public void testHeight1()
    {
        assertEquals(10, test1.height());
    }
    /**
     * tests height()
     */
    public void testHeight2()
    {
        assertEquals(10, test2.height());
    }
    /**
     * tests getCell()
     */
    public void testGetCell1()
    {
        assertEquals(MineSweeperCell.INVALID_CELL, test1.getCell(-1, -1));
    }
    /**
     * tests getCell()
     */
    public void testGetCell2()
    {
        assertEquals(MineSweeperCell.COVERED_CELL, test1.getCell(0, 0));
    }
    /**
     * tests getCell()
     */
    public void testGetCell3()
    {
        assertEquals(MineSweeperCell.INVALID_CELL, test1.getCell(0, -1));
    }
    /**
     * test setCell()
     */
    public void testSetCell1()
    {
        test1.setCell(0, 0, MineSweeperCell.MINE);
        assertEquals(MineSweeperCell.MINE, test1.getCell(0, 0));
    }
    /**
     * test setCell()
     */
    public void testSetCell2()
    {
        test1.setCell(-1, -1, MineSweeperCell.FLAG);
        assertEquals(MineSweeperCell.INVALID_CELL, test1.getCell(-1, -1));
    }
    /**
     * test setCell()
     */
    public void testSetCell3()
    {
        test1.setCell(20, 69, MineSweeperCell.FLAG);
        assertEquals(MineSweeperCell.INVALID_CELL, test1.getCell(20, 69));
    }
    /**
     * test setCell()
     */
    public void testSetCell4()
    {
        test1.setCell(69, 1, MineSweeperCell.FLAG);
        assertEquals(MineSweeperCell.INVALID_CELL, test1.getCell(69, 1));
    }
    /**
     * test flagCell()
     */
    public void testFlagCell1()
    {
        test1.flagCell(0, 0);
        assertEquals(MineSweeperCell.FLAG, test1.getCell(0, 0));
    }
    /**
     * tests flagCell()
     */
    public void testFlagCell2()
    {
        test1.setCell(0, 0, MineSweeperCell.FLAG);
        test1.flagCell(0, 0);
        assertEquals(MineSweeperCell.COVERED_CELL, test1.getCell(0, 0));
    }
    /**
     * tests flagCell()
     */
    public void testFlagCell3()
    {
        test1.setCell(0, 0, MineSweeperCell.MINE);
        test1.flagCell(0, 0);
        assertEquals(MineSweeperCell.FLAGGED_MINE, test1.getCell(0, 0));
    }
    /**
     * tests flagCell()
     */
    public void testFlagCell4()
    {
        test1.setCell(0, 0, MineSweeperCell.FLAGGED_MINE);
        test1.flagCell(0, 0);
        assertEquals(MineSweeperCell.MINE, test1.getCell(0, 0));
    }
    /**
     * tests flagCell()
     */
    public void testFlagCell5()
    {
        test1.setCell(0, 0, MineSweeperCell.UNCOVERED_MINE);
        test1.flagCell(0, 0);
        assertEquals(MineSweeperCell.UNCOVERED_MINE, test1.getCell(0, 0));
    }
    /**
     * test numberOfAdjacentMines()
     */
    public void testNumberOfAdjacentMines1() 
    {
        assertEquals(0, test1.numberOfAdjacentMines(1, 1));
    }
    /**
     * test numberOfAdjacent()
     */
    public void testNumberOfAdjacentMines2()
    {
        test1.setCell(0, 0, MineSweeperCell.MINE);
        assertEquals(1, test1.numberOfAdjacentMines(1, 1));
    }
    /**
     * test numberOfAdjacent()
     */
    public void testNumberOfAdjacentMines3()
    {
        test1.setCell(0, 0, MineSweeperCell.MINE);
        test1.setCell(0, 1, MineSweeperCell.MINE);
        test1.setCell(0, 2, MineSweeperCell.MINE);
        test1.setCell(1, 0, MineSweeperCell.MINE);
        test1.setCell(1, 2, MineSweeperCell.MINE);
        test1.setCell(2, 0, MineSweeperCell.MINE);
        test1.setCell(2, 1, MineSweeperCell.MINE);
        test1.setCell(2, 2, MineSweeperCell.MINE);
        assertEquals(8, test1.numberOfAdjacentMines(1, 1));
    }
    /**
     * tests numberOfAdjacentMines()
     */
    public void testNumberOfAdjacentMines4()
    {
        test1.setCell(0, 0, MineSweeperCell.FLAGGED_MINE);
        test1.setCell(0, 1, MineSweeperCell.FLAGGED_MINE);
        test1.setCell(0, 2, MineSweeperCell.FLAGGED_MINE);
        test1.setCell(1, 0, MineSweeperCell.FLAGGED_MINE);
        test1.setCell(1, 2, MineSweeperCell.FLAGGED_MINE);
        test1.setCell(2, 0, MineSweeperCell.FLAGGED_MINE);
        test1.setCell(2, 1, MineSweeperCell.FLAGGED_MINE);
        test1.setCell(2, 2, MineSweeperCell.FLAGGED_MINE);
        assertEquals(8, test1.numberOfAdjacentMines(1, 1));
    }
    /**
     * test numberOfAdjacentMines()
     */
    public void testNumberOfAdjacentMines5()
    {
        test1.setCell(0, 0, MineSweeperCell.UNCOVERED_MINE);
        test1.setCell(0, 1, MineSweeperCell.UNCOVERED_MINE);
        test1.setCell(0, 2, MineSweeperCell.UNCOVERED_MINE);
        test1.setCell(1, 0, MineSweeperCell.UNCOVERED_MINE);
        test1.setCell(1, 2, MineSweeperCell.UNCOVERED_MINE);
        test1.setCell(2, 0, MineSweeperCell.UNCOVERED_MINE);
        test1.setCell(2, 1, MineSweeperCell.UNCOVERED_MINE);
        test1.setCell(2, 2, MineSweeperCell.UNCOVERED_MINE);
        assertEquals(8, test1.numberOfAdjacentMines(1, 1));
    }
    /**
     * test uncoverCell()
     */
    public void testUncoverCell1()
    {
        test1.setCell(0, 0, MineSweeperCell.MINE);
        test1.uncoverCell(0, 0);
        assertEquals(MineSweeperCell.UNCOVERED_MINE, test1.getCell(0, 0));
    }
    /**
     * test uncoverCell()
     */
    public void testUncoverCell2()
    {
        test1.setCell(0, 0, MineSweeperCell.FLAG);
        test1.uncoverCell(0, 0);
        assertEquals(MineSweeperCell.FLAG, test1.getCell(0, 0));
    }
    /**
     * test uncoverCell()
     */
    public void testUncoverCell3()
    {
        test1.uncoverCell(1, 1);
        assertEquals(MineSweeperCell.ADJACENT_TO_0, test1.getCell(1, 1));
    }
    /**
     * test uncoverCell()
     */
    public void testUncoverCell4()
    {
        test1.uncoverCell(0, 0);
        assertEquals(MineSweeperCell.ADJACENT_TO_0, test1.getCell(0, 0));
    }
    /**
     * tests uncoverCell()
     */
    public void testUncoverCell5()
    {
        test1.setCell(0, 0, MineSweeperCell.MINE);
        test1.setCell(0, 1, MineSweeperCell.MINE);
        test1.setCell(0, 2, MineSweeperCell.MINE);
        test1.setCell(1, 0, MineSweeperCell.MINE);
        test1.setCell(1, 2, MineSweeperCell.MINE);
        test1.setCell(2, 0, MineSweeperCell.MINE);
        test1.setCell(2, 1, MineSweeperCell.MINE);
        test1.setCell(2, 2, MineSweeperCell.MINE);
        test1.uncoverCell(1, 1);
        assertEquals(MineSweeperCell.ADJACENT_TO_8, test1.getCell(1, 1));
    }
    /**
     * test isGameWon()
     */
    public void testIsGameWon1() 
    {
        assertEquals(false, test1.isGameWon());
    }
    /**
     * test isGameWon()
     */
    public void testIsGameWon2()
    {
        test1.uncoverCell(0, 0);
        assertEquals(true, test1.isGameWon());
    }
    /**
     * tests isGameLost()
     */
    public void testIsGameLost1()
    {
        test1.setCell(0, 0, MineSweeperCell.UNCOVERED_MINE);
        assertEquals(true, test1.isGameLost());
    }
    /**
     * tests isGameLost()
     */
    public void testIsGameLost2()
    {
        assertEquals(false, test1.isGameLost());
    }
    //Predefined test methods
    /**
    * test for adjacent to test
    */
    public void testAdjacentTo()
    {
        MineSweeperCell c = MineSweeperCell.ADJACENT_TO_0;
        assertNotNull(c);
        // testing for exception
        Exception thrown = null;
        try
        {
            c = MineSweeperCell.adjacentTo(10);
        }
        catch (Exception e)
        {
            thrown = e;
        }
        assertTrue(thrown instanceof IllegalArgumentException);

        thrown = null;
        try
        {
            MineSweeperCell.adjacentTo(-1);
        }
        catch (Exception e)
        {
            thrown = e;
        }
        assertTrue(thrown instanceof IllegalArgumentException);
        assertNotNull(MineSweeperCell.values());
        assertNotNull(
            MineSweeperCell.valueOf(MineSweeperCell.ADJACENT_TO_0.toString()));

    }
    /**
     * tests loadBoardState()
     */
    public void testloadBoardState()
    { 
        MineSweeperBoard a = new MineSweeperBoard(2, 2, 1);
        Exception thrown = null;
        //loadBoardState testing 
        //wrong number of rows
        try
        { 
            a.loadBoardState("00");
        }   
        catch (Exception e)
        { 
            thrown = e;
        } 
        assertTrue(thrown instanceof IllegalArgumentException);
        thrown = null;
        // wrong number of columns
        try
        { 
            a.loadBoardState("0000 ", " ");
        } 
        catch (Exception e)
        { 
            thrown = e;
        } 
        assertTrue(thrown instanceof IllegalArgumentException);
        // Wrong symbol in cell
        try
        { 
            a.loadBoardState("00", "$+");
        } 
        catch (Exception e)
        { 
            thrown = e;
        } 
        assertTrue(thrown instanceof IllegalArgumentException);
    }
     
    /** * This method test Equals.
     */ 
    public void testEqual()
    {
        MineSweeperBoard mBoard1 = new MineSweeperBoard(4, 4, 6);
        MineSweeperBoard mBoard2 = new MineSweeperBoard(4, 4, 6);
        mBoard1.loadBoardState("    ", "OOOO", "O++O", "OOOO");
        mBoard2.loadBoardState("    ", "OOOO", "O++O", "OOOO");
        // test the same board same dimensions
        assertTrue(mBoard1.equals(mBoard2));
        // same board testing same board
        assertTrue(mBoard1.equals(mBoard1));
        // testing same dimensions board with different cell
        MineSweeperBoard mBoard3 = new MineSweeperBoard(4, 4, 6);
        mBoard3.loadBoardState("    ", "O+OO", "O++O", "OOOO");
        assertFalse(mBoard1.equals(mBoard3));
        MineSweeperBoard mBoard4 = new MineSweeperBoard(15, 1, 0);
        mBoard4.loadBoardState("OFM+* 123456788");
        assertFalse(mBoard1.toString().equals(mBoard3.toString()));
        // testing two string against a board
        assertFalse(mBoard4.toString().equals(mBoard2.toString()));
        // testing against a string
        assertFalse(mBoard1.equals("abc"));
        assertNotNull(mBoard1);
        // same width but different height
        MineSweeperBoard mBoard6 = new MineSweeperBoard(4, 5, 6);
        mBoard6.loadBoardState("    ", "O+OO", "O++O", "OOOO", "OOOO");
        assertFalse(mBoard6.equals(mBoard1));
        // different width same height
        MineSweeperBoard mBoard5 = new MineSweeperBoard(5, 4, 6);
        mBoard5.loadBoardState("     ", "O+OOO", "O++OO", "OOOOO");
        assertFalse(mBoard5.equals(mBoard1));
    }

}
