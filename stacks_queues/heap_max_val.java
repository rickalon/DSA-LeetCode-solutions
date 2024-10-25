class Solution {
    public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> qu = new PriorityQueue<>(nums.length,Collections.reverseOrder());
    for(int i:nums){
        qu.offer(i);
    }
    int num = -1;
    for(int i = 0 ; i < k;i++){
        num = qu.poll();
    }
    return num;
    }
}
