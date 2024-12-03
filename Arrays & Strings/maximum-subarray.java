class Solution {
    public int maxSubArray(int[] nums) {
    int left = 0;
    int max = Integer.MIN_VALUE;
    for(int i = 0 ; i < nums.length;i++){
        if(nums[i]>0){
        int sum = nums[i];
        while(i+1 < nums.length && sum+nums[i+1]>0){
            max = Math.max(sum,max);
            i++;
            sum += nums[i];
        }
        max = Math.max(sum,max);
        }else{
            max = Math.max(nums[i],max);
        }
    }
    return max;    
    }
}
