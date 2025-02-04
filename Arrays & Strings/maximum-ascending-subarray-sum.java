class Solution {
    public int maxAscendingSum(int[] nums) {
    if(nums.length==0)
        return -1;
    int last = nums[0];
    int aux = last;
    int max = last;
    for(int i = 1 ; i < nums.length; i++){
        if(last < nums[i]){
            aux += nums[i];
        }else{
            aux = nums[i];
        }
        max = Math.max(max,aux);
        last = nums[i];
    }

    return max;
    }
}
