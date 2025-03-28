class Solution {
    int[] ans;
    int[][] grid;
    int[] nums;
    int[][] redem;
    int[][] path;
    public int[] maxPoints(int[][] grid, int[] queries) {
    int n = queries.length;
    this.grid = grid;
    nums = queries;
    ans = new int[n];
    for(int i = 0 ; i < n;i++){
        redem = new int[grid.length][grid[0].length];
        path = new int[grid.length][grid[0].length];
        solve(0,0,i);
    }
    return ans;
    }
    public void solve(int i,int j, int index){
    if(!(i>=0 && i <grid.length && j>=0 && j<grid[0].length)){
        return;
    }
    if(path[i][j] == 0 && grid[i][j]<nums[index] && nums[index]>redem[i][j]){
        path[i][j] = 1;
        if(redem[i][j]==0){
            ans[index]++;
            redem[i][j]= nums[index];
        }
        solve(i+1,j,index);
        solve(i-1,j,index);
        solve(i,j+1,index);
        solve(i,j-1,index);
    }
    }
}
