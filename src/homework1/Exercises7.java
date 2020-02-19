package homework1;

import java.util.Scanner;

public class Exercises7 {
    public void calcFahrenToDegree(double i){
        double result;
        result =(i -32)*5/9;
        System.out.println("The celsius value is ::"+ result);
    }

    public static void main(String[] args) {
        double a;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Fahrenheit temperature rang between -60 to 120° f");
        a = s1.nextDouble();
        Exercises7 obj = new Exercises7();
        obj.calcFahrenToDegree(a);
    }
}
