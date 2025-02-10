class NumberContainers {
    Map<Integer,Integer> kv;
    Map<Integer,TreeSet<Integer>> map;
    public NumberContainers() {
        kv = new HashMap<>();
        map = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(kv.get(index)==null){
            kv.put(index,number);
        }else{
            int num = kv.get(index);
            map.get(num).remove(index);
            kv.put(index,number);
        }
        if(map.get(number)==null)
            map.put(number,new TreeSet<Integer>());
        map.get(number).add(index);
    }
    
    public int find(int number) {
        if(map.get(number)==null || map.get(number).size()==0)
            return -1;
        return map.get(number).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
