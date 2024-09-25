class Solution {
public:
    bool canFinish(int numCourses, vector<vector<int>>& prerequisites) {
    int m = (int)prerequisites.size();
    unordered_map<int,vector<int>> map;
       for(int i=0;i<m;i++){
            map[prerequisites[i][0]].push_back(prerequisites[i][1]);  
    }
    vector<int> states(numCourses, 0);

    for (int i = 0; i < numCourses; i++) {
        if (!dfs(i, map, states)) {
            return false;
            }
         }
        return true;
    }

private:
bool dfs(int node, unordered_map<int, vector<int>>& graph, vector<int>& states) {
        if (states[node] == 1) return false; 
        if (states[node] == 2) return true; 

        states[node] = 1; 

        for (int neighbor : graph[node]) {
            if (!dfs(neighbor, graph, states)) {
                return false;
            }
        }
        states[node] = 2; 
        return true;
    }
  
};
