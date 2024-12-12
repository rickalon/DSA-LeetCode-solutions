class Solution {
    public int equalPairs(int[][] grid) {
    int equal = 0;
    int n = grid.length;
    for(int i = 0 ; i < n;i++){
        for(int j = 0; j < n;j++){
            for(int x = 0 ; x < n;x++){
                if(grid[i][x]!=grid[x][j]){
                    break;
                }
                if(x==n-1){
                    equal++;
                }
            }
        }
    }    
    return equal;
    }
}
