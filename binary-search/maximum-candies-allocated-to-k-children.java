class Solution {
    public int maximumCandies(int[] candies, long k) {
    int left = 0;
    int right = 10_000_000;
    while(left < right){
        int mid = left + (right-left)/2 + 1;
        long sum = 0;
        for(int candie : candies)
            sum += candie/mid;
        if(k > sum)
            right = mid -1;
        else
            left = mid;
    }
    return left;
    }
}
