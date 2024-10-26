class Solution {
    public int rob(int[] nums) {
    int n = nums.length-1;
    if(n==-1){
        return 0;
    }else if(n==0){
        return nums[0];
    }
    for(int i = 2;i<=n;i++)
    {
    if(i>=3){
        nums[i]+=Math.max(nums[i-2],nums[i-3]);
    }else{
        nums[i]+=nums[i-2];
        }
    }

    return Math.max(nums[n],nums[n-1]);
    }
}
