class Solution {
public:
    bool isPalindrome(string s) {
    bool sol {true};
    string str;
    const auto size = s.size();
    for(int iii=0;iii<size;iii++)
    {
    char c {s[iii]};
    if(isalpha(c)){
        if(isupper(c))
            str.push_back(tolower(c));
        else
            str.push_back(c);
    }else if(isdigit(c)){
        str.push_back(c);
    }
    }
    int left {0},right{static_cast<int>(str.size())-1};
    while(left <= right)
    {
    if(str[left] != str[right])
        return false;
    left++;right--;
    }
    return sol;    
    }
};
