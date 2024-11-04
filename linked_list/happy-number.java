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
//Floyd optimization, constant space
class Solution {
    public boolean isHappy(int n) {
    int slow = n;
    int fast = n;
    boolean prim = true;
    while(slow!=fast || prim)
    {
        prim = false;

        slow = square(slow);
        
        fast = square(fast);
        fast = square(fast);
        
        if(slow == 1 || fast ==1){
            return true;
        }
    }
    return false;   
    }

    public int square(int n)
    {
        int sum = 0;
        while(n > 0){
        int aux = n % 10;
        sum+= aux*aux;
        n /= 10;
        }
        return sum;
    }
}

