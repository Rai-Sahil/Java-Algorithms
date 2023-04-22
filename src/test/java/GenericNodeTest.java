import GnericsandLinkedList.GenericNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GenericNodeTest {
    GenericNode gn = new GenericNode(23);
    GenericNode gn2 = new GenericNode("hello");
    GenericNode gn3 = new GenericNode(45);
    GenericNode gn4 = new GenericNode(gn);



    @Test
    public void testValue(){
        int value = 23;

        assertEquals(value, gn.getValue());
        System.out.println("\nTest Successfully Passed --------------------------------------------------------" +
                "------------------------------------------------");
    }

    @Test
    public void testLinkedList(){
        gn.setNext(gn2);
        gn2.setNext(gn3);
        gn3.setNext(gn4);
        gn4.setNext(null);

        GenericNode n = gn.getNext();
        assertEquals(gn2.getValue(), n.getValue());
        if (gn2.getValue() == n.getValue()){
            System.out.println("Test Successfully Passed --------------------------------------------------------" +
                    "------------------------------------------------\n");
        }
    }
}
