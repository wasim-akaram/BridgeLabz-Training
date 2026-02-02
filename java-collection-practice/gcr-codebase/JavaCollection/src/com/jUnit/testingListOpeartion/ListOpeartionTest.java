package com.jUnit.testingListOpeartion;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class ListOpeartionTest 
{

    private ListOperation manager;
    private List<Integer> list;

    @BeforeEach
    void setUp() 
    {
        manager = new ListOperation();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() 
    {
        manager.addElement(list, 20);
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveElement() 
    {
        manager.removeElement(list, 20);
        assertFalse(list.contains(20));
    }

    @Test
    void testGetSize() 
    {
        manager.addElement(list, 5);
        manager.addElement(list, 15);
        manager.addElement(list, 25);

        assertEquals(3, manager.getSize(list));
    }
}
