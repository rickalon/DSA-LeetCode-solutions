class Solution {
public:
    bool checkInclusion(string s1, string s2) {
    unordered_multiset<char> set;
    for(int iii=0;iii<s1.size();iii++){
        set.insert(s1[iii]);
    }   
    for(int r=0,l=0;r<s2.size();r++){
    if(auto ite = set.find(s2[r]); ite != set.end()){
        set.erase(ite);
    }else{
        while(set.count(s2[r]) == 0 && l<r){
            set.insert(s2[l]);
            l++;
        }
        if(auto search = set.find(s2[r]); search != set.end()){
             set.erase(search);
        }else{
            l++;
        }
    }
    if(set.empty())
        return true;
    }   

    return false;
    }
};
