

    // Complete the sortedInsert function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        // this is interesting
        // we have access to the previous element as well..
        // hrnnnn...
        DoublyLinkedListNode currentNode = head;
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if(head.data >= data){
            // i'm on to something
            System.out.println(head.data + " >= " + data);
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = null;
            return newNode;
        }
        while(currentNode != null){
            if(currentNode.data >= data){
                (currentNode.prev).next = newNode;
                newNode.next = currentNode;
                currentNode.prev = newNode;
                // return head;
                break;
            } 
            if(currentNode.next == null){
                currentNode.next = newNode;
                newNode.prev = currentNode;
                newNode.next = null;
                break;
            }
            currentNode = currentNode.next;
        }
        // make an if for when data is the highest value
        return head;
    }

