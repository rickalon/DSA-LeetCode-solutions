class Solution {
    public int search(int[] nums, int target) {
    //version 1//O(n)
    // for(int i = 0;i<nums.length;i++){
    //     if(nums[i] == target){
    //         return i;
    //     }
    // }
    // return -1;

    //version 2//O(logn)//0ms
    int left = 0;
    int right = nums.length-1;
    while(left <right)
    {
        int m = left + (right-left)/2;
        if(nums[m] > nums[right]){
            left = m+1;
        }else{
            right = m;
        }
    
    }
    int start = right;
    if(start==0){
        left = 0;
        right = nums.length-1;
    }else if(target>=nums[start] && target <=nums[nums.length-1]){
        left = start;
        right = nums.length-1;
    }else{
        left = 0;
        right = start-1;
    }
    while(left <=right){
            int m = left + (right-left)/2;
        if(nums[m]==target){
            return m;
        }else if(nums[m]>target){
            right = m-1;
        }else{
            left=m+1;
        }
    }
    return -1;
    }
}
