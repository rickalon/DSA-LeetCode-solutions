class Solution {
    private int n,m;
    private int[][] grid;
    private int[][] mem;
    public int uniquePathsWithObstacles(int[][] grid) {
    n = grid[0].length;
    m = grid.length;
    this.grid = grid;
    mem = new int[m][n];
    for(int[] num : mem)
        Arrays.fill(num,-1);
    return solve(0,0);
    }

    public int solve(int i, int j){
    if(i>=m || j>=n)
        return 0;
    if(grid[i][j]==1)
        return 0;
    if(i==m-1 && j==n-1){
        return 1;
    }
    if(mem[i][j]==-1)
        mem[i][j] = solve(i+1,j) + solve(i,j+1);
    return mem[i][j];
    }
}
