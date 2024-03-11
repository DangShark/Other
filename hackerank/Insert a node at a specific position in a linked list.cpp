#include<bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    Node *next;
};
typedef struct Node *node;

node makeNode(int x) {
    node tmp = new Node();
    tmp -> data = x;
    tmp -> next = NULL;
    return tmp;
}

void insertFirst(node &a, int x) {
    node tmp = makeNode(x);
    if (a == NULL) {
        a = tmp;
    } else {
        tmp -> next = a;
        a = tmp;  
    }
}

void insertLast(node &a, int x) {
    node tmp = makeNode(x);
    if (a == NULL) {
        a = tmp;
    } else {
        node p = a;
        while (p -> next != NULL) {
            p = p -> next;
        }
        p->next = tmp; // Gán tmp vào cu?i danh sách
    }
}

int Size(node a) {
    int cnt = 0;
    node p = a; // S? d?ng con tr? t?m p d? không làm m?t con tr? d?u danh sách
    while (p != NULL) {
        cnt++;
        p = p -> next;
    }
    return cnt;
}

// chèn thêm 1 ph?n t? vào v? trí gi?a
void insertMiddle(node &a, int x, int pos) {
    int n = Size(a);
    if (pos < 1 || pos > n + 1) {
        cout << "Invalid position" << endl;
        return;
    }
    if (n == 0 || pos == 1) {
        insertFirst(a, x);
        return;
    }
    if (n == pos) {
        insertLast(a, x);
        return;
    }

    node p = a;
    for (int i = 1; i < pos; i++) {
        p = p -> next;
    }
    node tmp = makeNode(x);
    tmp -> next = p -> next;
    p -> next = tmp;
}

int main() {
    int n;
    cin >> n;
    node head = NULL; // Kh?i t?o danh sách r?ng
    for (int i = 0; i < n; i++) {
        int data;
        cin >> data;
        insertLast(head, data);
    }

    int m, pos;
    cin >> m >> pos;
    insertMiddle(head, m, pos);

    // In ra danh sách sau khi chèn
    node tmp = head;
    while (tmp != NULL) {
        cout << tmp -> data << " ";
        tmp = tmp -> next;
    }
    return 0;
}

