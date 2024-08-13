class Solution {
public:
    int maxNumberOfBalloons(string text) {
    const string_view str {"balloon"};
    unordered_multiset<char> hs(text.begin(),text.end());
    int sol {0};
    
    for(int jjj=0;jjj<(text.size()/str.size()+1);jjj++)
    {
    int c {0};
    for(int iii=0;iii<str.size();iii++)
    {
        if(auto iter = hs.find(str[iii]); iter != hs.end()){
            hs.erase(iter);
            c++;
        }
        if(c == str.size()){
            sol++;
        }
    }
    }
    return sol;
    }
};
