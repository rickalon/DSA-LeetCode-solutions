class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
    unordered_multiset<char> hs(ransomNote.begin(),ransomNote.end());
    bool result = false;
    for(int iii=0;iii<magazine.size();iii++)
    {
        if(auto iter = hs.find(magazine[iii]); iter != hs.end())
        {
            hs.erase(iter);
        }
    }
    if(hs.empty()){
        result = true;
    }
    return result;   
    }
};
