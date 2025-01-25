class Solution {
    int[][] mem;
    public int minPathSum(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    mem = new int[m][n];
    for(int[] arr : mem){
        Arrays.fill(arr,-1);
    }
    mem[m-1][n-1] = grid[m-1][n-1];
    solve(m,n,grid,0,0);
    return mem[0][0];
   }

    public int solve(int m, int n, int[][] grid, int i,int j){
        if(i>=m)
            return -1;
        if(j>=n)
            return -1;
        if(j==n-1 && i==m-1)
            return grid[i][j];
        int f = -1;
        int s = -1;
        if(i+1<m){
            f = mem[i+1][j];
            if(f==-1)
                f = solve(m,n,grid,i+1,j);
        }
        if(j+1<n){
            s = mem[i][j+1]; 
            if(s==-1)
                s = solve(m,n,grid,i,j+1);
        }
        if(!(s==-1 && f==-1))
           mem[i][j] = Math.min(f,s) + grid[i][j];
        if(f==-1)
            mem[i][j] = s + grid[i][j];
        if(s==-1)
            mem[i][j] = f + grid[i][j];
        return mem[i][j];
    }
}
