class Solution {
    public int largestAltitude(int[] gain) {
    int sum = 0;//sum and current element;
    int ans = sum;
    for(int i = 0; i < gain.length;i++)
    {
    gain[i] += sum;
    sum = gain[i];
    ans = Math.max(ans,gain[i]);
    }
    return ans;
    }
}
