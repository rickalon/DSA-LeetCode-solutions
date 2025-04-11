class Solution {
    public int countSymmetricIntegers(int low, int high) {
    int ans = 0;
    int n = 0;
    int number = low;
    while(number > 0){
        number /= 10;
        n++;
    }

    for(int i = low ; i <= high ; i++){
        if(i >=Math.pow(10,n))
            n++;
        if(n%2!=0)
            continue;
        number = i;
        int fSum = 0;
        int sSum = 0;
        for(int x = 0; x < n/2;x++){
            fSum += number%10;
            number /= 10;
        }
        for(int x = 0; x < n/2;x++){
            sSum += number%10;
            number /= 10;
        }
        if(fSum == sSum)
            ans++;
    }

    return ans;         
    }
}
