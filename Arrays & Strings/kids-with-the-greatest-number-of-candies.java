class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = Integer.MIN_VALUE;
    for(int num : candies)
    {
        max = Math.max(num,max);
    }
    List<Boolean> output = new LinkedList<>();

    for(int i = 0 ; i < candies.length; i ++)
    {
        if(extraCandies + candies[i] >= max){
            output.add(true);
        }else{
            output.add(false);
        }
    }
        
    return output;
    }
}
