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
    ListNode* reverseList(ListNode* head) {
    stack<int> vt;
    ListNode* reverser = head;
    while(reverser != nullptr)
    {
        vt.push(reverser->val);
        reverser = reverser -> next;
    }
    reverser = head; 
    while(reverser != nullptr && vt.size() > 0)
    {
        reverser->val = vt.top();
        vt.pop();
        reverser = reverser -> next;
    }  
    return head; 
    }
};
