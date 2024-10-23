class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int prev = 0;
    for(int i = 0 ; i < flowerbed.length ; i++){
    if(flowerbed[i]==0 && prev==0 && i < flowerbed.length-1 && flowerbed[i+1]==0){
        n--;
        flowerbed[i]=1;
    }else if(i==flowerbed.length-1 && flowerbed[i]==0 && prev==0){
        n--;
        flowerbed[i]=1;
    }
    prev = flowerbed[i];

    }
    return n<=0?true:false;
    }
}
