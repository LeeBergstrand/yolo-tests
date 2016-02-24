import junit.framework.*;

public class testCylinder extends TestCase {
  
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
  
  public void even() 
  {
    EvenOdd d1 = new EvenOdd();
    int result = d1.area();
    assertEquals(4, result);
  }
}
