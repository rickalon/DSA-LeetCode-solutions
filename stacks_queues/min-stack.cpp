class MinStack {
public:

    vector<int> bd;
    vector<vector<int>> min;
    int id{0};
    MinStack() {       
    }
    
    void push(int val) {
    bd.push_back(val);
    if(min.empty() || val < min.back().front()){
        min.push_back(vector<int>{val,id});
    }
    id++;   
    }
    
    void pop() {
    if(min.back().back() == id-1 && id != 0)
        min.pop_back();
    bd.pop_back();
    id--;   
    }
    
    int top() {
    return bd.back();     
    }
    
    int getMin() {
    return min.back().front();  
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */
