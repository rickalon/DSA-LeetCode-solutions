class Solution {
    public int longestNiceSubarray(int[] nums) {
    int ans = 1;
    int n = nums.length;
    for(int i = 0 ; i < n ; i++){
        int aux = i;
        int counter = 1;
        while(i+1 < n){
            boolean finish = true;
            for(int j = aux; j <= i ; j++){
                if((nums[j] & nums[i+1]) != 0)
                    finish = false;
            }
            if(!finish)
                break;
            i++;
            counter++;
            ans = Math.max(counter,ans);
        }
        i = aux;
    }
    return ans;   
    }
}
