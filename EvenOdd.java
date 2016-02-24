import java.io.*;
import java.util.*;

public class EvenOdd
{
    public int y;

    public static void main(String[] args)
    {

        EvenOdd d1 = new EvenOdd();
        d1.getdata();
        System.out.println(d1.prime(d1.y));
    }

    public void getdata()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Y:");
        y = s1.nextInt();
    }

    boolean prime(int x)
    {
        boolean iseven = false;
        int check = x;
        if (x % 2 == 0)
        {
            iseven = true;
        }
        else
        {
            iseven = false;
        }
        return (iseven);
    }
}

 