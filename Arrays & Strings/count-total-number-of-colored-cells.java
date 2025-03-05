class Solution {
    public long coloredCells(int n) {
    return 1+2l*n*(n-1);
    // long fact = 0;
    // for(int i = 1;i<=n-1;i++)
    //     fact += i;
    // return fact * 4 + 1;
    // long ans = 1l;
    // long count = 4l;
    // while(n>1){
    //     ans += count;
    //     count += 4;
    //     n--;
    // }
    // for(int i = 2 ; i <= n ; i++)
    //     ans += (i-1)*4;
    // return ans;   
    }
}
