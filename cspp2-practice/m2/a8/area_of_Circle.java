import java.util.*;
import java.lang.Math.*;

class area_of_Circle
{
    public static float pi()
    {
    
        return 3.14f;
    }
    public static float area(float r)
    {
        return pi()*r*r;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        //double pi = pi();
        System.out.println(area(r));
    }
}