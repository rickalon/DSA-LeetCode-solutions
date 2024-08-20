class Solution {
public:
    int search(vector<int>& nums, int target) {
    int l{0},r{(int)nums.size()-1};
    int m = (l+r)/2;
    while(nums[m]!=target){
    if(nums[m]<target){
        l = m+1;
    }else{
        r = m-1;
    }
    if(l > r){
        return -1;
    }
        m = (l+r)/2;
    }

    return m;   
    }
};
