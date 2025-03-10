class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> (a[0] + a[1]) - (b[0] + b[1]));
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0; i < nums1.length && i < k; i++)
            minHeap.add(new int[]{nums1[i], nums2[0],1});
        
        
        for(int i=0; i < k; i++){
            int[] curr = minHeap.poll();
            ans.add(List.of(curr[0], curr[1]));
            if(curr[2] < nums2.length)
                minHeap.add(new int[]{curr[0], nums2[curr[2]], curr[2] + 1});
        }
        return ans;
    }
}
