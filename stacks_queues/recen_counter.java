class RecentCounter {
    final private Queue<Integer> mem = new LinkedList<>();
    public RecentCounter() {}
    
    public int ping(int t) {
    int ans = 1;
    int target = Math.max(t - 3000,0);
    while(!mem.isEmpty() && mem.peek() < target)
    {
        mem.poll();
    }
    mem.offer(t);
    return mem.size();   
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
