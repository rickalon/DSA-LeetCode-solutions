class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
    int n = (int)nums.size();
    vector<vector<int>> result;
    vector<int> sol;
    vector<bool> used(nums.size(), false);
    core(n,result,sol,nums,used);
    return result;   
    }
private:
void core(int n,vector<vector<int>>& result, vector<int>& sol,vector<int>& nums,vector<bool>& used){
        if(sol.size()==n){
            result.push_back(sol);
            return;
        }
        for(int iii=0;iii<nums.size();iii++){
            if(used[iii])continue;
            sol.push_back(nums[iii]);
            used[iii] = true;
            core(n,result,sol,nums,used);
            sol.pop_back();
            used[iii]=false; 
        }


    }
};
