class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
    vector<string> result;
    int start {0};
    int iii {0};
    while(iii<nums.size()){
        start = nums[iii];
        while(iii<nums.size()-1 && nums[iii]+1 == nums[iii+1]){
            iii++;
        }
        if(start == nums[iii])  
            result.push_back(to_string(nums[iii]));
        else
            result.push_back(to_string(start) + "->" + to_string(nums[iii]));
        iii++;

    }
    return result;
    }
};
