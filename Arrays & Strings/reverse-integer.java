class Solution {
    public int reverse(int x) {
        StringBuilder str = new StringBuilder();
        boolean isNegative = false;
        
        if(x < 0){
            x = -x;
            isNegative = true;
        }else if(x==0){
            return x;
        }
        while(x > 0){
            int num = x % 10;
            str.append(num);
            x /= 10;
        }
        try{
        if(isNegative){
            return Integer.valueOf("-"+str.toString());
        }
        return Integer.valueOf(str.toString());
        }catch(NumberFormatException e){
            return 0;
        }
    }
}
