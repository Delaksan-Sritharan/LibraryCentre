package librarycentre_package;

import org.junit.Test;
import static org.junit.Assert.*;

public class WestminsterLibraryManagerTest {

    @Test
    public void testAddItemToList_WhenSpaceAvailable() {
        // manager with max 2 items
        WestminsterLibraryManager manager = new WestminsterLibraryManager(2);

        // create an item (Book)
        Item book = new Book("Test Book", "ISBN-001");

        // list should be empty at the start
        assertEquals(0, manager.itemList.size());

        // call the method under test
        manager.addItemToList(book);

        // now one item should be in the list
        assertEquals(1, manager.itemList.size());
        assertTrue(manager.itemList.contains(book));
    }

    @Test
    public void testAddItemToList_WhenListIsFull() {
        // manager can only hold 1 item
        WestminsterLibraryManager manager = new WestminsterLibraryManager(1);

        Item book1 = new Book("Book 1", "ISBN-001");
        Item book2 = new Book("Book 2", "ISBN-002");

        // add first item
        manager.addItemToList(book1);
        assertEquals(1, manager.itemList.size());

        // try to add second item (no space)
        manager.addItemToList(book2);

        // size should still be 1, because item_limit = 1
        assertEquals(1, manager.itemList.size());
        assertTrue(manager.itemList.contains(book1));
        assertFalse(manager.itemList.contains(book2));
    }
}
