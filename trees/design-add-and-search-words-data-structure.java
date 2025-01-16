class WordDictionary {
    Map<Character,WordDictionary> mapDic;
    boolean isEnd;
    public WordDictionary() {
        mapDic = new HashMap<>();
        isEnd = false;
    }
    
    public void addWord(String word) {
        WordDictionary auxDic = this;
        for(char c : word.toCharArray()){
            auxDic.mapDic.putIfAbsent(c,new WordDictionary());
            auxDic = auxDic.mapDic.get(c);
        }
        auxDic.isEnd = true;
    }
    
    public boolean search(String word) {
        WordDictionary auxDic = this;
        for(int car = 0 ; car < word.length(); car++){
        char c = word.charAt(car);
            if(c=='.'){
                for(int i=0;i<=26;i++){
                    if(auxDic.mapDic.get((char)(i+'a'))!=null){
                        if(auxDic.mapDic.get((char)(i+'a')).search(word.substring(car+1))){
                            return true;
                        }
                    }
                }
                return false;
            }else{
                if(auxDic.mapDic.get(c)==null){
                    return false;
                }
                auxDic = auxDic.mapDic.get(c);
            }
        }
        return auxDic.isEnd;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
