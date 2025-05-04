#include <vector>
using namespace std;

class Solution {
public:
    long long numEquivDominoPairs(const vector<vector<int>>& dominoes) {
        long long pairs = 0;
        int counts[10][10] = {0};
        
        for (const auto& d : dominoes) {
            int a = d[0], b = d[1];
            pairs += counts[a][b];
            counts[a][b]++;
            if (a != b) {
                counts[b][a]++;
            }
        }
        
        return pairs;
    }
};
