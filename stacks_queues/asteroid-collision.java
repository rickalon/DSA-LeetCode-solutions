class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> stack = new Stack<>();
    List<Integer> list = new ArrayList<>();
    for(int asteroid : asteroids)
    {
        if(asteroid>=0){
            stack.push(asteroid);
        }else{
            if(stack.isEmpty()){
                list.add(asteroid);
            }else{
                while(!stack.isEmpty()){
                    if(stack.peek() < Math.abs(asteroid)){
                        stack.pop();
                        if(stack.isEmpty()){
                            list.add(asteroid);
                        }
                    }else if(stack.peek() > Math.abs(asteroid)){
                        break;
                    }else{
                        stack.pop();
                        break;
                    }
                }
            }
        }
    }
    //quicker, 6ms
    int[] ans = new int[list.size()+stack.size()];
    for(int i = 0 ; i < ans.length ; i++){
        if(i < list.size()){
            ans[i] = list.get(i);
        }else{
            ans[i] = stack.removeFirst();
        }
    }
    return ans;
    //slower, 8 ms
    // list.addAll(stack);   
    // return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
