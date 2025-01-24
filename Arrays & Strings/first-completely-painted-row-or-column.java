class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
    int M = mat.length;
    int N = mat[0].length;
    int[][] pos = new int[arr.length+1][2];
    int[][] col = new int[N][1];
    int[][] row = new int[M][1];
    for(int i = 0 ; i < M ; i++){
        for(int j = 0 ; j < N ; j++){
            pos[mat[i][j]][0] = i;
            pos[mat[i][j]][1] = j;
        }
    }
    int index = 0;
    for(int num : arr){
        int i = pos[num][0];
        int j = pos[num][1];
        col[j][0]++;
        if(col[j][0]==M)
            return index;
        row[i][0]++;
        if(row[i][0]==N)
            return index;
    index++;   
    }
    return index;
    }
}
