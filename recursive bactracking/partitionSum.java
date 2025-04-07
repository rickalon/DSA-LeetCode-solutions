class Solution {
    public boolean canPartition(int[] nums) {
    int target = 0;
    for(int num : nums)
        target += num;
    return back(nums,0,0,target,0);
    }

    public boolean back(int[] nums, int left,int right, int target, int index){
    if(left + right == target){
        if(left == right)
            return true;
        return false;
    }
    int num = nums[index];
    return back(nums,left+num,right,target,index+1) || back(nums,left,right+num,target,index+1);
    }
}
