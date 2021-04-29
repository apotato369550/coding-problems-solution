

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        // this looks interesting
        // printout nodes
        // condition if both nodes are the same
        // i don't know how to do this...
        SinglyLinkedListNode currentNode1 = head1;
        SinglyLinkedListNode currentNode2 = head2;
        while(currentNode1 != currentNode2){
            if(currentNode1.next == null){
                currentNode1 = head2;
            } else {
                currentNode1 = currentNode1.next;
            }
            if(currentNode2.next == null){
                currentNode2 = head1;
            } else {
                currentNode2 = currentNode2.next;
            }
        }
        return currentNode2.data;
    }

