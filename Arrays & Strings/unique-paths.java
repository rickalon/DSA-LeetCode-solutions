class Solution {
    int[][] grid;
    int[][] mem;
    public int uniquePaths(int m, int n) {
    grid = new int[m][n];
    mem = new int[m][n];
    return solve(0,0);
    }

    public int solve(int i, int j){
        if(i>=grid.length)
            return 0;
        if(j>=grid[0].length)
            return 0;
        if(i==grid.length-1 && j==grid[0].length-1){
            return 1;
        }
        if(mem[i][j]!=0)
            return mem[i][j];
        mem[i][j] = solve(i+1,j) + solve(i,j+1);
        return mem[i][j];

    }
}
