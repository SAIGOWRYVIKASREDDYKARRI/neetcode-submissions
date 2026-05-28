class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // Store frequency of each element
        Map<Integer, Integer> hm = new HashMap<>();
        
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // Min Heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> hm.get(a) - hm.get(b)
        );

        // Keep only top k frequent elements
        for (int key : hm.keySet()) {
            pq.offer(key);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Store answer
        int[] res = new int[k];
        
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }

        return res;
    }
}
