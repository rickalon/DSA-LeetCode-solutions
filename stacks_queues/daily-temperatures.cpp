class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
    stack<vector<int>> st;
    vector<int> sol(temperatures.size(),0);
    for(int iii=0;iii<temperatures.size();iii++)
    {
    while(!st.empty() && temperatures[iii] > st.top()[0]){
    int id {st.top()[1]};
    sol[id] = iii-id;
    st.pop();
    }
    st.push(vector<int>{temperatures[iii],iii});
    }
    return sol;
    }
};
