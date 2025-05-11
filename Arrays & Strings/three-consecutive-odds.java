public class Solution {
    public bool ThreeConsecutiveOdds(int[] arr) {
    int k = 3;
    int n = arr.Length;
    int odds = 0;

    if(n<k){
        return false;
    }

    for(int i = 0 ; i < k; i++){
        if((arr[i] & 1) == 1){
            odds++;
        }
    }
    
    for(int i = k ; i < n; i++){
    if(odds==3){
        return true;
    }
    odds -= ((arr[i-k] & 1) == 1)?1:0;
    odds += ((arr[i] & 1) == 1)?1:0;
    }
    return odds==3?true:false;    
    }
}
