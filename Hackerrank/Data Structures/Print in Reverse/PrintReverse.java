

    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
        // this can be solved O(n) usually lmao
        // this look simple af
        List<Integer> list = new ArrayList<Integer>();
        SinglyLinkedListNode currentNode = head;
        while(currentNode != null){
            list.add(currentNode.data);
            currentNode = currentNode.next;
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get((list.size() - 1) - i));
        }
    }

