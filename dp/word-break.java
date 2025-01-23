class Solution {
    String s;
    List<String> wordDict;
    Map<Integer, Boolean> map;

    public boolean wordBreak(String s, List<String> wordDict) {
    this.s = s;
    this.wordDict = wordDict;
    map = new HashMap<>();
    return solve(0);
       
    }

    public boolean solve(int index){
    if(index == s.length())
        return true;

    for(String word : wordDict){
        if(s.startsWith(word,index)){
            if(map.getOrDefault(index+word.length(),true)){
                if(solve(index+word.length()))
                    return true;
                map.put(index+word.length(),false);
            }
        }
    }
    return false;
    }
}
