class Solution {
    int[][] board;
    int n;

    public int totalNQueens(int n) {
    board = new int[n][n];
    this.n = n;
    return resolve(0,0);
    }

    public int resolve(int row,int j){
        if(row!=0){
        //hor
        for(int i =0;i<n;i++){
            if(j!=i && board[row-1][i]==1){
                return 0;
            }
        }
        //ver
        for(int i = 0 ; i < n ; i++){
            if(i!=row-1 && board[i][j]==1){
                return 0;
            }
        }
        //diag
        int digRow = row-1;
        int digCol = j;
        while(digRow>0 && digCol>0){
            digRow--;
            digCol--;
        }
        while(digRow<n && digCol<n){
            if(digRow!=row-1 && digCol!=j && board[digRow][digCol]==1){
                return 0;
            }
            digRow++;
            digCol++;
        }
        digRow = row-1;
        digCol = j;
        while(digRow<n-1 && digCol>0){
            digRow++;
            digCol--;
        }
        while(digRow>=0 && digCol<n){
            if(digRow!=row-1 && digCol!=j && board[digRow][digCol]==1){
                return 0;
            }
            digRow--;
            digCol++;
        }
        }
        if(row==n){
            return 1;
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            board[row][i] = 1;
            ans += resolve(row+1,i);
            board[row][i] = 0;
        }
        return ans;
    }
}
