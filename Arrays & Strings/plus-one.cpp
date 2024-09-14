class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
    if(digits[digits.size()-1]==9){
        int i=(int)digits.size()-1;
        while(i>=0){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                return digits;
            }
        i--;
        }
    digits.push_back(0);
    digits[0]=1;
    }else{
        digits[digits.size()-1]++;
    }
    return digits;
    }
};
