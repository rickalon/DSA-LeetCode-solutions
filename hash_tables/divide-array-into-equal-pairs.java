class Solution {
    public boolean divideArray(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for(int num : nums){
        if(set.contains(num)){
            set.remove(num);
        }else{
            set.add(num);
        }
    }
    return (set.size()==0)?true:false;
    // for(int i = 0 ; i < n ; i++){
    //     if(nums[i]!=0){
    //         int aux = nums[i];
    //         nums[i] = 0;
    //         boolean change = false;
    //         for(int j = i+1; j < n ; j++){
    //             if(nums[j]==aux){
    //                 nums[j] = 0;
    //                 change = true;
    //                 break;
    //             }
    //         }
    //         if(!change)
    //             return false;
    //     }
    // }
    // return true;
    }
}
