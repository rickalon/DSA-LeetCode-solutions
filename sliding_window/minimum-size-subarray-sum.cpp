class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
    int sum ={0},length{INT_MAX},l{0};
    for(int r=0;r<nums.size();r++)
    {
        sum += nums[r];
          while(sum >= target){
              length = min((r-l+1),length);
              sum -= nums[l++];
          }
    }
    if(l==0)
        length = 0;
    return length; 
    }
};
