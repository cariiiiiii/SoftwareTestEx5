package mimic;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {


    @Test
    public void linkedListTest() {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        assertEquals(1, list.remove().intValue());
        assertEquals(2, list.size());

        assertTrue(list.removeLastOccurrence(3));
        assertEquals(1, list.size());
        assertEquals(2, list.get(0).intValue());

        assertTrue(list.remove(Integer.valueOf(2)));
        System.out.println("After remove: " + list);
        assertFalse(list.contains(2), "List should not contain element 2 after remove operation");


        assertFalse(list.remove(Integer.valueOf(10)));

        list.clear();
        assertThrows(NoSuchElementException.class, () -> list.remove());
    }
}
