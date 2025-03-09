class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int count = 0;
        int n = colors.length;
        int i = 0;
        int end = n+k-1;
        while(i<n){
            int prev = i % n;
            int current = (i + 1) % n;
            int aux = 1;
            i++;
            while(i < end && colors[prev]!=colors[current]){
                prev = current;
                current = (prev+1) % n;
                i++;
                aux++;
            }
            if(aux>=k)
                count += 1 + aux-k;
        }
        return count;
    }
}
