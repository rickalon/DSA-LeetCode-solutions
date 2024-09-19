class Solution {
public:
    bool validPath(int n, vector<vector<int>>& edges, int source, int destination) {
    if(edges.empty())return true;
    if(source==destination)return true;

    unordered_map<int, vector<int>> graph;
    for (const auto& edge : edges) {
            graph[edge[0]].push_back(edge[1]);
            graph[edge[1]].push_back(edge[0]);
    }

    unordered_set<int> seen;
    queue<int> queue;
    
    queue.push(source);
    seen.insert(source);

    while (!queue.empty()) {
        int node = queue.front();
        queue.pop();
        if (node == destination) return true;
            for (int neighbor : graph[node]) {
                if (seen.find(neighbor) == seen.end()) {
                    seen.insert(neighbor);
                    queue.push(neighbor);
                }
            }
        }
        return false;   
    }
};
