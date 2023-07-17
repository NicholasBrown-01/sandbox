package applications;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTEST {

   @Test
    void createLinkedListTEST() {
        LinkedList sut = new LinkedList();
        sut.insert("Nick");
        sut.insert("Sara");
        sut.print();

    }
}
