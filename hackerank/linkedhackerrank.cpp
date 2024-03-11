#include<bits/stdc++.h>
using namespace std;

struct Node{
	int data;
	Node *next;
};
typedef struct Node* node;
node makeNode(int x){
	node tmp = new Node();
	tmp -> data = x;
	tmp -> next = NULL;
	return tmp;
}
int main(){
	int n;
	cin >> n;
	node head = NULL;
	int x[n+2];
	for(int i = n; i >= 1 ; i--){
		cin >> x[i];
	}
	for(int i = 1; i <= n; i++){
		node newnode = makeNode(x[i]);
		newnode -> next = head;
		head = newnode;
	}
	node tmp = head;
	while(tmp != NULL){
		cout << tmp -> data <<endl;
		tmp = tmp -> next;
	}
	return 0;
}
