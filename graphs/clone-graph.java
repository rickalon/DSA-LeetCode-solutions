/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
    if(node == null)
        return null;
    Queue<Node> q = new LinkedList<>();
    Set<Integer> set = new HashSet<>();
    Node[] arr = new Node[101];
    Node[] rrr = new Node[101];
    q.offer(node);
    while(!q.isEmpty()){
        Node root = q.poll();
        arr[root.val]=root;
        rrr[root.val] = new Node(root.val);
        if(!set.contains(root.val)){
            set.add(root.val);
            for(Node n : root.neighbors){
                if(!set.contains(n.val)){
                    q.offer(n);
                }
            }
        }
    }
    Node root = null;
    for(Node n : arr){
        if(n!=null){
        Node aux = rrr[n.val];
        if(root==null)
            root = aux;      
        for(Node r : n.neighbors){
                aux.neighbors.add(rrr[r.val]);
        }
      }  
    }

    return root;   
    }
}
