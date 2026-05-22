class Solution {

    public int minMeetingRooms(List<Interval> intervals) {

        if(intervals == null || intervals.size() == 0) {
            return 0;
        }

        // Sort by start time
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        // Min-heap storing end times
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add first meeting end time
        pq.offer(intervals.get(0).end);

        for(int i = 1; i < intervals.size(); i++) {

            Interval curr = intervals.get(i);

            // If room becomes free
            if(curr.start >= pq.peek()) {
                pq.poll();
            }

            // Allocate room
            pq.offer(curr.end);
        }

        return pq.size();
    }
}