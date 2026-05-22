/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals==null||intervals.size()<=1)
        {
            return true;
        }
        intervals.sort((a,b)->Integer.compare(a.start,b.start));
        int prev_end=intervals.get(0).end;
        for(int i=1;i<intervals.size();i++)
        {
            if(intervals.get(i).start<prev_end)
            {
                return false;
            }
            prev_end=intervals.get(i).end;
        }
        return true;
    }
}
