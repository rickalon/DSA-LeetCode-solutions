class Solution {
    public void rotate(int[] nums, int k) { 
    //lenta O(nk)
    // int end = nums.length-1;
    // while(k>0){
    //         int temp = nums[end];
    //         for(int i = end; i > 0;i--){
    //             nums[i] = nums[i-1];
    //         }
    //         nums[0] = temp;
    //         k--;
    // }
    //O(k) + O(n)
    // k = k % nums.length;
    // int[] aux = new int[k];
    // for(int i = 0, j = k; i <aux.length ;i++,j--){
    //     aux[i] = nums[nums.length-j];
    // }
    // for(int i = nums.length-1;i>=k;i--){
    //     nums[i] = nums[i-k];
    // }
    // for(int i = 0; i < k;i++){
    //     nums[i] = aux[i];
    // }
    //O(n) aproach, constant time
    k %= nums.length;
    rotate(nums,0,nums.length-1);
    rotate(nums,0,k-1);
    rotate(nums,k,nums.length-1);
    }
    public void rotate(int[] array,int left,int right){
        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;right--;
        }
    }
}
