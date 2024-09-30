class Solution {
public:
    string convert(string s, int numRows) {
    if(numRows==1) return s;
    string sol;
    int numRow = 0;
    int index = 0;
    for(int x = 0; x<numRows;x++){
    index = 0;numRow=0;
    while(index != s.size()){
    while(numRow < numRows && index != s.size()){
        if(x==numRow){
        sol += s.substr(index,1);
        }
        numRow++;
        index++;
    } 
    numRow-=2;
    while(numRow>0 && index != s.size()){
        if(x==numRow){
            sol += s.substr(index,1);
        }
        numRow--;
        index++;
    }
    }
    }

    return sol;

    }
};
