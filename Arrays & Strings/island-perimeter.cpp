class Solution {
public:
    int islandPerimeter(vector<vector<int>>& grid) {
        int counter{0};
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[i].size();j++){
               if(grid[i][j]==1){
                  if(j!=0 && grid[i][j-1]==0) counter ++;
                  else if(j==0) counter++;

                  if(i!=0 && grid[i-1][j]==0) counter ++;
                  else if(i==0) counter++;

                  if(j!=grid[i].size()-1 && grid[i][j+1]==0) counter ++;
                  else if(j==grid[i].size()-1) counter++;

                  if(i!=grid.size()-1 && grid[i+1][j]==0) counter ++;
                  else if(i==grid.size()-1) counter++;
               }
            }
        }
        return counter;
    }
};
