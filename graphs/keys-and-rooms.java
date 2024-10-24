class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    int node = 0;
    HashMap<Integer,List<Integer>> hm = new HashMap<>();

    for(List<Integer> list: rooms){
        hm.put(node,list);
        node++;
    }

    Stack<Integer> stack = new Stack<>();
    for(Integer num:hm.get(0)){
        stack.push(num.intValue());
    }
    HashSet<Integer> traverse = new HashSet<>();
    traverse.add(0);

    while(!stack.isEmpty()){
        int value = stack.pop();
        traverse.add(value);
        for(Integer num:hm.get(value)){
            if(!traverse.contains(num)){
                stack.push(num.intValue());
            }
        }
    }
    System.out.println(traverse);
    return traverse.size()==node;
    }
}
