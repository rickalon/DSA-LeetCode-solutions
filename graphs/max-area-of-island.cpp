class Solution {
public:
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int max_size {0};
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[i].size();j++){
                if(grid[i][j]==1){
                    cout << max_size << endl;
                   max_size = max(max_size,dfs(grid,i,j));
                }
            }
        }


        return max_size;    
    }

private:

    int dfs(vector<vector<int>>& grid,int i,int j){
        if(grid[i][j]==1){
            grid[i][j]=0;
            int n = (int)grid[i].size()-1;
            int m = (int)grid.size()-1;
            int a={0},b={0},c={0},d={0};
            if(j>0) a= dfs(grid,i,j-1);
            if(j<n) b= dfs(grid,i,j+1);
            if(i>0) c = dfs(grid,i-1,j);
            if(i<m) d = dfs(grid,i+1,j);
            return a+b+c+d+1;

        }else{
            return 0;
        }
    }

};
