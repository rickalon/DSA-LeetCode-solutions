class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
    int i{0},j{0};
    auto iii{matrix.front().size()-1},jjj{matrix.size()-1};
    int direction{1};
    vector<int> result;
    while(i<=iii && j <=jjj){
    
    if(direction ==1){
    for(int a = i;a<=iii;a++){
        result.push_back(matrix[j][a]);
    }
    j++;
    direction = 2;
    }
    else if(direction == 2){
    for(int a = j;a<=jjj;a++){
        result.push_back(matrix[a][iii]);
    }
    iii--;
    direction = 3;
    }
    else if(direction == 3){
    for(int a = iii;a>=i;a--){
        result.push_back(matrix[jjj][a]);
    }
    jjj--;
    direction = 4;
    }
   else  if(direction ==4)
    {
    for(int a = jjj;a>=j;a--){
        result.push_back(matrix[a][i]);
    }
    i++;
    direction = 1;
    }
    }
    return result;
    }
};
