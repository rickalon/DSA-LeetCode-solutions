class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int hold = -prices[0]; 
        int cash = 0;          
        
        for (int i = 1; i < n; i++) {
            hold = Math.max(hold, cash - prices[i]);
            cash = Math.max(cash, hold + prices[i] - fee);
        }
        
        return cash;
    }

    public int solve(int[] prices, int fee, int index,int[] mem){
        if(index==prices.length)
            return 0;
        if(mem[index]!=-1)
            return mem[index];
        int val = 0;
        for(int i = index + 1 ; i < prices.length;i++){
            int aux = prices[i]-prices[index]-fee;
            if(aux>0)
                aux+= solve(prices,fee,i+1,mem); 
            else
                aux = solve(prices,fee,i,mem);
            
            val = Math.max(aux,val);
        }
        mem[index] = val;
        return val;

    }
}
