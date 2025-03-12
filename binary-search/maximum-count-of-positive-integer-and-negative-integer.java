class Solution {
    public int maximumCount(int[] nums) {
    // int pos = 0;
    // int neg = 0;
    // for(int num : nums){
    //     if(num > 0)
    //         pos++;
    //     else if(num < 0)
    //         neg++;
    // }
    // return Math.max(pos,neg);
    int left = 0;
    int right = nums.length-1;
    while(left <= right){
        int mid = left + (right-left)/2;
        if(nums[mid]>0){
            right = mid -1;
        }else if(nums[mid]<0){
            left = mid + 1;
        }else{
            left = mid;
            right = mid;
            while(right >=0 && nums[right]==0)
                right--;
            while(left < nums.length && nums[left]==0)
                left++;
            break;
        }
    }
    if(right==-1 && left == nums.length)
        return 0;
    if(right==-1)
        return nums.length-left;
    if(left==nums.length)
        return right+1;
    return Math.max(nums.length-left,right+1);
    }
}
