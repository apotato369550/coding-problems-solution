

    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

