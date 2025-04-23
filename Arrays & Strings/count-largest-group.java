class Solution {
    public int countLargestGroup(int n) {
    int size = 37;
    int[] arr = new int[size];
    int max = 0;
    for(int i = 1 ; i <= n ; i++)
    {
        int aux = i;
        int sum = 0;
        while(aux>0){
            sum += aux%10;
            aux/=10;
        }
    arr[sum]++;
    max = Math.max(max,arr[sum]);
    }
    int ans = 0;
    for(int a : arr){
        if(a==max)
            ans++;
    }
    return ans;
    }
}
