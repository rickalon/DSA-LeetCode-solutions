class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
    unordered_multiset<int> hs (nums.begin(),nums.end());
    bool result {false};
    for(const int& ref: hs){
        if(hs.count(ref) > 1){
            return true;
        }
    }
    return result;
    }
};
