/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);

    while(!queue.isEmpty()){
        int size = queue.size();
        Node prev = null;
        while(size>0){
            Node aux = queue.poll();
            size--;
            if(aux!=null){
                if(prev!=null){
                    prev.next = aux;
                }
                queue.offer(aux.left);
                queue.offer(aux.right);
                prev = aux;
            }
        }
        if(prev!=null){
            prev.next = null;
        }
    }
    return root;  
    }
}
