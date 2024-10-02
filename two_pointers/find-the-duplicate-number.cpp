class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int right = 0;
        set<int> set;        
        while(right < nums.size()){
        if(set.count(nums[right])==0){
            set.insert(nums[right]);
        }else{
            return nums[right];
        }
        right++;
        }
    return -1;
    }
};
