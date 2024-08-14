class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
    auto left {0};
    auto right{numbers.size()-1};
    while(left < right){
    if(numbers[right]+numbers[left] == target){
        break;
    }else if(numbers[right]+numbers[left] < target){
        left++;
    }else{
        right--;
    }
    }
    int a=left+1,b=right+1;
    return vector<int> {a,b};
    }
};
