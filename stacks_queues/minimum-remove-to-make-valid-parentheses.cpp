class Solution {
public:
    string minRemoveToMakeValid(string s) {
    stack<pair<char,int>> rightBracket;
    stack<pair<char,int>> leftBracket;
    for(int i = 0 ; i < s.size();i++){
        if(s[i]=='('){
            rightBracket.push({'(',i});
        }else if(s[i]==')' && !rightBracket.empty() && rightBracket.top().first=='('){
            rightBracket.pop();
        }else if(s[i]==')' && rightBracket.empty()){
            leftBracket.push({')',i});
        }
    }
    while(!rightBracket.empty()){
        int pos = rightBracket.top().second;
        s = s.substr(0,pos) +' '+ s.substr(pos+1,s.size()-pos+1);
        rightBracket.pop();
    }

    while(!leftBracket.empty()){
        int pos = leftBracket.top().second;
        s = s.substr(0,pos) +' '+ s.substr(pos+1,s.size()-pos+1);
        leftBracket.pop();
    }

    int i =0;
    while(i<s.size()){
        if(s[i]==' '){
            s = s.substr(0,i) + s.substr(i+1,s.size()-i+1);
        }else{
            i++;
        }
    }
    return s;    
    }
};
