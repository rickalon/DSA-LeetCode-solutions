class Solution {
    public String reverseVowels(String s) {
    if(s.length()==1){
        return s;
    }
    int left = 0;
    int right = s.length()-1;
    char[] stream = new char[s.length()];
    for(int i = 0 ; i < stream.length;i++){
        stream[i] = s.charAt(i); 
    }
    while(left < right){
        Character cl = s.charAt(left);
        Character cr = s.charAt(right);
    if(isVowel(cl) && isVowel(cr)){
    stream[left] = cr;
    stream[right] = cl;
    left++;
    right--;
    }else if(isVowel(cl)){
    right--;
    }else if(isVowel(cr)){
    left++;
    }else{
    left++;
    right--;
    }
    }

    StringBuilder str = new StringBuilder();
    for(char c : stream){
        str.append(c);
    }
    return str.toString();   
    }


    public boolean isVowel(Character c)
    {
        switch(c.toLowerCase(c))
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            return true;
            default:
            return false;
        }
    }
}
