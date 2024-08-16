class Solution {
public:
    bool isValid(string s) {
    stack<char> st;
    bool sol {false};

    for(int iii=0;iii<s.size();iii++){
    char c {s[iii]};
    if(c == '(' || c == '{' || c == '['){
        st.push(c);
    }else if(c == ')'){
        if(!st.empty() && st.top()=='('){
            st.pop();
        }else{
           return false;
        }
    }else if(c == '}'){
        if(!st.empty() && st.top()=='{'){
            st.pop();
        }else{
            return false;
        }
    }else if(c == ']'){
        if(!st.empty() && st.top()=='['){
            st.pop();
        }else{
            return false;
            }
        }
    }
    if(st.empty())
        sol = true;
    return sol;
    }
};
