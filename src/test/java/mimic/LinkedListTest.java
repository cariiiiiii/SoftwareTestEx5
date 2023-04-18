package mimic;


import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    @Test
    void should_remove_first_null_element_when_remove_null(){
        List<String> list = new LinkedList<>();
        list.add(null);
        list.add(null);

        list.remove(null);

        assertEquals(1,list.size());
    }
}
