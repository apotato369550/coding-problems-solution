

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position){
        SinglyLinkedListNode currentNode = head;
        
        for(int i = 0; i < position - 1; i++){
            currentNode = currentNode.next;
        }
        
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        // woah i'm smart actually lmao VVV
        newNode.next = currentNode.next;
        currentNode.next = newNode;
                    
        return head;
    }

