class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    for(int i = 0 ; i <nums.length;i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        int left = i+1;
        int right = nums.length-1;
        while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    list.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[left],nums[right])));
                    int lv = nums[left++];
                    int rv = nums[right--];
                    while(left < right && nums[left]==lv){
                        left++;
                    }
                    while(right > left && nums[right]==rv){
                        right--;
                    }
                }else if(sum > 0){
                    right--;
                }else{
                    left++;
                }
          }
    }
    return list;
    }
}
