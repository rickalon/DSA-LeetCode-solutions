class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
    int size = 0;
    int index = 0;
    set<int> st;
    for(int n:nums){
        if(st.count(n) == 0){
            st.insert(n);
            nums[index++] = n;
        }
    }
    return st.size();
    }
};
