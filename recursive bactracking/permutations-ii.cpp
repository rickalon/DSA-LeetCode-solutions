class Solution {
public:
    vector<vector<int>> permuteUnique(vector<int>& nums) {
        back(nums,set<int>{});
        return sol;
    }
private:
    vector<vector<int>> sol;
    vector<int> aux;
    map<vector<int>,bool> map;

    void back(vector<int>& nums,set<int> index){
    if(aux.size()==nums.size()){
        if(!map[aux]){
            map[aux] = true;
            sol.push_back(aux);
        }
        return;
    }
    for(int i = 0;i<nums.size();i++){
    if(index.count(i)==0){
        aux.push_back(nums[i]);
        index.insert(i);
        back(nums,index);
        auto it = index.find(i);
        index.erase(it);
        aux.pop_back();
    }
    }
    }
};
