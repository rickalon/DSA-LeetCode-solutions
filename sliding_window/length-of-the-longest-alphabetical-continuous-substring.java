class Solution {
    public int longestContinuousSubstring(String s) {
    String alpha = "abcdefghijklmnopqrstuvwxyz";

    int left=0;
    int right=0;
    for(int i = 1; i < s.length();i++){
        if(s.charAt(i)==(s.charAt(right)+1)){
            right++;
        }else{
            break;
        }
    }
    int sol = right-left+1;
    right++;
    while(right < s.length()){
        if(s.charAt(right)!=(s.charAt(right-1)+1)){
            left = right;
        }
    sol = Math.max(sol,(right-left+1));
    right++;
    }
    return sol;    
    }
}
