class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
    double media{0.0};
    int sum = 0;
    for(int right = 0;right<k;right++)
        sum += nums[right];
    media = (double)sum/k;
    for(int right = k;right<nums.size();right++){
        sum += nums[right];
        sum -= nums[right-k];
        if(((double)sum/k) > media)
            media = (double)sum/k;
    }
    return media;
    }
};
