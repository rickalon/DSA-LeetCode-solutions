/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        if(grid == null)
            return null;
        return construct(grid,0,grid[0].length,0,grid.length);
        
    }
    public Node construct(int[][] grid,int l,int r,int t, int b){
        if(l+1==r && t+1==b){
            return new Node(((grid[t][l]==1)?true:false),true);
        }
        int mid = l+(r-l)/2;
        int m = t + (b-t)/2;
        Node o1 = construct(grid,l,mid,t,m);
        Node o2 = construct(grid,mid,r,t,m);
        Node o3 = construct(grid,l,mid,m,b);
        Node o4 = construct(grid,mid,r,m,b);
        if(o1.isLeaf && o2.isLeaf && o3.isLeaf && o4.isLeaf && o1.val == o2.val && o2.val == o3.val && o3.val == o4.val){
            return o1;
        }else{
            return new Node(true,false,o1,o2,o3,o4);
        }
    }
}
