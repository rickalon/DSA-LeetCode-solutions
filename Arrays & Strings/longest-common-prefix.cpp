class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
    const auto size = strs.size();
    string prefix{strs.front()};
    if(size == 1)
        return strs.front();

    for(int iii{1};iii<size;iii++)
    {
    string aux {};
    for(int jjj{0};jjj<prefix.size();++jjj)
    {
    if(jjj < strs[iii].size() &&  strs[iii][jjj] == prefix[jjj]){
        aux += prefix[jjj];
    }else{
        break;
    }
    }
    prefix = aux;
    }

    return prefix;
    }
};
