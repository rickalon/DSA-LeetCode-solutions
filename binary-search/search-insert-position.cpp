class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
    int l{0},r{(int)nums.size()-1};
    int m = (l+r)/2;
    while(nums[m]!=target){
    if(nums[m]<target){
        l = m+1;
    }else{
        r = m-1;
    }
    if(l > r){
        return l;
    }
        m = (l+r)/2;
    }

    return m;     
    }
};
