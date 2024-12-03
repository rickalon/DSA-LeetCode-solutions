class Solution {
    public int mySqrt(int x) {
    x = Math.abs(x);
    long num = 1;
    long root = 0;
    while(root<x){
        root=num*num;
        num++;
    }
    if(root==x){
        return (int)num-1;
    }
    return (int)num-2;    
    }
}
