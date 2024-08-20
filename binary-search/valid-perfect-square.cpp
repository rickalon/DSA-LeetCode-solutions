class Solution {
public:
    bool isPerfectSquare(int num) {

    long l {1},r{num};

    while(l<=r){
        long m = l + (r-l)/2;
        long target = m * m;
        if(target == num){
            return true;
        }
        else if(target<num){
            l=m+1;
        }else{
            r = m-1;
        }
    }
    return false;
    }
