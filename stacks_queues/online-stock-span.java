class StockSpanner {

    ArrayList<Integer> memory = new ArrayList<>();
    public StockSpanner() {
    }
    
    public int next(int price) {
    int days = 1;
    for(int i = memory.size()-1; i >=0 ; i--)
    {
        if(memory.get(i)<=price){
            days++;
        }else{
            break;
        }
    }
    memory.add(price);
    return days;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
