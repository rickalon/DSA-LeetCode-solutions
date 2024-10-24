class Solution {

    public int maxVowels(String s, int k) {
    HashSet<Character> hs = new HashSet<>(Arrays.asList('a','e','i','o','u'));
    int vowelsTimes = 0;
    for(int i = 0 ; i < k;i++){
        if(hs.contains(s.charAt(i))){
            vowelsTimes++;
        }
    }
    int vowelsMax = vowelsTimes;
    for(int i = k; i < s.length();i++){
        if(hs.contains(s.charAt(i-k))){
            vowelsTimes--;
        }
        if(hs.contains(s.charAt(i))){
            vowelsTimes++;
        }
        vowelsMax = Math.max(vowelsMax,vowelsTimes);
    }

    return vowelsMax;
    }
}
