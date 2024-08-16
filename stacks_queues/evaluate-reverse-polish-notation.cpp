class Solution {
public:
    int evalRPN(vector<string>& tokens) {
    stack<int> st;
    for(int iii=0;iii<tokens.size();iii++){
    string c {tokens[iii]};
    if(c == "+" || c == "-" || c == "*" || c == "/"){      
    int i = st.top(); st.pop();
    int j = st.top(); st.pop();
    if(c == "*")
        st.push(i*j);   
    else if(c == "/")
        st.push(j/i);
    else if(c== "-")
        st.push(j-i);
    else if(c=="+")
        st.push(i+j);
    }else{
        st.push(stoi(tokens[iii]));
    }
    }
    return st.empty()?0:st.top();  
    }
};
