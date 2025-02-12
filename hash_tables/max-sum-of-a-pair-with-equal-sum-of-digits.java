class Solution {
    public int maximumSum(int[] nums) {
    int n = nums.length;
    int max = Integer.MIN_VALUE;
    int[] sum = new int[82];
    Arrays.fill(sum,-1);
    for(int i = 0 ; i < n ; i++){
        int num = nums[i];
        int digits = 0;
        while(num>0){
            digits += num % 10;
            num /= 10;
        }
        if(sum[digits]==-1){
            sum[digits]=i;
        }else{
            int j = sum[digits];
            max = Math.max(max,nums[i]+nums[j]);
            sum[digits]=((nums[i]>nums[j])?i:j);
        }
    }
    return (max==Integer.MIN_VALUE)?-1:max;    
    }
}
