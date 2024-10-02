class Solution {
public:
    vector<string> findRepeatedDnaSequences(string s) {
    int left=-1;
    int right=0;
    vector<string> sol;
    set<string> sAux;
    string aux;
    while(right < s.size()){
    if(aux.size()<9){
        aux += s[right];
        right++;
    }else{
    left++;
    aux =  s.substr(left,9);
    aux += s[right];
    if(sAux.count(aux)==1){
        bool v=true;
        for(int i = 0; i<sol.size();i++){
            if(aux==sol[i]){
                v=false;
            }
        }
        if(v) sol.push_back(aux);
    }else{
        sAux.insert(aux);
    }
    right++;
    }
    }

    
    return sol;
    }
};
