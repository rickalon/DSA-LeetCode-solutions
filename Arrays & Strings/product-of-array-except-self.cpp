class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
    vector<int> answer(nums.size(),1);
    const auto size {nums.size()};
    int left{1},right{1};
    for(int iii=1;iii<size;iii++){
        left *= nums[iii-1];
        answer[iii] = left;
    }
    for(int iii=size-2;iii>=0;iii--)
    {
        right *= nums[iii+1];
        answer[iii] *= right;
    }

    return answer;
    }
};
