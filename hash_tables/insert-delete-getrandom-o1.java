class RandomizedSet {
    HashMap<Integer,Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    Random random = new Random();

    public RandomizedSet() {
        super();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int index = map.remove(val);
            if(list.size()-1 == index){
                list.removeLast();
            }else{
                int last = list.getLast();
                list.set(index,last);
                list.removeLast();
                map.put(last,index);
            }
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
