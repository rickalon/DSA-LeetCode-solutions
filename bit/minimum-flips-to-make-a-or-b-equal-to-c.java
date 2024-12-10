class Solution {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        while(!(a==0 && b==0 && c==0)){
        int ra = a & 1;
        int rb = b & 1;
        int rc = c & 1;
        int sum = ra + rb;
        if(rc==1){
            if(sum==0){
                flips++;
            }
        }else{
            flips += sum;
        }
        a >>= 1;
        b >>= 1;
        c >>= 1;
        }
        return flips;
    }
}
