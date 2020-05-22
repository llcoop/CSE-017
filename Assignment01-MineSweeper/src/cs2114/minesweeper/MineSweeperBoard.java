package cs2114.minesweeper;

/**
 * @author Logan Cooper
 * @version March 7, 2017
 */
public class MineSweeperBoard extends MineSweeperBoardBase {

    private int width;
    private int height;
    private MineSweeperCell[][] board;
    private int safeCells;

    /**
     * @param width
     *            the width of the board
     * @param height
     *            the height of the board
     * @param mines
     *            the number of mines on the board
     */
    public MineSweeperBoard(int width, int height, int mines) {
        //Height/Width Sanity Check
        if (width <= 0)
        {
            width = 10;
        }
        if (height <= 0)
        {
            height = 10;
        }
        //Set Width/Height
        this.width = width;
        this.height = height;
        //Set Board
        board = new MineSweeperCell[height][width];
        //Add Cells
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                setCell(i, j, MineSweeperCell.COVERED_CELL);
            }
        }
        //Check for # of Mines
        if (mines < 0 || mines >= (width * height)) {
            mines = (int) (Math.random() * (width * height));
        }
        //Set Mines
        for (int i = 0; i < mines;) 
        {
            int x = (int) (Math.random() * height);
            int y = (int) (Math.random() * width);
            if (getCell(x, y).equals(MineSweeperCell.COVERED_CELL)) 
            {
                setCell(x, y, MineSweeperCell.MINE);
                i++;
            } 
        }
        //Counter for safe cells
        safeCells = (width * height) - mines;
    }

    @Override
    public int width() {
        return width;
    }

    @Override
    public int height() {
        return height;
    }

    @Override
    public MineSweeperCell getCell(int x, int y) 
    {
        if (x < 0 || x >= height || y < 0 || y >= width) 
        {
            return MineSweeperCell.INVALID_CELL;
        } 
        else 
        {
            return board[x][y];
        }
    }

    @Override
    public void uncoverCell(int x, int y) {
        if (getCell(x, y).equals(MineSweeperCell.MINE)) 
        {
            setCell(x, y, MineSweeperCell.UNCOVERED_MINE);
        } 
        else if (getCell(x, y).equals(MineSweeperCell.COVERED_CELL)) 
        {
            setCell(x, y, MineSweeperCell.adjacentTo(
                    numberOfAdjacentMines(x, y)));
            safeCells--;
            //Reveals other cells with no adjacent mines (recursive)
            if (getCell(x, y).equals(MineSweeperCell.ADJACENT_TO_0))
            {
                //Cell 1
                if (getCell(x - 1, y - 1).equals(MineSweeperCell.COVERED_CELL) 
                        && numberOfAdjacentMines(x - 1, y - 1) == 0) 
                {
                    uncoverCell(x - 1, y - 1);
                }
                //Cell 2
                if (getCell(x - 1, y).equals(MineSweeperCell.COVERED_CELL) 
                        && numberOfAdjacentMines(x - 1, y) == 0) 
                {
                    uncoverCell(x - 1, y);
                }
                //Cell 3
                if (getCell(x - 1, y + 1).equals(MineSweeperCell.COVERED_CELL) 
                        && numberOfAdjacentMines(x - 1, y + 1) == 0) 
                {
                    uncoverCell(x - 1, y + 1);
                }
                //Cell 4
                if (getCell(x, y - 1).equals(MineSweeperCell.COVERED_CELL) 
                        && numberOfAdjacentMines(x, y - 1) == 0) 
                {
                    uncoverCell(x, y - 1);
                }
                //Cell 5
                if (getCell(x, y + 1).equals(MineSweeperCell.COVERED_CELL) 
                        && numberOfAdjacentMines(x, y + 1) == 0) 
                {
                    uncoverCell(x, y + 1);
                }
                //Cell 6
                if (getCell(x + 1, y - 1).equals(MineSweeperCell.COVERED_CELL) 
                        && numberOfAdjacentMines(x + 1, y - 1) == 0) 
                {
                    uncoverCell(x + 1, y - 1);
                }
                //Cell 7
                if (getCell(x + 1, y).equals(MineSweeperCell.COVERED_CELL) 
                        && numberOfAdjacentMines(x + 1, y) == 0) 
                {
                    uncoverCell(x + 1, y);
                }
                //Cell 8
                if (getCell(x + 1, y + 1).equals(MineSweeperCell.COVERED_CELL) 
                        && numberOfAdjacentMines(x + 1, y + 1) == 0) 
                {
                    uncoverCell(x + 1, y + 1);
                }
            }
        }
    }

    @Override
    public void flagCell(int x, int y) {
        if (getCell(x, y).equals(MineSweeperCell.COVERED_CELL)) 
        {
            setCell(x, y, MineSweeperCell.FLAG);
        } 
        else if (getCell(x, y).equals(MineSweeperCell.MINE)) 
        {
            setCell(x, y, MineSweeperCell.FLAGGED_MINE);
        } 
        else if (getCell(x, y).equals(MineSweeperCell.FLAG)) 
        {
            setCell(x, y, MineSweeperCell.COVERED_CELL);
        } 
        else if (getCell(x, y).equals(MineSweeperCell.FLAGGED_MINE)) 
        {
            setCell(x, y, MineSweeperCell.MINE);
        } 
    }

    @Override
    public boolean isGameWon() {
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if (getCell(i, j).equals(MineSweeperCell.UNCOVERED_MINE) 
                    || getCell(i, j).equals(MineSweeperCell.FLAG) 
                    || getCell(i, j).equals(MineSweeperCell.COVERED_CELL))
                {
                    return false;
                }
            }
        }
        if (safeCells == 0) 
        {
            revealBoard();
            return true;
        }
        else 
        {
            return false;
        }
    }

    @Override
    public boolean isGameLost() 
    {
        for (int i = 0; i < height; i++) 
        {
            for (int j = 0; j < width; j++) 
            {
                if (getCell(i, j) == MineSweeperCell.UNCOVERED_MINE) 
                {
                    revealBoard();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int numberOfAdjacentMines(int x, int y) {
        int mines = 0;
        //Cell 1
        if (getCell(x - 1, y - 1).equals(MineSweeperCell.MINE)
                || getCell(x - 1, y - 1).equals(MineSweeperCell.FLAGGED_MINE) 
                || getCell(x - 1, y - 1).equals(
                        MineSweeperCell.UNCOVERED_MINE)) 
        {
            mines++;
        }
        //Cell 2
        if (getCell(x - 1, y).equals(MineSweeperCell.MINE) 
                || getCell(x - 1, y).equals(MineSweeperCell.FLAGGED_MINE) 
                || getCell(x - 1, y).equals(MineSweeperCell.UNCOVERED_MINE)) 
        {
            mines++;
        }
        //Cell 3
        if (getCell(x - 1, y + 1).equals(MineSweeperCell.MINE) 
                || getCell(x - 1, y + 1).equals(MineSweeperCell.FLAGGED_MINE) 
                || getCell(x - 1, y + 1).equals(
                        MineSweeperCell.UNCOVERED_MINE)) 
        {
            mines++;
        }
        //Cell 4
        if (getCell(x, y - 1).equals(MineSweeperCell.MINE) 
                || getCell(x, y - 1).equals(MineSweeperCell.FLAGGED_MINE) 
                || getCell(x, y - 1).equals(MineSweeperCell.UNCOVERED_MINE)) 
        {
            mines++;
        }
        //Cell 5
        if (getCell(x, y + 1).equals(MineSweeperCell.MINE) 
                || getCell(x, y + 1).equals(MineSweeperCell.FLAGGED_MINE) 
                || getCell(x, y + 1).equals(MineSweeperCell.UNCOVERED_MINE)) 
        {
            mines++;
        }
        //Cell 6
        if (getCell(x + 1, y - 1).equals(MineSweeperCell.MINE) 
                || getCell(x + 1, y - 1).equals(MineSweeperCell.FLAGGED_MINE) 
                || getCell(x + 1, y - 1).equals(
                        MineSweeperCell.UNCOVERED_MINE)) 
        {
            mines++;
        }
        //Cell 7
        if (getCell(x + 1, y).equals(MineSweeperCell.MINE) 
                || getCell(x + 1, y).equals(MineSweeperCell.FLAGGED_MINE) 
                || getCell(x + 1, y).equals(MineSweeperCell.UNCOVERED_MINE)) 
        {
            mines++;
        }
        //Cell 8
        if (getCell(x + 1, y + 1).equals(MineSweeperCell.MINE) 
                || getCell(x + 1, y + 1).equals(MineSweeperCell.FLAGGED_MINE) 
                || getCell(x + 1, y + 1).equals(
                        MineSweeperCell.UNCOVERED_MINE)) 
        {
            mines++;
        }
        return mines;
    }

    @Override
    public void revealBoard() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                uncoverCell(i, j);
            }
        }

    }

    @Override
    protected void setCell(int x, int y, MineSweeperCell value) {
        if (x >= 0 && x < height && y >= 0 && y < width)
        {
            board[x][y] = value;
        }
    }
}
