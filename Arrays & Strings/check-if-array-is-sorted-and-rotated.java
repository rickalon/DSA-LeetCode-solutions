class Solution {
    public boolean check(int[] nums) {
    int n = nums.length;
    int first = 0;
    for(int i = 1; i < n ; i++){
        if(nums[i-1]>nums[i]){
            first = i;
            break;
        }
    }
    if(first == 0)
        return true;
    int aux = nums[first];
    for(int i = first+1;i<n;i++){
        if(aux > nums[i])
            return false;
        aux = nums[i];
    }
    if(aux > nums[0])
        return false;
    aux = nums[0];
    for(int i = 1 ; i < first;i++){
        if(aux > nums[i])
            return false;
        aux = nums[i];
    }
    return true;
    }
}
