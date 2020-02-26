package homework1;
import java.util.Scanner;
public class RadiusValue {
    public void CalAreaofCircal(int i) {
        double result;
        result = 3.14 * i * i;
        System.out.println("The area of circle is ::" + result);


    }

    public static void main(String[] args) {
        int a;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Cacculate area of circal ::");
        System.out.println("Enter the radius of circal in Integer ::");
        a = s1.nextInt();
        RadiusValue obj = new RadiusValue();
        obj.CalAreaofCircal(a);

    }













}
