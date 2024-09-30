class Solution {
public:
    int trap(vector<int>& h) {
    int left = 0;
    int right = h.size()-1;
    int sol = 0;
    int lev = 0;
    int low = 0;
    while(left < right){
    if(h[left] < h[right]){
        low = h[left];
        left++;
    }else{
        low = h[right];
        right--;
    }
    lev = max(lev,low);
    sol += lev - low;
    }

    return sol;
    }
};
