class Solution {
    List<List<Integer>> board;
    int[][] mem;

    public int minimumTotal(List<List<Integer>> triangle) {
    this.board = triangle;
    mem = new int[board.size()][board.get(board.size()-1).size()];
    for(int i = 0 ; i < board.size();i++){
        for(int j = 0 ; j < board.get(i).size();j++){
            if(i==board.size()-1)
                mem[i][j] = board.get(i).get(j);
            else
                mem[i][j] = -1;
        }
    }
    return solve(0,0);
    }
    public int solve(int i,int j){
    if(i==board.size())
        return 0;
    if(j==board.get(i).size())
        return 0;
    if(i==board.size()-1)
        return board.get(i).get(j);
    int val = board.get(i).get(j);
    if(mem[i][j]==-1)
        mem[i][j] = Math.min(solve(i+1,j),solve(i+1,j+1))+val;
    return mem[i][j];
        
    }
}
