import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void listIsInitiallyEmpty() {
        LinkedList<Integer> list = new LinkedList<Integer>();

        assertTrue(
                "The stack is not initially empty!",
                list.size() == 0);
    }
}
