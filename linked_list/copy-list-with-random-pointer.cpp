class Solution {
public:
    Node* copyRandomList(Node* head) {
    Node first(0);
    Node* slow = &first;
    unordered_map<int,Node*> mp;
    unordered_map<Node*,int> base;
    int i {0};
    Node* traverse = head;
    while(traverse){
    base.insert({traverse,i});
    traverse = traverse->next;
    i++;
    }
    traverse = head;i = 0;
    while(traverse){
        if(auto it = mp.find(i);it != mp.end()){
            slow->next = it ->second;
        }else{
        Node* nNode = new Node(traverse->val);
        slow->next = nNode;
        mp.insert({i,slow->next});
        }
        slow = slow->next;
        if(traverse->random == nullptr){
            slow->random = nullptr;
        }else{
            if(auto ite = base.find(traverse->random);ite != base.end()){
                if(auto search = mp.find(ite->second); search!=mp.end()){
                    slow->random = search->second;
                }else{
                    Node* noo = new Node(traverse->random->val);
                    slow->random = noo;
                    mp.insert({ite->second,noo});
                }
            }
        }
        traverse = traverse ->next;i++;
    }


    return first.next;        
    }
};
