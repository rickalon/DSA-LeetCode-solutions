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
    static bool compare(const ListNode* a, const ListNode* b){
        return a->val > b->val;
    }
    ListNode* mergeKLists(vector<ListNode*>& lists) {
    priority_queue<ListNode*, vector<ListNode*>, decltype(&Solution::compare)> minHeap(Solution::compare);
    for(int i=0;i<lists.size();i++){
        if(lists[i] != nullptr){
            minHeap.push(lists[i]);
        }
    }
    priority_queue<ListNode*, vector<ListNode*>, decltype(&Solution::compare)> rst(Solution::compare);
    while(minHeap.size()){
    ListNode* min = minHeap.top();
    while(min){
       rst.push(min);
       min = min->next; 
    }
    minHeap.pop();
    }
    if(rst.size()==0){
        return nullptr;
    }else{
    ListNode result = ListNode();
    ListNode* aux = &result;
    while(rst.size()){
    ListNode* mm = rst.top();
    aux -> next = new ListNode(mm->val);
    aux = aux->next;
    rst.pop();
    }
    return result.next;
    }
    }
};
