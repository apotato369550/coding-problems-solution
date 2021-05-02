

    // Complete the reverse function below.

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
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        DoublyLinkedListNode currentNode = head;
        List<Integer> list = new ArrayList<Integer>();
        while(currentNode != null){
            list.add(currentNode.data);
            currentNode = currentNode.next;
        }
        Collections.reverse(list);
        for(int value : list){
            System.out.println(value);
        }
        DoublyLinkedListNode newHead = new DoublyLinkedListNode(list.get(0));
        currentNode = newHead;
        for(int i = 1; i < list.size(); i++){
            DoublyLinkedListNode newNode = new DoublyLinkedListNode(list.get(i));
            currentNode.next = newNode;
            newNode.prev = currentNode;
            currentNode = currentNode.next;
        }
        // learn how to reverse a singly linked list without lists
        return newHead;
    }

