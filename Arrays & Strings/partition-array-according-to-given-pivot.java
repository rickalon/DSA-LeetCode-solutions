class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
    int index = -1;
    int count = 0;
    List<Integer> list = new ArrayList<>();
    for(int num : nums){
        if(num < pivot){
            nums[++index] = num;
        }else if(num==pivot){
            count++;
        }else{
            list.add(num);
        }
    }
    for(int i = 0 ; i < count ; i++){
        nums[++index] = pivot;
    }
    for(int num : list){
        nums[++index]=num;
    }
    return nums;
    // int n = nums.length;
    // int[] ans = new int[n];
    // int index = 0;
    // int pivotCount = 0;
    // for(int num : nums){
    //     if(num < pivot){
    //         ans[index++]=num;
    //     }else if(num==pivot){
    //         pivotCount++;
    //     }
    // }
    // for(int i = 0 ; i < pivotCount;i++){
    //     ans[index++]=pivot;
    // }
    // for(int num : nums){
    //     if(num > pivot){
    //         ans[index++]=num;
    //     }
    // }
    // return ans;
    }
}
