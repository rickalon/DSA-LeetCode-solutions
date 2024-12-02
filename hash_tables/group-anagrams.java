class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    if (strs == null || strs.length == 0) return new ArrayList<>();
    List<List<String>> list = new LinkedList<>();
    HashMap<String,Integer> map = new HashMap<>();
    int index = 0;
    for(String str : strs)
    {
        char[] freq = new char[26];
            if(str.length()>0){
                for(char c : str.toCharArray()){
                    freq[c-'a']++;
                }
             }
           String auxStr = new String(freq);
           System.out.println(auxStr.toString());
           if(!map.containsKey(auxStr.toString())){
                map.put(auxStr.toString(),index);
                list.add(new LinkedList<String>(Arrays.asList(str)));
                index++;
           }else{
                list.get(map.get(auxStr.toString())).add(str);
           }
    }
    return list;
    }
}
