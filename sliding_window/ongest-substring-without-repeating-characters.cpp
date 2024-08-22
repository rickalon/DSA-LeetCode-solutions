class Solution {
public:
    int lengthOfLongestSubstring(string s) {
    unordered_set<char> set;
    int left{0},length {0};
    for(int right=0;right<s.size();right++)
    {
        while(set.count(s[right]))
            set.erase(s[left++]);
        length = max(length,(right-left+1));
        set.insert(s[right]);
    }
    return length;
    }
};
