import java.io.*;
import java.util.*;

public class Cylindertest
{
    int length;

    public static void main(String[] args)
    {
        Cylindertest c1 = new Cylindertest();
        c1.getdata();
        System.out.println(c1.volume());
    }

    public void getdata()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter length:");
        length = s1.nextInt();
    }

    public int area()
    {
        return (length * length);
    }

    int volume()
    {
        return (area() * length);
    }
}
      