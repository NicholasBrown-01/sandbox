package applications;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTEST {

    @Test
    void integerInsertTEST(){
        LinkedList sut = new LinkedList();
        sut.integerInsert(4);

        assertNotNull(sut.head, "The head node should not be null after insertion");
        assertEquals(4, sut.head.value, "The value of the head node should be the same as the inserted value");

        System.out.println("The current head's value is: " + sut.head.value);
    }
}
