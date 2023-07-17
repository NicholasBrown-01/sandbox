package applications; //Bring in same package

public class LinkedListNodeCLASS { //Class needs to be accessible
    private String data; // Keep data private
    private LinkedListNodeCLASS next;

    public LinkedListNodeCLASS(String data) {
            this.data = data;
            this.next = null; // Set Next Reference to null since at time of creation, the new node doesn't have a next node to point to yet.
        }

    // getters and setters
    public String getData() {
        return this.data;
    }

    public LinkedListNodeCLASS getNext() {
        return this.next;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(LinkedListNodeCLASS next) {
        this.next = next;
    }
}