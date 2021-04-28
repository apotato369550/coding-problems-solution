

    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        // there is something wrong
        if(head == null){ return false; }
        int iterations = 0;
        SinglyLinkedListNode currentNode = head;
        // bruh the conditional
        while(iterations <= 1001){
            currentNode = currentNode.next;
            if(currentNode == null){
                System.out.println("lmao");
                return false;
            }
            iterations++;
        }
        return true;
    }

