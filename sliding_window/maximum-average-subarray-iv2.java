class Solution {
    public double findMaxAverage(int[] nums, int k) {
    double avg = 0.0;
    //validamos la ventana incial
    for(int i = 0 ; i < k;i++){
        avg += nums[i];
    }
    double max = avg/k;
    for(int i = k ;i<nums.length;i++){
        avg += nums[i]-nums[i-k];
        max = Math.max(avg/k,max);
    }

    return max;    
    }
}
