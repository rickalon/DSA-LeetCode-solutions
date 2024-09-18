class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
    nums = candidates;
    t = target;
    recursive(0,0);
    return res;
    }
private:
    vector<int> sol;
    vector<vector<int>> res;
    vector<int> nums;
    int t;
    void recursive(int i, int sum){
    if(sum == t){
        res.push_back(sol);
        return;
    }
    if(sum > t || i == nums.size()){
        return;
    }
    recursive(i+1,sum);
    sol.push_back(nums[i]);
    recursive(i,sum + nums[i]);
    sol.pop_back();
    }
};
