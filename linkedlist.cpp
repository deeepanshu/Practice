#include<bits/stdc++.h>
using namespace std;
struct Node{
    int val;
    struct Node* next;
};
void push(struct Node* head, int val){
    struct Node* node = (struct Node*) malloc(sizeof(struct Node));
    node->val = val;
    cout<<"INSERTED: "<<node->val;
    if(head == NULL){
        head = (struct Node*) malloc(sizeof(struct Node));
        head->next = node;
        return;
    }
    struct Node* temp = head;
    while(temp->next!=NULL){
        temp = temp->next;
    }
    temp->next = node;
    return;
}

void print(struct Node* head){
    struct Node* temp = head;
    while(temp->next != NULL){
        cout<<temp->val;
        temp = temp->next;
    }
}

int main(){
    struct Node* start;
    push(start, 5);
    print(start);
    return 0;
}