class Solution {
public:
    int longestSubarray(vector<int>& nums) {
    int left = 0;
    int right = left;
    int maxVen=0;
    bool good = true;
    while(right < nums.size() && left<=right){
    int window = right-left+1;
    if(window == 1){
        if(nums[left]==0){
            good=false;
        }
        right++;
        maxVen = max(maxVen,window-1);
    }else{
        if(nums[right]==0 && good){
            good=false;
            right++;
            maxVen = max(maxVen,window-1);
        }else if(nums[right]==0 && !good){
            if(nums[left]==0){
                good=true;
            }
            left++;
        }else{
            right++;
            maxVen = max(maxVen,window-1);
        }
    }
    }
    return maxVen;
    }
};
