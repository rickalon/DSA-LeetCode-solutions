class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            while(set.contains(current)){
                set.remove(s.charAt(i-set.size()));    
            }
            set.add(current);
            max = Math.max(max,set.size());
        }
        return max;
    }
}
