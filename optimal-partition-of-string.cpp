class Solution {
public:
    int partitionString(string s) {
    unordered_set<char> set;
    int sol{1};
    for(int r=0;r<s.size();r++){
        cout << 'A'  << s[r] << endl;
        if(set.count(s[r])){
            cout << s[r] << endl;
            set.clear();
            sol++;
        }
    set.insert(s[r]);
    }   
    return sol;
    }
};
