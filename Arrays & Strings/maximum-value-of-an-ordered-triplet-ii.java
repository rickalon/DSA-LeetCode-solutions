class Solution {
    public long maximumTripletValue(int[] nums) {
    long max = Long.MIN_VALUE;
    int n = nums.length;
    int[] pre = new int[n];
    int[] pro = new int[n];
    pre[0] = nums[0];
    pro[n-1] = nums[n-1];
    for(int i = 1 ; i < n ; i++)
        pre[i] = Math.max(pre[i-1],nums[i]);
    for(int i = n-2 ; i >= 0; i--)
        pro[i] = Math.max(pro[i+1],nums[i]);
    for(int i = 1  ; i <= n - 2 ; i++){
        max = Math.max(max,(((long)pre[i-1]-nums[i]) * pro[i+1]));
    }
    return (max<0)?0:max;
    }
}
