class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
       unordered_multiset<char> hs(stones.begin(),stones.end());
       int counter{0};
       for(int iii=0;iii<jewels.size();iii++)
       {
        counter += hs.count(jewels[iii]);
       } 
       return counter;
    }
};
