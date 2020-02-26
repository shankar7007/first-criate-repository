package homework1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercises8 {
    public void calAreofTriangne(int a,int b){
        double result;
        result =(a * b)/2;
        System.out.println(" the are of teiangle is ::"+ result);

    }

    public static void main(String[] args) {
        int hight, base;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Calculate are of triangle ::" );
        System.out.println(" Enter of triangle hight ::");
        hight = s1.nextInt();
        System.out.println(" Enter of triangle base :: ");
        base = s1.nextInt();
        Exercises8 obj = new Exercises8();
        obj.calAreofTriangne(hight,base);

    }
}
