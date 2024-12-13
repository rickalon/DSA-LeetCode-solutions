class Solution {
    public String predictPartyVictory(String senate) {
    Queue<Integer> dire = new LinkedList<>();
    Queue<Integer> radiant = new LinkedList<>();
    int n = senate.length();
    for(int i = 0 ; i < senate.length(); i++)
    {
        if(senate.charAt(i)=='R'){
            radiant.offer(i);
        }else{
            dire.offer(i);
        }
    }

    while(!(dire.isEmpty() || radiant.isEmpty())){
        if(radiant.peek() < dire.peek()){
            radiant.offer(n++);
        }else{
            dire.offer(n++);
        }
            dire.poll();
            radiant.poll();
    }
    return (radiant.isEmpty())?"Dire":"Radiant";    
    }
}
