class Solution {
    public void gameOfLife(int[][] board) {
    //any cell with <2 live cells dies
    //anu ce;; wotj 2 and 3 live cell lives
    //any cell with more tht 3 cells dies for over populations
    //any dead cell with 3 live cells lives(reanimates) 
    int n = board.length;
    int m =  board[0].length;   
    for(int i = 0 ; i < n ; i ++){
        for(int j = 0 ; j < m ; j++){
        int current = board[i][j];
        int ones = 0;
        int zeros = 0;
        int a=0,b=0,c=0,d=0;
        if(j+1 < m){
            b++;
            c++;
            int temp = board[i][j+1];
            if(temp==0){zeros++;}else if(temp==1){ones++;}else if(temp==2){ones++;}else{zeros++;}
        }
        if(i+1<n){
            c++;
            d++;
            int temp = board[i+1][j];
            if(temp==0){zeros++;}else if(temp==1){ones++;}else if(temp==2){ones++;}else{zeros++;}       
             }

        if(i-1>=0){
            a++;
            b++;
            int temp = board[i-1][j];
            if(temp==0){zeros++;}else if(temp==1){ones++;}else if(temp==2){ones++;}else{zeros++;}
        }
        if(j-1>=0){
            a++;
            d++;
            int temp = board[i][j-1];
            if(temp==0){zeros++;}else if(temp==1){ones++;}else if(temp==2){ones++;}else{zeros++;}        }
        if(a==2){
            int temp = board[i-1][j-1];
            if(temp==0){zeros++;}else if(temp==1){ones++;}else if(temp==2){ones++;}else{zeros++;}        }
        if(b==2){
            int temp = board[i-1][j+1];
            if(temp==0){zeros++;}else if(temp==1){ones++;}else if(temp==2){ones++;}else{zeros++;}        }
        if(c==2){
            int temp = board[i+1][j+1];
            if(temp==0){zeros++;}else if(temp==1){ones++;}else if(temp==2){ones++;}else{zeros++;}        }
        if(d==2){
            int temp = board[i+1][j-1];
            if(temp==0){zeros++;}else if(temp==1){ones++;}else if(temp==2){ones++;}else{zeros++;}         }
        //2 from 1 to 0
        //3 frtom 0 to 1
        //1 dont change
        //0 dont chage
        if(current == 0){
            if(ones==3){
                board[i][j]=3;
            }
        }else if(current==1){
            if(ones<2 || ones>3){
                board[i][j]=2;
            }
        }
    }
    }
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            if(board[i][j]==2){
                board[i][j]=0;
            }else if(board[i][j]==3){
                board[i][j]=1;
            }
        }
    }
    }
}
