class Solution {
public:
    vector<string> letterCombinations(string digits) {
        if(!digits.empty()){
        nums = digits;
        backtrack("",0);
        }
        return sol;
    }

private:
    vector<string> sol;
    string nums;
    vector<string> let{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    void backtrack(string str,int index){
    if(str.size()==nums.size()){
        sol.push_back(str);
        return;
    }
    if(index==nums.size()){
        return;
    }
    int next = nums[index]-'2';
    for(int i=0;i<let[next].size();i++){
        backtrack(str+let[next][i],index+1);
    }
    }
};
