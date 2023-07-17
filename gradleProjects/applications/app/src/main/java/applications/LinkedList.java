package applications;

import java.util.*;


public class LinkedList {
    Node head;

    public void integerInsert(int value) {
        Node insertNode = new Node(value);
        insertNode.next = head;
        head = insertNode;

    }

}
