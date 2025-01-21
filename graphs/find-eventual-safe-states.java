class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
    int v = graph.length;
    boolean[] visited = new boolean[v];
    boolean[] res = new boolean[v];
    List<Integer> ans = new ArrayList<>();
    for(int i = 0 ; i < v ; i++){
        if(!visited[i])
            dfs(visited,res,graph,v,i);
    }
    for(int i = 0 ; i < res.length;i++){
        if(!res[i])
            ans.add(i);
    }
    return ans;
    }

    public boolean dfs(boolean[] visited,boolean[] res, int[][] graph, int v, int n){
        visited[n] = true;
        res[n]=true;
        for(int num : graph[n]){
            if(!visited[num] && dfs(visited,res,graph,v,num)){
                return true;
            }else if(res[num]){
                return true;
            }
        }
        res[n]=false;
        return false;
    }
}
