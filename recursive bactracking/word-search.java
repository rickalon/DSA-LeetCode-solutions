class Solution {
    private char[][] board;
    private String word;
    private int n,m;
    private int[][] currentPath;
    public boolean exist(char[][] board, String word) {
    int n = board.length;
    int m = board[0].length;
    this.n =n;
    this.m =m;
    this.board = board;
    this.word = word;
    currentPath = new int[n][m];
    for(int i = 0; i < n;i++){
        for(int j =0 ; j < m ;j++){
            if(board[i][j]==word.charAt(0)){
                currentPath[i][j]=1;
                if(resolve(i,j,1))
                    return true;
                currentPath[i][j]=0;
            } 
        }
    }
    return false;
    }

    private boolean resolve(int i, int j, int c){
    if(c == word.length()){
        return true;
    }
    char letter = word.charAt(c);
    if(j+1 < m && currentPath[i][j+1]!=1 && board[i][j+1]==letter){
    currentPath[i][j+1]=1;
    if(resolve(i,j+1,c+1))
        return true;
    currentPath[i][j+1]=0;
    }
    if(j-1>=0 && currentPath[i][j-1]==0 && board[i][j-1]==letter){
    currentPath[i][j-1]=1;
    if(resolve(i,j-1,c+1))
        return true;
    currentPath[i][j-1]=0;
    }
    if(i+1<n && currentPath[i+1][j]==0 && board[i+1][j]==letter){
    currentPath[i+1][j]=1;
    if(resolve(i+1,j,c+1))
        return true;
    currentPath[i+1][j]=0;
    }
    if(i-1>=0 && currentPath[i-1][j]==0 && board[i-1][j]==letter){
    currentPath[i-1][j]=1;
    if(resolve(i-1,j,c+1))
        return true;
    currentPath[i-1][j]=0;
    }
    return false;
    }
}
