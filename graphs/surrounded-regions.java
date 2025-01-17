class Solution {
    public void solve(char[][] board) {
    int n = board.length;
    int m = board[0].length;
    dfs(n,m,board,'O','1');
    for(int i = 1;i < n-1;i++){
        for(int j = 1 ; j < m-1;j++){
            if(board[i][j]=='O')
                dfsVisit('O','X',i,j,board,n,m);
        }
    }
    dfs(n,m,board,'1','O');
    }

    public void dfs(int n,int m, char[][] board, char c,char a){
    for(int i = 0 ; i <n;i++){
        if(board[i][0]==c)
            dfsVisit(c,a,i,0,board,n,m);
    }
    for(int j = 0;j<m;j++){
        if(board[n-1][j]==c)
            dfsVisit(c,a,n-1,j,board,n,m);
    }
    for(int i = n-1;i>=0;i--){
        if(board[i][m-1]==c)
            dfsVisit(c,a, i,m-1,board,n,m);
    }
    for(int j=m-1;j>=0;j--){
        if(board[0][j]==c)
            dfsVisit(c,a,0,j,board,n,m);
    }
    }
    public void dfsVisit(char c, char a,int i, int j,char[][] board,int n ,int m){
    if(board[i][j]==c)
        board[i][j]=a;
    else
        return;
    if(i>0){
        dfsVisit(c,a,i-1,j,board,n,m);
    }
    if(i<n-1){
        dfsVisit(c,a,i+1,j,board,n,m);
    }
    if(j>0){
        dfsVisit(c,a,i,j-1,board,n,m);
    }
    if(j<m-1){
        dfsVisit(c,a,i,j+1,board,n,m);
    }
    }
    
}
