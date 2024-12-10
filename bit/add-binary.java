class Solution {
    public String addBinary(String a, String b) {
        int n = Math.max(a.length(),b.length())-1;
        int i = a.length()-1;
        int j = b.length()-1;
        int rest = 0;
        StringBuilder str = new StringBuilder();
        while(n>=0){
        int sum = rest;
        if(i>=0){
            sum += a.charAt(i--)-'0';
        }

        if(j>=0){
            sum += b.charAt(j--)-'0';
        }

        rest = (sum > 1)?1:0;
        n--;
        str.append(sum%2);
        }
        if(rest !=0){
            str.append(rest);
        }
        return str.reverse().toString();
    }
}
