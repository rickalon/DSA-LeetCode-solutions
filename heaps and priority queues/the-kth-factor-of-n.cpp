class Solution {
public:
    int kthFactor(int n, int k) {

    priority_queue<int,vector<int>, greater<int>> minHeap; 
    for(int iii=1;iii<=n;iii++){
        int aux = n/iii;
        if(n%aux==0)
            minHeap.push(aux);
    }
    while(!minHeap.empty()){
    int aux = minHeap.top();
    if(k==1){
        return aux;
    }
    minHeap.pop();
    while(!minHeap.empty() && minHeap.top()==aux){
        minHeap.pop();
    }
    k--;
    }
    return -1;
    }
};
