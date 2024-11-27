class Solution {
    //v1
    public static String intToRoman(int num) {
    String M[] = {"", "M", "MM", "MMM"};
    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
    //v2
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        int zeros = 0;
        while(num>0){
            int temp = num % 10;
            str = new StringBuilder(appendium(temp,zeros)+str.toString());
            num /= 10;
            zeros++;
        }
        return str.toString();
    }

    public String appendium(int temp,int zeros){
        StringBuilder str = new StringBuilder();
        char low = 'I';
        char high = 'V';
        char next = 'X';
        if(zeros==1){
            low = 'X';
            high = 'L';
            next = 'C';
        }else if(zeros==2){
            low = 'C';
            high = 'D';
            next = 'M';
        }else if(zeros>2){
            while(temp>0){
                str.append("M");
                temp--;
            }
            return str.toString();
        }
                if(temp==4){
                    str.append(String.valueOf(low)+high);
                }else if(temp==9){
                    str.append(String.valueOf(low)+next);
                }else{
                    if(temp<4){
                        while(temp>0){
                            str.append(String.valueOf(low));
                            temp--;
                        }
                    }else{
                        str.append(String.valueOf(high));
                        while(temp>5){
                            str.append(String.valueOf(low));
                            temp--;
                        }
                    }
                }
                return str.toString();
    }

}
