

    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode currentNode = head;
        int length = 0;
        while(currentNode != null){
            length++;
            currentNode = currentNode.next;
        }
        int index = length - positionFromTail;
        currentNode = head;
        for(int i = 0; i < index - 1; i++){
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

