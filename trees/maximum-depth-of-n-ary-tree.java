/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);
    int maxDepth = 0;
    while(!queue.isEmpty()){
        int size = queue.size();
        int auxMaxDepth = maxDepth;
        while(size>0){
            Node aux = queue.poll();
            if(aux!=null){
                if(auxMaxDepth==maxDepth){
                    maxDepth++;
                }
                for(Node node : aux.children){
                    queue.offer(node);
                }

            }
            size--;
        }
    }
    return maxDepth;    
    }
}
