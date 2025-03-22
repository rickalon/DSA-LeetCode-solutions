class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
    int ans = 0;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n);
    for(int i = 0 ; i < n ; i++){
        adj.add(new ArrayList<>());
    }
    for(int[] node : edges){
    int from = node[0];
    int to = node[1];
    adj.get(from).add(to);
    adj.get(to).add(from);
    }
    Set<Integer> auxSet = new HashSet<>();
    Set<Integer> set = new HashSet<>();
    Stack<Integer> stack = new Stack<>();
    for(int i = 0 ; i < n ; i++){
        if(!auxSet.contains(i)){
            set = new HashSet<>();
            stack = new Stack<>();
            set.add(i);
            for(Integer node : adj.get(i)){
                set.add(node);
                stack.push(node);
            }
            boolean exit = false;
            while(!stack.isEmpty()){
                int node = stack.pop();
                if(adj.get(node).size()+1 != set.size()){
                    exit = true;
                    break;
                }
                for(Integer no : adj.get(node)){
                    if(!set.contains(no)){
                        exit = true;
                        break;
                    }
                }
                if(exit){
                    break;
                }
            }
        if(!exit){
            ans++;
            for(Integer a : set){
                auxSet.add(a);
            }
            }
        }
    }
    return ans;
    
    }
}
