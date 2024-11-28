class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int startIndex = 0;
        int count = words[0].length();
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for(int i = 1 ; i < words.length;i++)
        {
            if(count+words[i].length() <= maxWidth-(i-startIndex)){
                count += words[i].length();
            }else{
                int countSpaces = maxWidth-count;
                int spaces = i-startIndex-1;
                if(spaces==0)spaces++;
                int even = countSpaces / spaces;
                int extra = countSpaces % spaces;
                str = new StringBuilder();
                for(int j = startIndex; j < i; j++){
                    str.append(words[j]);
                    if(j<i-1 || (i-startIndex-1==0)){
                        for(int z = 0;z<even;z++){
                            str.append(" ");
                        }
                        if(extra>0){
                            str.append(" ");
                            extra--;
                        }
                    }
                }
                startIndex = i;
                count = words[i].length();
                list.add(str.toString());
            }
        }
        str = new StringBuilder();
        for(int j = startIndex; j < words.length; j++){
            if(j <words.length-1){
            str.append(words[j] +" ");
            }else{
               str.append(words[j]);

            }
        }
        for(int j = str.length() ; j < maxWidth;j++){
            str.append(" ");
        }
        list.add(str.toString());

        return list;
    }
}
