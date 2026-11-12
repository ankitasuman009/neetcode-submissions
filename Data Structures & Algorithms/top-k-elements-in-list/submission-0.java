class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
       PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(map.get(b), map.get(a)));
        for(int key: map.keySet()){
            pq.add(key);
        }
        int[] ans = new int[k];
        int i = 0;
        while(!pq.isEmpty() && i<k){
            ans[i++] = pq.poll();
        }
        return ans;
    }
}
