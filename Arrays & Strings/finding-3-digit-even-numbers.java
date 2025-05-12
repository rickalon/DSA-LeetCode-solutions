class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];
        List<Integer> list = new LinkedList<>();
        for(int num : digits) freq[num]++;
        for(int i = 1 ; i < 10 ; i++){
            if(freq[i]==0) continue;
            freq[i]--;
            for(int j = 0 ; j < 10 ; j++){
                if(freq[j]==0) continue;
                freq[j]--;
                for(int z = 0 ; z < 9; z+=2){
                    if(freq[z]==0) continue;
                        list.add(i*100 + j*10 + z);
                }
                freq[j]++;
            }
            freq[i]++;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
