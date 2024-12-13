class Solution {
    public String decodeString(String s) {
        int[] index = {0};
        return decodeStringV(s,index);
    }

    public String decodeStringV(String s,int[] index) {
        String str = "";
        int times = 0;
        for(; index[0]< s.length();index[0]++)
        {
            char c = s.charAt(index[0]);
            if(c == '['){
                index[0]++;
                String aux = decodeStringV(s,index);
                for(int j = 0 ; j < times ; j++)
                {
                    str += aux;
                }
            }else if(c==']'){
                return str;
            }else if(Character.isDigit(c)){
                int start = index[0];
                while(Character.isDigit(s.charAt(index[0]+1))){
                    index[0]++;
                }
                times = Integer.valueOf(s.substring(start,index[0]+1));
            }else{
                str += c;
            }
        }
        return str;
    }
}


class Solution {
    public String decodeString(String s) {
        int[] index = {0};
        return decodeStringV(s,index);
    }

    public String decodeStringV(String s,int[] index) {
        StringBuilder str = new StringBuilder();
        int times = 0;
        for(; index[0]< s.length();index[0]++)
        {
            char c = s.charAt(index[0]);
            if(c == '['){
                index[0]++;
                StringBuilder aux = new StringBuilder(decodeStringV(s,index));
                for(int j = 0 ; j < times ; j++)
                {
                    str.append(aux);
                }
            }else if(c==']'){
                return str.toString();
            }else if(Character.isDigit(c)){
                int start = index[0];
                while(Character.isDigit(s.charAt(index[0]+1))){
                    index[0]++;
                }
                times = Integer.valueOf(s.substring(start,index[0]+1));
            }else{
                str.append(c);
            }
        }
        return str.toString();
    }
}
