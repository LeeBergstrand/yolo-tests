import junit.framework.*;

public class testEvenOdd extends TestCase
{
    public static void main(String[] args)
    {
        junit.textui.TestRunner.run(testEvenOdd.class);
    }

    public void testgetdata()
    {
        EvenOdd d1 = new EvenOdd();
        d1.getdata();
        assertEquals(2, d1.y);
    }

    public void testeven()
    {
        EvenOdd d1 = new EvenOdd();
        boolean result = d1.prime(2);
        assertTrue(result);
    }

    public void testodd()
    {
        EvenOdd d1 = new EvenOdd();
        boolean result = d1.prime(1);
        assertFalse(result);
    }
}
