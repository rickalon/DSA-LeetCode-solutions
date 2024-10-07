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
    ListNode* rotateRight(ListNode* head, int k) {
    if(!head) return head;
    ListNode* left=head;
    ListNode* right=head;
    int length=1;
    while(right->next){
        length++;
        right = right->next;
    }
    int times = k % length;
    for(int i = 0; i < times ; i++){
    int aux = left ->val;
    left->val = right->val;
    left = left->next;
    while(left){
        swap(left->val,aux);
        left = left->next;
    }
    left=head;
    }
    return head;
    }
};
