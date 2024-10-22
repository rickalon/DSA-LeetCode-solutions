class Solution {
    public int lengthOfLastWord(String s) {
        
    int left = 0;
    int sum = 0;
    for(int i = s.length()-1; i >=0; i--){
        if(s.charAt(i)==' ' && sum !=0){
            break;
        }else if(s.charAt(i)!=' '){
            sum++;
        }
    }
    return sum;
    }
}
