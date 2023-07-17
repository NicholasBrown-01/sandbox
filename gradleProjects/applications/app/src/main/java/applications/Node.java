package applications; //Bring in same package

public class Node { //Class needs to be accessible
    public int value;
    public Node next = null;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}