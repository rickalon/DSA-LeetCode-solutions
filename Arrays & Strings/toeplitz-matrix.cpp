class Solution {
public:
    bool isToeplitzMatrix(vector<vector<int>>& matrix) {
    int m = (int)matrix.size();
    int n = (int)matrix[0].size();
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(i!=0 && j!=0 && matrix[i][j] != matrix[i-1][j-1]){
                return false;
            }
        }
    }
    return true;
    }
};
