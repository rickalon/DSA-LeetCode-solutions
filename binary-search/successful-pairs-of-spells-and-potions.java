class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
    final int n = spells.length;
    final int m = potions.length;
    int[] pairs = new int[n];
    Arrays.sort(potions);

    for(int i = 0;i<n;i++){
    int left = 0;
    int right = m-1;
    while(left < right)
    {
        int mid = left + (right-left)/2;
        long combo = potions[mid] * (long)spells[i];
        if(combo>=success){
            right=mid;
        }else{
            left = mid+1;
        }
    }
    if((potions[left]*(long)spells[i])>=success){
        pairs[i]=m-left;
    }else{
        pairs[i]=0;
    }
    }

    return pairs;    
    }
}
