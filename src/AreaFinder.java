import java.util.Scanner;
public class AreaFinder
{
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Please enter length of an edge of a triangle:  ");
        float f1 = take.nextFloat();
        System.out.println("Please enter the length of the other edge: ");
        float f2 = take.nextFloat();
        System.out.println("Please enter the length of the last edge: ");
        float f3 = take.nextFloat();
        float u = (f1 + f2 + f3)/2;
        double area = Math.sqrt(u*(u-f1)*(u-f2)*(u-f3));
        System.out.println("Area of the triangle is: " + area);
    }
}
