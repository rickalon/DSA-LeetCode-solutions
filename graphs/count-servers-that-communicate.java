class Solution {
    public int countServers(int[][] grid) {
    //top perfomace adj list kind of deal
    int N = grid[0].length;
    int M = grid.length;
    int servers = 0;
    for(int  i = 0 ; i < M ;i++){
        for(int j = 0 ; j < N ; j++){
            if(grid[i][j]==1){
                boolean isEnter = false;
                for(int x = 0 ; x < M ; x++){
                    if(x!=i && grid[x][j]==1){
                        isEnter = true;
                        servers++;
                        break;
                    }
                }
                if(!isEnter){
                for(int z = 0 ; z < N ; z++){
                    if(z!=j && grid[i][z]==1){
                        servers++;
                        break;
                    }
                }
                }
            }
        }
    }
    return servers;
    //BFS Graph
    // Queue<int[]> q = new LinkedList<>();
    // boolean[][] set = new boolean[M][N];
    // int servers = 0;
    // for(int i = 0 ; i < M ; i++){
    //     for(int j = 0 ; j < N;j++){
    //         if(grid[i][j]==1 && !set[i][j]){
    //             Queue<Integer> qaux = new LinkedList<>();
    //             q.offer(new int[]{i,j});
    //             qaux.offer(1);
    //             int server = 0;
    //             while(!q.isEmpty()){
    //                 int x = q.peek()[0];
    //                 int z = q.peek()[1];
    //                 q.poll();
    //                 if(!set[x][z]){
    //                     server++;
    //                     set[x][z]=true;
    //                     for(int y =0; y < M ;y++){
    //                     if(y!=x && !set[y][z] && grid[y][z]==1){
    //                         q.offer(new int[]{y,z});
    //                     }
    //                     }
    //                     for(int y =0; y < N ;y++){
    //                     if(y!=z && !set[x][y] && grid[x][y]==1){
    //                         q.offer(new int[]{x,y});
    //                     }
    //                     }
    //                 }
    //             }
    //             if(server>=2)
    //                 servers += server;
    //         }
    //     }
    // }
    // return servers;
    }
}
