class Solution {
    public int removeDuplicates(int[] nums) {
    int low = -1;
    int counter = 0;
    for(int i = 0 ; i < nums.length;i++){
    if(counter < 2 || (low >=0 && nums[low]!=nums[i])){
        if((low >=0 && nums[low]!=nums[i])){
            counter=1;
        }else{
            counter++;
        }
        low++;
        nums[low] = nums[i];
        }
    }
    return low+1;
    }
}
