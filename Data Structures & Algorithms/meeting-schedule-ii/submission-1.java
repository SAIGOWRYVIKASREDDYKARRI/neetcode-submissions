class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals == null || intervals.size() == 0)
        {
            return 0;
        }
        
        int[] starts = new int[intervals.size()];
        int[] ends = new int[intervals.size()];
        for(int i = 0; i < intervals.size(); i++) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        int res = 0;
        int endPtr = 0;
        for(int i = 0; i < starts.length; i++) {
            if(starts[i] < ends[endPtr]) {
                res++;
            } else {
                endPtr++;
            }
        }
        return res;
    }
}