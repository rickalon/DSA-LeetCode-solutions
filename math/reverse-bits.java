public class Solution {
    // you need treat n as an unsigned value
    int sol = 0;
    public int reverseBits(int n) {
    for(int i = 0 ; i < 32;i++){
        sol <<=1;
        sol |= n&1;
        n >>= 1;
    } 
    return sol;   
    }
}
