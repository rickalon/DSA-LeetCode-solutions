class Solution {
    public int findPeakElement(int[] nums) {
    
    for(int i = 1 ; i < nums.length-1 ; i++)
    {
    int num = nums[i];
    if(num > nums[i-1] && num > nums[i+1]){
        return i;
    }
    }
    return (nums[0] > nums[nums.length-1])?0:nums.length-1;    
    }
}
