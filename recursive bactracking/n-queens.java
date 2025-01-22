class Solution {
    int[][] board;
    int n;
    List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {
    board = new int[n][n];
    this.n = n;
    ans = new ArrayList<>();
    resolve(0,0);
    return ans;    
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
            List<String> aux = new ArrayList<>();
            StringBuilder str = new StringBuilder();
            for(int i = 0 ; i < n;i++){
                for(int x = 0 ; x < n ; x++){
                    if(board[i][x]==0){
                        str.append('.');
                    }else{
                        str.append('Q');
                    }
                }
                aux.add(str.toString());
                str = new StringBuilder();   
            }
            ans.add(aux);
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
