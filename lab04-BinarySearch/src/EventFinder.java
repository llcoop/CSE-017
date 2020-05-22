
/**
 * @author Logan Cooper
 * @version Feb, 18 2017
 */
public class EventFinder {

    /**
     * @param target
     *     the targeted event
     * @param arr
     *     the array 
     * @param start
     *     the starting index
     * @param end
     *     the ending index
     * @return position where event was found
     */
    public int find(HistoricEvent target, 
            HistoricEvent[] arr, int start, int end) {
        if (start < 0)
        {
            return 0;
        }
        else if (start > arr.length - 1)
        {
            return arr.length;
        }
        else if (target.compareTo(arr[start]) == 0)
        {
            return start;
        }
        else if (arr.length >= 2 && start > 0 && 
                start < arr.length - 2 && 
                target.compareTo(arr[start]) > 0 && 
                target.compareTo(arr[start + 1]) < 0)
        {
            return start;
        }
        else if (end < 0) 
        {
            return find(target, arr, start, arr.length);
        }
        else if (start >= end)
        {
            return end;
        }
        else if (target.compareTo(arr[start]) < 0)
        {
            return find(target, arr, start - 1, end);
        }
        else
        {
            return find(target, arr, start + 1, end);
        }
    }
    
    /**
     * @param target
     *     the targeted event
     * @param arr
     *     the array of events
     * @return position of target
     */
    public int find(HistoricEvent target, HistoricEvent[] arr) 
    {
        return find(target, arr, arr.length / 2, arr.length);
    }
}
