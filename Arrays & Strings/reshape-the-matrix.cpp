class Solution {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& mat, int r, int c) {
    int n {(int)mat[0].size()},m{(int)mat.size()};
    if(m==r && n==c || m*n != r*c) return mat;
    vector<int> aux;
    for(vector<int>& rows:mat){
      for(int i:rows){
            aux.push_back(i);
        }
    }
    vector<vector<int>> sol(r,vector<int>(c,0));
    int it=0;
    for(vector<int>& rows:sol){
        for(int& i:rows){
            i = aux[it++];
        }
    }
    return sol;
    }
};
