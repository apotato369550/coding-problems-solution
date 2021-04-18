

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(position == 0){
            return head.next;
        } 
        SinglyLinkedListNode currentNode = head;
        for(int i = 0; i < position - 1; i++){
            currentNode = currentNode.next;
        }
        currentNode.next = (currentNode.next).next;
        return head;
        // this looks interesting...
    }

