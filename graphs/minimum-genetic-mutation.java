class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
    int numMutations = Integer.MAX_VALUE;
    if(startGene.equals(endGene))
        return 0;
    if(bank==null || bank.length==0)
        return -1;
    Queue<Pair<String,Integer>> q = new LinkedList<>();
    Set<String> set = new HashSet<>(); 
    q.offer(new Pair<>(startGene,0));

    while(!q.isEmpty()){
        String str = q.peek().getKey();
        int moves = q.peek().getValue();
        q.poll();
        if(!set.contains(str)){
            set.add(str);
            if(str.equals(endGene)){
                numMutations = Math.min(numMutations,moves);
            }
            for(String s : bank){
                int dif = 0;
                for(int i = 0 ; i < s.length(); i++){
                    if(s.charAt(i)!=str.charAt(i)){
                        dif++;
                    }
                }
                if(dif==1){
                    q.offer(new Pair<>(s,moves+1));
                }
            }
        }
    }
    if(numMutations==Integer.MAX_VALUE)
        return -1;
    return numMutations;  
    }
}
