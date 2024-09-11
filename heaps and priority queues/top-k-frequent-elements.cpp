class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
    priority_queue<vector<int>> heap;
    sort(nums.begin(),nums.end());
    int jjj=0;
    for(int iii = 0;iii<nums.size();iii++){
    jjj++;
    if(!(iii+1<nums.size() && nums[iii]==nums[iii+1])){        
        heap.push({jjj,nums[iii]});
        jjj=0;
        }
    }
    vector<int> aux;
    for(int iii=0;iii<k;iii++){
        aux.push_back(heap.top()[1]);
        heap.pop();
    }
    return aux;  
    }
};
