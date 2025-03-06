class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
    int n = str1.length()+1;
    int m = str2.length()+1;
    int[][] lcs = new int[n][m];
    for(int i = 1 ; i < n; i++){
        for(int j = 1 ; j < m;j++){
            char c1 = str1.charAt(i-1);
            char c2 = str2.charAt(j-1);
            if(c1==c2){
                lcs[i][j]=lcs[i-1][j-1]+1;
            }else{
                lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
            }
        }
    }
    StringBuilder str = new StringBuilder();
    int i = str1.length();
    int j = str2.length();
    while(i>0 && j>0){
        if(str1.charAt(i-1)==str2.charAt(j-1)){
            str.append(str1.charAt(i-1));
            i--;j--;
        }else if(lcs[i-1][j] > lcs[i][j-1]){
            str.append(str1.charAt(i-1));
            i--;
        }else{
            str.append(str2.charAt(j-1));
            j--;
        }
    }

    while(i>0){
            str.append(str1.charAt(i-1));
            i--;
   }

   while(j>0){
        str.append(str2.charAt(j-1));
        j--;
    }

    return str.reverse().toString();
    }
}
