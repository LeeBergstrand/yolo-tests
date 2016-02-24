import junit.framework.*;

public class testCylinder extends TestCase
{

    public static void main(String[] args)
    {
        junit.textui.TestRunner.run(testCylinder.class);
    }

    public void testgetdata()
    {
        Cylindertest c1 = new Cylindertest();
        c1.getdata();
        assertEquals(2, c1.length);
    }

    public void testArea()
    {
        Cylindertest c1 = new Cylindertest();
        c1.length = 2;
        int result = c1.area();
        assertEquals(4, result);
    }

    public void testVolume()
    {
        Cylindertest c1 = new Cylindertest();
        c1.length = 2;
        int result = c1.volume();
        assertEquals(8, result);
    }
}
