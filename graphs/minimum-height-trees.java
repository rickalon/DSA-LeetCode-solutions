class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) {
            return List.of(0); 
        }

        List<List<Integer>> adjList = new ArrayList<>();
        int[] degree = new int[n];
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            adjList.get(a).add(b);
            adjList.get(b).add(a);
            degree[a]++;
            degree[b]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                queue.add(i);
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            result = new ArrayList<>(); 
            for (int i = 0; i < size; i++) {
                int node = queue.poll();
                result.add(node);
                for (int neighbor : adjList.get(node)) {
                    degree[neighbor]--;
                    if (degree[neighbor] == 1) {
                        queue.add(neighbor);
                    }
                }
            }
        }

        return result;
    }
}
