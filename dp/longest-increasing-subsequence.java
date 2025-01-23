class Solution {
    public int lengthOfLIS(int[] nums) {
    int N = nums.length;
    int[] arr = new int[N];
    Arrays.fill(arr,1);

    for(int i = 1; i < N ; i++){
        int max = 0;
        for(int j =i-1 ; j >= 0;j--){
            if(nums[i] > nums[j]){
                max = Math.max(max,arr[j]);
            }
        }
        arr[i] += max;
    }
    int max = 1;
    for(int num : arr)
        max = Math.max(num,max);
    return max;   
    }
}
