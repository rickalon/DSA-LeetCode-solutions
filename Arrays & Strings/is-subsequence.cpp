class Solution {
public:
    bool isSubsequence(string s, string t) {
        bool result {false};
        const auto size = t.size();
        if(s.empty())
            return true;
        if(t.empty())
            return false;
        for(int iii{0},jjj{0};iii<size;++iii)
        {
            if(jjj < s.size() && t[iii] == s[jjj]){
                if(++jjj == s.size())
                {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
};
