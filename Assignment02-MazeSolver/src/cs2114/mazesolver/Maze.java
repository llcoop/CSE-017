package cs2114.mazesolver;
import java.util.Stack;

/**
 * @author Logan Cooper
 * @version 2017.3.30
 */
public class Maze implements IMaze {

    private int size;
    private MazeCell[][] grid;
    private Location start;
    private Location goal;
    private Stack<Location> solver;
    
    /**
     * @param size
     *     the size of the maze
     */
    public Maze(int size)
    {
        this.size = size;
        grid = new MazeCell[size][size];
        for (int i = 0; i < size; i++) //y value
        {
            for (int j = 0; j < size; j++) //x value
            {
                grid[i][j] = MazeCell.UNEXPLORED;
            }
        }
        start = new Location(0, 0);
        setStartLocation(start);
        goal = new Location(size - 1, size - 1);
        setGoalLocation(goal);
        solver = new Stack<Location>();
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public ILocation getStartLocation() {
        return start;
    }

    @Override
    public void setStartLocation(ILocation location) {
        if (getCell(location) != MazeCell.INVALID_CELL)
        {
            if (getCell(location) == MazeCell.WALL)
            {
                setCell(location, MazeCell.UNEXPLORED);
            }
            start = (Location) location;
        }
    }

    @Override
    public ILocation getGoalLocation() {
        return goal;
    }

    @Override
    public void setGoalLocation(ILocation location) {
        if (getCell(location) != MazeCell.INVALID_CELL)
        {
            if (getCell(location) == MazeCell.WALL)
            {
                setCell(location, MazeCell.UNEXPLORED);
            }
            goal = (Location) location;
        }
    }

    @Override
    public MazeCell getCell(ILocation location) {
        if (location.x() < 0 || location.x() >= size 
                || location.y() < 0 || location.y() >= size)
        {
            return MazeCell.INVALID_CELL;
        }
        return grid[location.y()][location.x()];
    }

    @Override
    public void setCell(ILocation location, MazeCell cell) {
        if (getCell(location) != MazeCell.INVALID_CELL)
        {
            grid[location.y()][location.x()] = cell;
        }

    }

    @Override
    public String solve() {
        solver.push(start);
        setStartLocation(start);
        setCell(goal, MazeCell.UNEXPLORED);
        while (!solver.empty())
        {
            Location current = solver.peek();
            setCell(current, MazeCell.CURRENT_PATH);
            if (current.equals(goal)) //if at goal
            {
                Stack<Location> path = new Stack<Location>();
                while (!solver.empty())
                {
                    path.push(solver.pop());
                }
                String solution = "";
                while (!path.empty())
                {
                    solution += path.pop().toString() + " ";
                }
                return solution;
            }
            else if (getCell(current.south()) == MazeCell.UNEXPLORED)//go south
            {
                solver.push((Location)current.south());
                setCell(current, MazeCell.CURRENT_PATH);
            }
            else if (getCell(current.east()) == MazeCell.UNEXPLORED)//go east
            {
                solver.push((Location)current.east());
                setCell(current, MazeCell.CURRENT_PATH);
            }
            else if (getCell(current.north()) == MazeCell.UNEXPLORED)//go north
            {
                solver.push((Location)current.north());
                setCell(current, MazeCell.CURRENT_PATH);
            }
            else if (getCell(current.west()) == MazeCell.UNEXPLORED)//go west
            {
                solver.push((Location)current.west());
                setCell(current, MazeCell.CURRENT_PATH);
            }
            else //no neighbors
            {
                setCell(current, MazeCell.FAILED_PATH);
                solver.pop();
            }
        }
        return null; //test fails
    }

}
