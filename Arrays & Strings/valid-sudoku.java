class Solution {
    public boolean isValidSudoku(char[][] board) {

    for(int i = 0 ; i < 9 ; i ++){
        for(int j = 0 ; j < 9;j++){
            int current = board[i][j];
            if(current == '.'){continue;}
            for(int z = 0 ; z < 9 ; z++){
                //same horizontal line
                if(j!=z && current == board[i][z]){
                    return false;
                }
            }
            //same vertical line
            for(int z = 0 ; z < 9 ; z++){
                if(z!=i && board[z][j] == current){
                    return false;
                }
            }
            //same grid
            for(int z = (i/3)*3; z < (((i/3)*3)+3) ;z++){
                for(int x = (j/3)*3; x < (((j/3)*3)+3) ;x++){
                    if(z!=i && x!=j && board[z][x]==current){
                        return false;
                    }
                }
            }
        }
    }

    return true;
    }
}
