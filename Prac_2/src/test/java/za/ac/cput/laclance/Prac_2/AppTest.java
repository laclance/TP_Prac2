package za.ac.cput.laclance.Prac_2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.*;
import org.junit.rules.*;

public class AppTest
        extends TestCase {
    TestObject testObj = new TestObject();

    public AppTest(String testName) {
        super(testName);
    }

    static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testApp() {
        //assertEquals(testObj.getFloat(), 5.5f);
        //assertEquals(testObj.getInt(), 5);

      //  assertEquals(testObj.getObject(), 5);
        //assertSame(testObj.getObject(), 5);

      //  assertTrue(testObj.getTrue());
       // assertFalse(testObj.getFalse());

        //assertNull(testObj.getNull());
        //assertNotNull(testObj.getObject());
        //failTest();
        //ignoreTest();
        //exceptionTest();

        //Error: Cannot not resolve method 'assertArrayEquals'
        //assertArrayEquals(new Object[]{1,2}, testObj.getArray());
    }

    public void failTest() {
        System.out.println("hello");
        fail();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    public void exceptionTest() {
        thrown.expect(IndexOutOfBoundsException.class);
        Object[] o = new Object[2];
        o[3] = 5;
    }

    //Error: Cannot not resolve method 'timeout' or 'expected'
    //@Test(timeout=100)
    public void testTimeOut() {
    }

    @Ignore
    public void ignoreTest() {
        System.out.println("in ignore test");
    }
}
