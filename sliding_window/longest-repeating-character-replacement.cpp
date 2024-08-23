class Solution {
public:
    int characterReplacement(string s, int k) {

    int longest{0},macs{0};
    vector<int> vc(26,0);
    for(int l=0,r=0;r<s.size();r++)
    {
        macs = max(macs,++vc[s[r]-'A']);
        while((r-l+1) - macs > k)
        {
            vc[s[l]-'A']--;;
            l++;
        }
        longest = max(longest,(r-l+1));
    }   
    return longest;
    }
};
