class Solution {
public:
    bool isAnagram(string s, string t) {
    if(s.size() != t.size())
        return false;
    unordered_multiset<char> hs(t.begin(),t.end());
    bool sol {false};
    for(int iii=0;iii<s.size();iii++)
    {

        if(auto iter = hs.find(s[iii]); iter != hs.end())
        {
            hs.erase(iter);
        }
    } 
    if(hs.empty())
        sol = true;
    return sol;
    }
};
