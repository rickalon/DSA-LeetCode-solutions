/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
    int pos {-1};
    bool result {false};
    ListNode* traverse = head;
    ListNode* aux = head;

    while(traverse){
        pos++;
        traverse = traverse ->next;
        if(aux && aux ->next && aux ->next  ->next && traverse){
            aux = aux -> next -> next;
        }else{
            return false;
        }
        if(traverse == aux){
            return true;
        }
    }

    return result;    
    }
};
