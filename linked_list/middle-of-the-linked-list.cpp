/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
    ListNode* traverse = head;
    int pos{0};
    while(traverse){
    traverse = traverse -> next;
    pos++;
    }
    int target {(pos/2)};
    traverse = head;
    pos = 0;
    cout << target;
    while(traverse){
    if(pos == target){
        break;
    }
    traverse = traverse -> next;
    pos++;
    } 
    return traverse;
    }
};
