class Solution {
    public int rangeBitwiseAnd(int left, int right) {
    int res = right-1;
    while(right>left){
        right = right & res;
        res = right-1;
    }
    return right;
    }
}
