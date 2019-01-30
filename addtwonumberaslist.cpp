#include <bits/stdc++.h>
using namespace std;
struct ListNode
{
    int val;
    struct ListNode *next;
};
ListNode *addTwoNumbers(ListNode *A, ListNode *B)
{
    struct ListNode *hda = A;
    struct ListNode *hdb = B;
    struct ListNode *hds = NULL;
    int carry = 0;
    while (hda != NULL || hdb != NULL)
    {
        int a = 0, b = 0;
        if (hda != NULL)
        {
            a = hda->val;
        }
        if (hdb != NULL)
        {
            b = hdb->val;
        }
        int sum = a + b + carry;
        carry = 0;
        if (sum < 9)
        {
            hds->val = sum;
            insert(hds, sum);
        }
        else
        {
            insert(hds, sum%10);
            carry = 1;
        }
    }

    return hds;
}

void insert(struct ListNode *head, int newdata)
{
    struct ListNode *newnode = (struct ListNode *)malloc(sizeof(struct ListNode));
    struct ListNode *last = head;
    newnode->val = NULL;
    newnode->next = NULL;
    if(head == NULL){
        head = newnode;
        return;
    }
    while(last->next != NULL){
        last = last->next;
    }
    last->next = newnode;
    return;
}
void push(struct ListNode** head_ref, int new_data) 
{ 
    /* 1. allocate node */
    struct Node* new_node = (struct Node*) malloc(sizeof(struct Node)); 
   
    /* 2. put in the data  */
    new_node->data  = new_data; 
   
    /* 3. Make next of new node as head */
    new_node->next = (*head_ref); 
   
    /* 4. move the head to point to the new node */
    (*head_ref)    = new_node; 
} 

int main()
{
    struct ListNode *A = (struct ListNode *)malloc(sizeof(struct ListNode));

    return 0;
}