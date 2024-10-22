class Solution {
    public String reverseWords(String s) {
    String str = "";
    int indexStart = 0;
    String word = "";
    for(int i = 0 ; i < s.length() ; i ++)
    {
        if(s.charAt(i)==' '){
            if(indexStart == i && word.length()!=0){
                str = word + " " + str;
                word = "";
            }
            if(i+1 < s.length() && s.charAt(i+1)!=' '){
                indexStart = i+1;
            }
        }else{
            indexStart++;
            word += s.charAt(i);
        }

        if(indexStart == s.length()){
            str = word + " " + str;
        }
    }

    return str.substring(0,str.length()-1);
    }
}
