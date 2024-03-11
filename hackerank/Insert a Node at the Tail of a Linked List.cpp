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
	int x[n+2]; 
    for(int i = 1; i <= n ; i++){
        cin >> x[i];
    }
	for(int i = 1; i <= n; i++){
		cout << makeNode(x[i]) -> data << endl;
		
	}  
	return 0;
}
