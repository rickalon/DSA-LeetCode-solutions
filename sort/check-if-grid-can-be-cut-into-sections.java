class Solution {

    public boolean checkValidCuts(int n, int[][] rectangles) {
        return checkCuts(rectangles, 0) || checkCuts(rectangles, 1);
    }

    private boolean checkCuts(int[][] rectangles, int dim) {
        int gapCount = 0;

        Arrays.sort(rectangles, (a, b) -> Integer.compare(a[dim], b[dim]));

        int furthestEnd = rectangles[0][dim + 2];

        for (int i = 1; i < rectangles.length; i++) {
            int[] rect = rectangles[i];

            if (furthestEnd <= rect[dim]) {
                gapCount++;
            }

            furthestEnd = Math.max(furthestEnd, rect[dim + 2]);
        }

        return gapCount >= 2;
    }
}
// class Solution {
//     public boolean checkValidCuts(int n, int[][] rectangles) {
//     int[][] grid = new int[n][n];
//     int id = 1;
//     for(int[] rectangle : rectangles){
//     int t = n - rectangle[3];
//     int b = n - rectangle[1];
//     int l = rectangle[0];
//     int r = rectangle[2];
//     for(int i = t; i < b;i++){
//         for(int j = l; j < r ; j++){
//             grid[i][j] = id;
//         }
//     }
//     id++;
//     }
//     int cuts = 0;
//     for(int i = 0 ; i < n - 1 ; i++){
//         if(grid[0][i]!=grid[0][i+1]){
//             int j = 1;
//             while(j<n && (grid[j][i] != grid[j][i+1] || (grid[j][i] == 0 && grid[j][i+1]==0))){
//                 j++;
//             }
//             if(j==n){
//                 cuts++;
//             }
//         }
//     }
//     if(cuts>=2)
//         return true;
//     cuts = 0;
//     for(int i = 0 ; i < n - 1 ; i++){
//         if(grid[i][0]!=grid[i+1][0]){
//             int j = 1;
//             while(j<n && (grid[i][j] != grid[i+1][j] || (grid[i][j]==0 && grid[i+1][j]==0))){
//                 j++;
//             }
//             if(j==n){
//                 cuts++;
//             }
//         }
//     }
//     if(cuts>=2)
//         return true;
//     return false;
//     }
// }
