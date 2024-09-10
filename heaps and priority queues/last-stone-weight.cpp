class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
    
    int size = static_cast<int>(stones.size());
    make_heap(stones.begin(),stones.end());
    while(size>=2){
    int x = stones.front();
    pop_heap(stones.begin(),stones.end());
    stones.pop_back();
    int y = stones.front();
    pop_heap(stones.begin(),stones.end());
    stones.pop_back();
    if(!(x<=y)){
        swap(x,y);
    }
        if(x==y){
            size-=2;
        }else{
            y -=x;
            stones.push_back(y);
            make_heap(stones.begin(),stones.end());
            size--;
        }
    }
    if(stones.empty())
        return 0;
    else
        return stones.front();
    }
};
