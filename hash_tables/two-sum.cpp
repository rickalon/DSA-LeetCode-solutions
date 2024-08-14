class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
    unordered_multiset<int> hs(nums.begin(),nums.end());
    const auto size = nums.size();
    int num1{},num2{},id1{0},id2{0};
    for(;id1 < size;id1++)
    {
    if(auto search = hs.find(nums[id1]); search != hs.end()){
        num1 = *search;
        hs.erase(search);
    }

    if(auto search = hs.find(target - num1); search != hs.end()){
        num2 = *search;
        break;
    }
    }
    for(id2 = id1+1; id2 < size;id2++){
    if(nums[id2] == num2){
        break;
    }
    }

    return vector<int> {id1,id2};
    }
};
