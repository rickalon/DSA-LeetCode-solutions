class Solution {
public:
    int maxArea(vector<int>& height) {
    int left = 0;
    int right = height.size()-1;
    int sum = -1;
    while(left < right){
        int minVal = min(height[left],height[right])*(right-left);
        sum = max(minVal,sum);
    (height[left] < height[right])?left++:right--;
    }
    return sum;
    }
};
