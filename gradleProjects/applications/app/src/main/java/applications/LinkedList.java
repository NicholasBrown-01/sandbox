package applications;

public class LinkedList {
    private LinkedListNodeCLASS head;

    public void insert(String data) {
        LinkedListNodeCLASS newNode = new LinkedListNodeCLASS(data);

        if (head == null) {
            head = newNode;
        } else {
            LinkedListNodeCLASS current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
}