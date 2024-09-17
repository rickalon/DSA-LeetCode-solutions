class Solution {
public:
    vector<vector<int>> combine(int n, int k) {
        back(n,k);
        return sol;
    }
private:
    vector<vector<int>> sol;
    vector<int> aux;
    void back(int i,int k){
    if(aux.size()==k){
        sol.push_back(aux);
        return;
    }
    int left = i;
    int need = k - aux.size();
    if (left > need)
        back(i-1,k);
    aux.push_back(i);
    back(i-1,k);
    aux.pop_back();
    }
};
