class Solution {
    public int[] searchRange(int[] nums, int target) {
    int left =0;
    int right = nums.length-1;
    while(left <= right)
    {
    int m = left + (right-left)/2;
    int elem = nums[m];
    if(elem>target){
        right = m-1;
    }else if(elem < target){
        left = m+1;
    }else{
        int min =m;
        int max =m;
        while(min>0){
            if(nums[min-1]==target){
                min--;
            }else{
                break;
            }
        }
        while(max<nums.length-1){
            if(nums[max+1]==target){
                max++;
            }else{
                break;
            }
        }
        return new int[]{min,max};
    }
    }

    return new int[]{-1,-1};

    }
}
