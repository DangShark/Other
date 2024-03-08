LinkedList::LinkedList() 
{
   head = NULL;
}

LinkedList::LinkedList(int a[], int n) 
{
    head = NULL;
    for(int i = n - 1; i >= 0; i--){
        insertHead(a[i]);
    }
}

void LinkedList::insertHead(int value)
{
    Node *tmp = new Node();
    tmp -> value = value;
    tmp -> next = NULL;
    if(head == NULL){
        head = tmp;
    }
    else{
        tmp -> next = head;
        head = tmp;
    }
}

void LinkedList::print()
{
    Node *tmp = new Node();
    tmp = head;
    while(tmp != NULL){
        cout << tmp -> value<<" ";
        tmp = tmp -> next;
    }
}
