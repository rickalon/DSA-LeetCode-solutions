class Solution {
    public int[] closestPrimes(int left, int right) {
    boolean[] sieve = new boolean[right + 1];
    Arrays.fill(sieve, true);
    sieve[0] = sieve[1] = false;    
    for (int i = 2; i * i <= right; i++) {
        if (sieve[i]) {
                for (int j = i * i; j <= right; j += i) {
                    sieve[j] = false;
                }
        }
    }
        
    List<Integer> list = new ArrayList<>();
    for (int i = left; i <= right; i++) {
        if (sieve[i]) {
                list.add(i);
        }
    }
    int min = Integer.MAX_VALUE;
    int n1=-1,n2=-1;
    for(int i = list.size()-1 ; i > 0;i--){
    int num1 = list.get(i-1);
    int num2 = list.get(i);
    if(num2-num1+1 <= min){
        n1 = num1;n2 = num2;
        min = num2-num1+1;
    }
    }
    return new int[]{n1,n2};
    }

    public boolean isPrime(int num){
        if(num==2 || num == 3)
            return true;
        else if(num==1 || (num%2==0 || num%3==0))
            return false;
        for(int i = 5 ; i * i <= num ; i+=2){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
