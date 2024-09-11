class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
    make_heap(nums.begin(),nums.end());
    for(int iii=1;iii<k;iii++){
        pop_heap(nums.begin(),nums.end());
        nums.pop_back();
    }
    return nums.front();
    }
};
