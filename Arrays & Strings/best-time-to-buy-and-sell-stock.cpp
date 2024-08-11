class Solution {
public:
    int maxProfit(vector<int>& prices) {
    int result {0};
    int min = numeric_limits<int>::max();
    const auto size = prices.size();

    for(int iii{0};iii<size;++iii)
    {
        if(min > prices[iii])
        {
            min = prices[iii];
        }else{
            int rr = prices[iii] - min;
            if(rr > result)
                result = rr;
        }
    }

    return result;
    }
};
