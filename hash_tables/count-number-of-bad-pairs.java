class Solution {
    public long countBadPairs(int[] nums) {
    Map<Integer,Integer> map = new HashMap<>();
    long count  = 0;
    int n = nums.length;
    for(int i = 0 ; i < n; i++)
        count += -1 + map.merge(nums[i]-i,1,Integer::sum);
    return ((long)n) * (n-1) / 2 - count;
    }
    // long pairs = 0;
    // int n = nums.length;
    // int[] ans = new int[n];
    // Map<Integer,Integer> map = new HashMap<>();
    // for(int i = 0,z = n-1 ; i < n ; i++,z--)
    //     pairs += z;
    // for(int i = 0 ; i < n ; i++){
    //     ans[i] = nums[i]-i;
    //     map.put(ans[i],map.getOrDefault(ans[i],0)+1);
    // }
    // for(int num : ans){
    //     int val = map.get(num);
    //     if(val>1){
    //         pairs = pairs - val + 1;
    //         map.put(num,val-1);
    //     }
    // }
    // return pairs;
}
