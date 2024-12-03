class Solution {
    public boolean isPalindrome(int x) {
    String str = String.valueOf(x);
    int left = 0;
    int right = str.length()-1;
    while(left < right){
        if(str.charAt(left)==str.charAt(right)){
            right--;left++;
        }else{
            return false;
        }
    }
    return true;    
    }
  public boolean isPalindrome(int x) {
    int[] num = new int[20];
    if(x<0){
        return false;
    }
    int start =0;
    while(x>0){
        int val = x % 10;
        x /= 10;
        num[start++] = val;
    }
    int left = 0;
    int right = start-1;
    while(left < right){
        if(num[left]==num[right]){
            left++;right--;
        }else{
            return false;
        }
    }
    return true;    
    }
}
