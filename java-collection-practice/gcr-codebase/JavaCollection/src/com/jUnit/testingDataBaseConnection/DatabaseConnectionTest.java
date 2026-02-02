package com.jUnit.testingDataBaseConnection;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class DatabaseConnectionTest 
{

    private DatabaseConnection db;

    @BeforeEach
    void setUp() 
    {
        db = new DatabaseConnection();
        db.connect(); 
    }

    @AfterEach
    void tearDown()
    {
        db.disconnect();  
    }

    @Test
    void testConnectionIsEstablished() 
    {
        assertTrue(db.isConnected(), "Database should be connected before the test");
    }

    @Test
    void testConnectionIsClosedAfterTest() 
    {
        assertTrue(db.isConnected(), "Database should be connected during the test");
       
    }
}
