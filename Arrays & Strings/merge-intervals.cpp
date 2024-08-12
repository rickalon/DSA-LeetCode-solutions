class Solution {
public:
    static bool compare(vector<int> i1, vector<int> i2) 
    { 
        return i1[0] < i2[0]; 
    } 
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
    vector<vector<int>> result;
    const auto size {intervals.size()};
    sort(intervals.begin(), intervals.end(), compare); 
    int iii{0};
    
    while(iii<size){
    int front {intervals[iii][0]};
    int end {intervals[iii][1]};
        while(iii<size-1 && end >= intervals[iii+1][0]){
            if(intervals[iii+1][0]<front){
                front = intervals[iii+1][0];
            }
            if(intervals[iii+1][1]>end){
                end = intervals[iii+1][1];
            }
            iii++;
        }
        result.push_back(vector<int> {front,end});
        iii++;
    }
    return result;
    }
};
