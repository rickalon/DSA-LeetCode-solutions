class Solution {
    public int[] applyOperations(int[] nums) {
    int n = nums.length;
    for(int i = 0 ; i < n ; i++) {
        int num = nums[i];
        if(num!=0){
            if(i!=n-1 && num == nums[i+1]){
                nums[i] = num * 2;
                nums[i+1] = 0;
                i++;
            }
        }
    }
    int index = -1;
    for(int num : nums){
        if(num!=0){
            index++;
            nums[index]=num;
        }
    }
    for(int i = index+1; i < n ; i++){
        nums[i]=0;
    }
    return nums; 
    }
}
