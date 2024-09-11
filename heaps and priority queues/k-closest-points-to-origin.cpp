class Solution {
struct Cord{
    double distance;
    vector<int> points;

    bool operator<(const Cord& other) const {
        return distance > other.distance;  
    }
};
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {

    priority_queue<Cord> minHeap;
    for(int iii=0;iii<points.size();iii++){
        int x = points[iii][0];
        int y = points[iii][1];
        minHeap.push(Cord {sqrt(pow(x,2)+pow(y,2)),points[iii]});
    }
    vector<vector<int>> result;
    for(int iii=0;iii<k;iii++){
        result.push_back(minHeap.top().points);
        minHeap.pop();    
    }
    return result;

    }
};
