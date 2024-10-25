class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
    //lets assume that the intervals are ordered by start
    Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));

    int[][] aux = new int[intervals.length][intervals[0].length];
    aux[0] = intervals[0];
    int number = 0;

    for(int i = 1;i<intervals.length;i++){
        if(intervals[i][0] < aux[number][1]){
            if(intervals[i][1] < aux[number][1]){
                aux[number] = intervals[i];
            }
        }else{
            aux[++number] = intervals[i];
        }
    }

    return intervals.length-1-number;     
    }
}
