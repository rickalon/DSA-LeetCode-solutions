// class Solution {
//     int seq;
//     int n;
//     public int numberOfArrays(int[] diff, int lower, int upper) {
//     seq=0;n=diff.length;
//     sol(diff,lower,upper,new int[n+1],0);
//     return seq;
//     }

//     public void sol(int[] diff, int lower, int upper,int arr[],int index){
//         if(index==n+1){
//             seq++;
//             return;
//         }
//         for(int i = lower ; i <= upper;i++){
//             arr[index] = i;
//             if(index>0){
//                 if(diff[index-1]==(arr[index]-arr[index-1]))
//                     sol(diff,lower,upper,arr,index+1);                    
//             }else if(index==0){
//                 sol(diff,lower,upper,arr,index+1);
//             }
//         }
//     }
// }

class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long sum = 0, maxi = 0, mini = 0;
        for (int diff : differences) {
            sum += diff;
            maxi = Math.max(maxi, sum);
            mini = Math.min(mini, sum);
        }
        return (int)Math.max(0, upper - lower - maxi + mini + 1);
    }
}
