class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix[0].length-1;
    int left = 0;
    int right = matrix.length-1;
    int m = 0;
    while(left<=right){
        m = left + (right-left)/2;
        if(matrix[m][0]==target || matrix[m][n]==target)
            return true;
        if(matrix[m][0] > target){
            right = m-1;
        }else if(matrix[m][0] < target && matrix[m][n] > target){
            break;
        }else if(matrix[m][0] < target){
            left = m+1;
        }
    }
    left = 0;
    right = n;
    while(left <= right){
    int s = left + (right-left)/2;
    if(matrix[m][s] > target){
        right = s-1;
    }else if(matrix[m][s] < target){
        left = s+1;
    }else{
        return true;
    }
    }

    return false;    
    }
}
