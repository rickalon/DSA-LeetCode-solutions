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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
    vector<ListNode*> vectorl1;
    vector<ListNode*> vectorl2;

    ListNode* auxl1 = l1;
    ListNode* auxl2 = l2;    
    while(auxl1){
        vectorl1.push_back(auxl1);
        auxl1 = auxl1 ->next;
    }
    while(auxl2){
        vectorl2.push_back(auxl2);
        auxl2 = auxl2 ->next;
    }
    vector<ListNode*> result;
    if(vectorl1.size()>vectorl2.size()){
        result = vectorl1;
    }else{
        result = vectorl2;
    }

    int sizel1 = 0;
    int sizel2 = 0;
    int rest = 0;

    for(int i = 0; i < result.size() ;i++){
        int val1 = 0;
        int val2 = 0;
        if(sizel1<vectorl1.size()){
            val1 = vectorl1[sizel1++]->val;
        }
        if(sizel2<vectorl2.size()){
            val2 = vectorl2[sizel2++]->val;
        }
        int rst = (val1 + val2 + rest);
        if(rst >= 10){
            rest=1;
        }else{
            rest = 0;
        }
        rst = rst % 10;
        result[i]->val =rst;
    }
    if(rest == 1){
        ListNode* next = new ListNode(1);
        result[result.size()-1] ->next = next;
    }

    return result[0];
    }
};
