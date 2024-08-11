class Solution {
public:
    int romanToInt(string s) {
    int result {0};
    int size = s.size();
    for(int iii=0;iii<s.size();++iii)
    {
    if(s[iii] == 'I' && iii+1 < size && s[iii+1]=='V')
    {
        result += 4;
        iii++;
    }
    else if(s[iii] == 'I' && iii+1 < size && s[iii+1]=='X')
    {
        result += 9;
        iii++;
    }
    else if(s[iii] == 'X' && iii+1 < size && s[iii+1]=='L')
    {
        result += 40;
        iii++;
    }
    else if(s[iii] == 'X' && iii+1 < size && s[iii+1]=='C')
    {
        result += 90;
        iii++;
    }
    else if(s[iii] == 'C' && iii+1 < size && s[iii+1]=='D')
    {
        result += 400;
        iii++;
    }
    else if(s[iii] == 'C' && iii+1 < size && s[iii+1]=='M')
    {
        result += 900;
        iii++;
    }
    else{
        switch(s[iii]){
            case 'I':
            result += 1;
            break;
            case 'V':
            result += 5;
            break;
            case 'X':
            result +=10;
            break;
            case 'L':
            result += 50;
            break;
            case 'C':
            result += 100;
            break;
            case 'D':
            result +=500;
            break;
            case 'M':
            result += 1000;
            break;
        }
    }
    }
    return result;
    }

};
