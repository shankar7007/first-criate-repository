package homework22_02_20;
import java.util.Scanner;
public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // odd or even number
        String Input = (number % 2 == 0)? "even" : "odd";
        System.out.println(number + "is" + Input);
        sc.close();
        

    }


}
