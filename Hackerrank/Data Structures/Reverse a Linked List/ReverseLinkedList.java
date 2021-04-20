

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode currentNode = head;
        List<Integer> list = new ArrayList<Integer>();
        while(currentNode != null){
            list.add(currentNode.data);
            currentNode = currentNode.next;
        }   
        Collections.reverse(list);
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(list.get(0));
        currentNode = newHead;
        for(int i = 1; i < list.size(); i++){
            currentNode.next = new SinglyLinkedListNode(list.get(i));
            currentNode = currentNode.next;
        }
        return newHead;
    }

