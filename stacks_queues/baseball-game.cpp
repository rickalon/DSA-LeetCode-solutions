class Solution {
public:
    int calPoints(vector<string>& operations) {
    int sol {0};
    stack<int> st;
    for(int iii=0;iii<operations.size();iii++){
    char c {operations[iii][0]};
    if(c == '+'){
        int i {st.top()};
        st.pop();
        int k {st.top()};
        st.pop();
        st.push(k);
        st.push(i);
        st.push(i+k);
    }else if(c == 'D'){
        int i {st.top()};
        st.push(i*2);
    }else if(c == 'C'){
        st.pop();
    }else{
        st.push(stoi(operations[iii]));
    }
    }

    while(st.empty() != true){
        sol += st.top();
        st.pop();
    }
    return sol;    
    }
};
