class Solution {
    public void sortColors(int[] nums) {
        int colors = 3;
        int n = nums.length;
        int[] freq = new int[colors];
        for(int num : nums) freq[num]++;
        for(int i = 0, j = 0 ; i < n ; i++){
            while(freq[j]==0) j++;
            nums[i]=j;
            freq[j]--;
        }
    }
}
