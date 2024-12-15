class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] freq = new int[26];
        List<Integer> list = new LinkedList<>();
        int[] set = new int[26];
        for(char c : s.toCharArray())
        {
            freq[c-'a']++;
        }
        int start = 0;
        int end = 0;
        for(char c : s.toCharArray()){
            freq[c-'a']--;
            set[c-'a']=1;
            if(freq[c-'a']==0){
                set[c-'a']=0;
            }
            boolean isEmpty = true;
            for(int ss : set){
                if(ss==1){
                    isEmpty=false;
                    break;
                }
            }
            if(isEmpty){
                list.add(end-start+1);
                start = end+1;            
            }
            end++;
        }
        return list;
    }
}
