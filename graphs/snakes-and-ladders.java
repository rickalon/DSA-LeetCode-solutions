class Move{
    int i;
    int j;
    public Move(int i,int j){
        this.i = i;
        this.j = j;
    }
public boolean equals(Object obj) {
    if (this == obj) return true; 
    if (obj == null || getClass() != obj.getClass()) return false;
    Move m = (Move) obj; 
    return i == m.i && j == m.j;
}
    public int hashCode() {
        return Objects.hash(i, j); 
    }
    public String toString(){
        return i+","+j+".";
    }
}
class Solution {
    public int snakesAndLadders(int[][] board) {
    int n = board.length;
    int nn = n*n;
    int moves = Integer.MAX_VALUE;
    int dir = 0;
    int end = (n%2==0)?0:n-1;
    Queue<Pair<Move,Integer>> q = new LinkedList<>();
    q.offer(new Pair<>(new Move(n-1,0),0));

    Set<Move> set = new HashSet<>();
    while(!q.isEmpty())
    {
        Move m = q.peek().getKey();
        int currentMoves = q.peek().getValue();
        q.poll();
        if(m.i==0 && m.j==end){
            moves = Math.min(moves,currentMoves);
        }else if(!set.contains(m)){
            set.add(m);
            int i = m.i;
            int j = m.j;
            dir = (n-(i+1))%2 == 0?0:1;
            for(int times = 0 ; times < 6 ; times++){
                if(dir == 0){
                    j++;
                    if(j==n){
                        dir = 1;
                        j = n -1;
                        i--;
                    }
                }else{
                    j--;
                    if(j==-1){
                        dir=0;
                        j=0;
                        i--;
                    }
                }
                if(i==0 && j==end){
                    moves = Math.min(moves,currentMoves+1);
                    break;
                }else if(board[i][j]!=-1){
                    q.offer(new Pair<>(getCor(board,n,board[i][j]),currentMoves+1));
                }else{
                    q.offer(new Pair<>(new Move(i,j),currentMoves+1));
                }
            }
        }
    }
    if(moves == Integer.MAX_VALUE)
        return -1;
    return moves;
    }

    Move getCor(int[][] board, int n, int num){
        num--;
        int column = num % n;
        int row = n - 1 - (num / n);
        int dir = (num / n) % 2 == 0 ? 0 : 1;
        if(dir ==0) 
            return new Move(row,column);
        else
            return new Move(row,n-1-column);
    }  
}
