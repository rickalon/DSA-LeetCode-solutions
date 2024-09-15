class Solution {
public:
    bool buddyStrings(string s, string goal) {
        if(s.length() != goal.length()){
            return false;
        } 
        if(s == goal){
            return (set<char>(s.begin(), s.end())).size()<s.length();
        } 
        int left=0;
        int right=s.length()-1;
        while(left<=right && s[left] == goal[left]){
            left++;
        }
        while(right >=0 && s[right] == goal[right]){
            right--;
        }
        if(left<right){
            swap(s[left], s[right]);
        }
        return s==goal;
    }
};
