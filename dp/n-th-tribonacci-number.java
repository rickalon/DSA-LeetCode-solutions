class Solution {
    public int tribonacci(int n) {
    //bottom up
    if(n==0)
        return 0;
    if(n==1)
        return 1;
    if(n==2)
        return 1;
    int[] mem = new int[n+1];
    mem[0]= 0;
    mem[1]= 1;
    mem[2]= 1;
    for(int i = 3; i <= n ;i++){
        mem[i] = mem[i-1] + mem[i-2] + mem[i-3];
    }  
    return mem[n];
    //top-down
    // return tric(n,new int[n+1]);
    }
    // public int tric(int n, int[] mem){
    //     if(n==0)
    //         return 0;
    //     else if(n==1)
    //         return 1;
    //     else if(n==2)
    //         return 1;
    //     mem[n] = tric(n-1,mem) + tric(n-2,mem) + tric(n-3,mem);
    //     return mem[n];
    // }
}
