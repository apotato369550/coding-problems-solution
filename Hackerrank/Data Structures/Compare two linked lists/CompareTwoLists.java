

    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode currentNode1 = head1;
        SinglyLinkedListNode currentNode2 = head2;
        while(currentNode1 != null && currentNode2 != null){
            if(currentNode1.data != currentNode2.data){
                return false;
            } else if((currentNode1.next == null && currentNode2.next != null) ||
            (currentNode2.next == null && currentNode1.next != null)){
                return false;
            } 
            currentNode1 = currentNode1.next;
            currentNode2 = currentNode2.next;
        }
        
        return true;
    }

