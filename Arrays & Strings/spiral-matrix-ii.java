class Solution {
    public int[][] generateMatrix(int n) {
    int matrix[][] = new int[n][n];
    int number = 1;
    int top=0,left=0,right=n-1,bottom=n-1;
    while(number <= n*n){
       
        for(int i = left;i<=right;i++){
            matrix[top][i] = number++;
        }
        top++;
        for(int i = top;i<=bottom;i++){
            matrix[i][right] = number++;
        }
        right--;
        for(int i = right;i>=left;i--){
            matrix[bottom][i] = number++;
        }
        bottom--;
        for(int i = bottom;i>=top;i--)
        {
            matrix[i][left] = number++;
        }
        left++;
    }
    return matrix;
    }
}
