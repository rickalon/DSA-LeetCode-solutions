class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
    int n = (int)nums.size();
    vector<vector<int>> result;
    vector<int> sol;
    core(0,n,result,sol,nums);
    return result;

    }
private:
    void core(int i,int n,vector<vector<int>>& result, vector<int>& sol,vector<int>& nums){
        if(i==n){
            result.push_back(sol);
            return;
        } 
        core(i+1,n,result,sol,nums);
        sol.push_back(nums[i]);
        core(i+1,n,result,sol,nums);
        sol.pop_back();
    }
};
