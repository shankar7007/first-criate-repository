package homework1;
import java.util.Scanner;
public class Exercises12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.print("Input third number: ");
        int num3 = in.nextInt();


        System.out.println("Average of three numbers is: " + (num1 + num2 + num3 ) / 3);
    }
}



