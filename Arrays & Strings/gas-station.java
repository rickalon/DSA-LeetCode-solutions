class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0, totalCost = 0;
        for(int i = 0 ; i < n;i++){
            totalCost += cost[i];
            totalGas += gas[i];
        }
        if(totalGas < totalCost){
            return -1;
        }
        int currentGas = 0, start =0;
        for(int i = 0; i<n;i++){
            currentGas += gas[i]-cost[i];
            if(currentGas<0){
                start = i+1;
                currentGas=0;
            }
        }
        return start;
    }
}
