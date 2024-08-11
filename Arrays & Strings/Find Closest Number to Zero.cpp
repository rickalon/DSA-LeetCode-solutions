class Solution {
public:
    int findClosestNumber(vector<int>& nums) {
        int result = {nums[0]};

        for(int iii = 1; iii < nums.size();iii++)
        {
            if(abs(nums[iii]) < abs(result) || (abs(nums[iii]) == abs(result) && nums[iii] > result))
                result = nums[iii];
        }
        
        return result;
    }
};
