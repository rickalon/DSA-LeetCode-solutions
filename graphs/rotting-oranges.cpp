class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) {
     int m = grid.size(), n = grid[0].size();
        queue<pair<int, int>> q;
        int freshCount = 0, minutes = 0;

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 2) {
                    q.push({i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        vector<pair<int, int>> directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!q.empty() && freshCount > 0) {
            int qSize = q.size();
            for (int i = 0; i < qSize; ++i) {
                auto [x, y] = q.front();
                q.pop();
                    for (auto [dx, dy] : directions) {
                    int newX = x + dx;
                    int newY = y + dy;
                                        if (newX >= 0 && newX < m && newY >= 0 && newY < n && grid[newX][newY] == 1) {
                        grid[newX][newY] = 2; 
                        freshCount--;          
                        q.push({newX, newY});   
                    }
                }
            }
            minutes++;  
        }
        return freshCount == 0 ? minutes : -1;
    }
};
