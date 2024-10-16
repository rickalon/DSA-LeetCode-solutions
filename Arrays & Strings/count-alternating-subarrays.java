class Solution {
    public long countAlternatingSubarrays(int[] nums) {
    long sol = nums.length;
    int counter = 1;
    for(int iter = 1; iter < nums.length ; iter++){
        if(nums[iter] !=nums[iter-1]){
            counter++;
        }else{
            counter = 1;
        }
        sol += counter - 1;
    }
    return sol;
    }
}
