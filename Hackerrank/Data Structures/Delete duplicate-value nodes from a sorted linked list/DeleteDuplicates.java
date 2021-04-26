

    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode start = head;
        SinglyLinkedListNode end = head;
        while(end != null){
            if(start.data != end.data){
                start = start.next;
                end = end.next;
            } else {
                start.next = end.next;
                end = end.next;
            }
        }
        return head;
    }

