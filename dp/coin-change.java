class Solution {
    int[] mem;
    public int coinChange(int[] coins, int amount) {
    if(amount == 0)
        return 0;
    mem = new int[amount+1];
    Arrays.fill(mem,-1);
    mem[0] = 0;
    int ans = back(coins,amount);
    return ans==Integer.MAX_VALUE?-1:ans;
    }

    public int back(int[] coins, int target){
        if(target<0)
            return Integer.MAX_VALUE;
        if(mem[target]!=-1)
            return mem[target];
        int min = Integer.MAX_VALUE;
        for(int coin : coins){
            int res = back(coins,target-coin);
            if(res!=Integer.MAX_VALUE){
                min = Math.min(min,res+1);
            } 
        }

        mem[target]=min;
        return mem[target];
    }
}
