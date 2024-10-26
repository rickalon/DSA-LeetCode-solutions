class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
    Queue<int[]> traverse = new LinkedList<>();
    HashSet<String> valid = new HashSet<>();

    traverse.add(new int[]{entrance[0],entrance[1],0});
    valid.add(entrance[0]+","+entrance[1]);
    int[][] direcctions = {{-1,0},{1,0},{0,-1},{0,1}};
    final int rows = maze.length;
    final int columns = maze[0].length;

    while(!traverse.isEmpty()){
        int[] pos = traverse.poll();
        int i = pos[0];
        int j = pos[1];
        int steps = pos[2];
        if(!(i==entrance[0] && j==entrance[1]) && (i==0 || j==0 || j == columns-1 || i == rows-1)){
            return steps;
        }

        for(int dir = 0 ; dir < direcctions.length;dir++){
            if(i+direcctions[dir][0] >= 0 && j+direcctions[dir][1]>=0 && i+direcctions[dir][0]<rows && j+direcctions[dir][1] <columns && !valid.contains(i+direcctions[dir][0]+","+j+direcctions[dir][1])){
                if( maze[i+direcctions[dir][0]][j+direcctions[dir][1]]=='.'){
                    valid.add(i+direcctions[dir][0]+","+j+direcctions[dir][1]);
                    traverse.add(new int[]{i+direcctions[dir][0],j+direcctions[dir][1],steps+1});
                }
            }
        }
    }
    
    return -1;
    }
}
