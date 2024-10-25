class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    int[] resultDays = new int[temperatures.length];
    Stack<Integer> temp = new Stack<Integer>();

    for(int i = 0 ; i < temperatures.length ; i ++ )
    {
        while(!temp.isEmpty() && temperatures[i] >  temperatures[temp.peek()]){
        int index = temp.pop();
        resultDays[index] = i - index;
        }
        temp.push(i);
    }   

    return resultDays;
    }
}
