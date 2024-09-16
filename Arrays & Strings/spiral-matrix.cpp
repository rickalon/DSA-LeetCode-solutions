class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
    vector<int> sol;
    int m{(int)matrix.size()},n{(int)matrix[0].size()};
    int i=0,j=0;
    int up=0,right=1,down=2,left=3;
    int direction = right;
    int up_wall = 0,right_wall=n,down_wall=m,left_wall=-1;
    while(sol.size() != m*n){
        if(direction == right){
            while(j<right_wall){
                sol.push_back(matrix[i][j]);
                j++;
            }
            i++;j--;
            right_wall--;
            direction=down;
        }
        else if(direction==down){
            while(i<down_wall){
                sol.push_back(matrix[i][j]);
                i++;
            }
            i--;j--;
            down_wall--;direction=left;
        }
        else if(direction==left){
            while(j>left_wall){
                sol.push_back(matrix[i][j]);
                j--;
            }
            j++;i--;
            left_wall++;direction=up;
        }
        else{
            while(i>up_wall){
                sol.push_back(matrix[i][j]);
                i--;
            }
            i++;j++;
            direction=right;up_wall++;
        }
    }
    return sol;  
    }
};
