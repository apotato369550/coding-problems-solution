

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode currentNode1 = head1;
        SinglyLinkedListNode currentNode2 = head2;
        List<Integer> list = new ArrayList<Integer>();
        while(currentNode1 != null || currentNode2 != null){
            if(currentNode1 != null && currentNode2 != null){
                if(currentNode1.data <= currentNode2.data){
                    list.add(currentNode1.data);
                    currentNode1 = currentNode1.next;
                } else {
                    list.add(currentNode2.data);
                    currentNode2 = currentNode2.next;
                }
            } else if(currentNode1 != null){
                list.add(currentNode1.data);
                currentNode1 = currentNode1.next;
            } else if(currentNode2 != null){
                list.add(currentNode2.data);
                currentNode2 = currentNode2.next;
            }
        }
        Collections.sort(list);
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(list.get(0));
        SinglyLinkedListNode currentNode = newHead;
        for(int i = 1; i < list.size(); i++){
            currentNode.next = new SinglyLinkedListNode(list.get(i));
            currentNode = currentNode.next;
        }
        return newHead;
    }

