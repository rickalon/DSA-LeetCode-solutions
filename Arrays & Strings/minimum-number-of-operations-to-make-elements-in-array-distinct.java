class Solution {
    public int minimumOperations(int[] num) {
    int op = 0;
    int[] arr = new int[101];
    for(int j = 0,i=0; i < num.length; i+=3){
        ++arr[num[i]];
        if(i+1 < num.length)
            ++arr[num[i+1]];
        if(i+2 < num.length)
            ++arr[num[i+2]];
        while((arr[num[i]] >1 || (i+1 < num.length && arr[num[i+1]]>1) || (i+2 < num.length && arr[num[i+2]]>1)) && j <= i){
            arr[num[j]]--;
            if(j+1 < num.length)
                arr[num[j+1]]--;
            if(j+2 < num.length)
                arr[num[j+2]]--;
            j += 3;
            op++;
        }
    }
    return op;
    }
}
