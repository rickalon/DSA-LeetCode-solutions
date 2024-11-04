class Solution {
    public boolean isHappy(int n) {
    HashSet<Integer> contains = new HashSet<>();
    while(n!=1)
    {
        String str = String.valueOf(n);
        n = 0;
        for(char c : str.toCharArray())
        {   
            int num = c - '0';
            n+=(num*num);
        }
        if(contains.contains(n)){
            return false;
        }
        contains.add(n);
    }
    return true;   
    }
}
