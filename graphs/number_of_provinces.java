class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adjList = new LinkedList<>();
        for(int[] node: isConnected){
        List<Integer> list = new LinkedList<>();
            for(int i = 0 ; i < node.length;i++){
            if(node[i]==1 && i!= adjList.size()){
                    list.add(i);
                }
            }
            adjList.add(list);
        }
    HashSet<Integer> set = new HashSet<>();
    int prov = 0;
    Stack<Integer> stack = new Stack<>();
    for(int i = 0 ; i < isConnected.length;i++){
        if(!set.contains(i)){
            stack.add(i);
            while(!stack.isEmpty()){
            int val = stack.pop();
            set.add(val);
            for(int num : adjList.get(val))
            {   
                if(!set.contains(num))
                    stack.add(num);
            }
            }
        prov++;
        }
    }
    
    return prov;
    }
}
