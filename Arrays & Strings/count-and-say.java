class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }else{
            String str = countAndSay(n-1);
            StringBuilder num = new StringBuilder();
            char[] arr = str.toCharArray();
            int i = 0;
            char c = arr[0];
            int times = 0;
            while(i < arr.length){
                    if(c!=arr[i]){
                        num.append(times);
                        num.append(c);
                        times = 1;
                        c = arr[i];
                    }else{
                        times++;
                    }
                    if(i==arr.length-1){
                        num.append(times);
                        num.append(c);
                    }
                    i++;
                    
            }
            return num.toString();

        }
    }
}
