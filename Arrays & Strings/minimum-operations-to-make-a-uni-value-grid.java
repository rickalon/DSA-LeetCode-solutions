class Solution {
    public int minOperations(int[][] grid, int x) {
    ArrayList<Integer> list = new ArrayList<>(grid.length * grid[0].length);
    for(int[] row : grid){
        for(int elem : row){
            list.add(elem);
        }
    }
    list.sort(Integer::compare);
    for(Integer num : list){
        if(Math.abs(num-list.get(0)) %x != 0)
            return -1;  
    }
    int med = list.get(list.size() / 2);
    int moves = 0;
    for(Integer num : list){
        moves += Math.abs(num - med) / x;
    }
    return moves;
    }
}
