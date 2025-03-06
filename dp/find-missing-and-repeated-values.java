class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
    int a = 0, b = 0;
    int n = grid.length;
    int[] arr = new int[n*n+1];
    for(int[] g : grid){
        for(int num : g){
            arr[num]++;
        }
    }
    for(int i = 1 ; i < arr.length; i++){
        if(arr[i]==0)
            b=i;
        if(arr[i]==2)
            a=i;
    }

    return new int[]{a,b};
    }
}
