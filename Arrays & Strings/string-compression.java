class Solution {
    public int compress(char[] chars) {
    int ans = 0;
    for(int i = 0 ; i < chars.length;)
    {
        char current = chars[i];
        int count = 0;
        while(i < chars.length && current == chars[i]){
        count++;
        i++;
        }
        chars[ans++] = current;
        if(count > 1){
            for(char c : String.valueOf(count).toCharArray())
            {
                chars[ans++]=c;
            }
        }
    }   
    return ans; 
    }
}
