class Solution {
    public int pivotIndex(int[] nums) {
    if(nums.length==1)
        return 0;
    int[] rightSum = Arrays.copyOf(nums,nums.length);
    for(int i = nums.length-2;i>=0;i--)
    {
        rightSum[i] += rightSum[i+1];
    }

    for(int i = 0 ; i < nums.length;i++)
    {
        if(i==0){
            if(rightSum[i+1]==0)
                return i;
        }else if(i==nums.length-1){
            if(nums[i-1]==0)
                return i;
        }else{
            if(nums[i-1]==rightSum[i+1])
                return i;
            nums[i] += nums[i-1];
        }
    }

    return -1;
    }
}
