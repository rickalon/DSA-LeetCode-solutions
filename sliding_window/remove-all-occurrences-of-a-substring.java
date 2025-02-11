class Solution {
    public String removeOccurrences(String s, String part) {
    int m = part.length();
    if(m==0)
        return s;
    char[] arr = s.toCharArray();
    int n = s.length();
    boolean change = true;
    int ansLength = n;
    while(change){
    change = false;
    for(int i = 0 ; i < n;){
        int j = 0;
        int start = i;
        int returnPoint = -1;
        while(j < m && i < n && (arr[i]==part.charAt(j) || arr[i]=='.')){
            if(i!= start && arr[i]==part.charAt(0)){
                returnPoint = i;
            }
            if(arr[i]=='.'){
                i++;
            }else{
                j++;
                i++;
            }
        }
        if(j==m){
            for(int z = start ; z < i;z++){
                if(arr[z]!='.'){
                    arr[z]='.';
                    ansLength--;
                }
            }
            change = true;
            break;
        }
        if(start==i){
            i++;
        }else if(returnPoint!=-1){
            i = returnPoint;
        }
        }
    }
    char[] ans = new char[ansLength];
    for(int i = 0, j =0; j<arr.length;j++)
        if(arr[j]!='.')
            ans[i++]=arr[j];
    return new String(ans);    
    }
}
