class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string result {};
        const auto size_array = word1.size()+word2.size(); 
        for(int iii {1},it1{0},it2{0};iii <= size_array;++iii)
        {
            if(it1 < word1.size() && (iii%2 != 0 || it2 == word2.size())){
                result.append(1,word1[it1++]);
            }else{
                result.append(1,word2[it2++]);
            }
        }
        return result;
    }
};
