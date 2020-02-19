package homework1;

import java.util.Scanner;

public class Exercises10 {
    public static void main(String[] args) {
        int num;
        Scanner s1 = new Scanner(System.in);
        System.out.println(" Enter Integer::");
        num = s1.nextInt();
        System.out.println(" times table of "+num+" ::");
        for (int a = 1; a <10; a++){
            System.out.println(num + "*"+(a+1) + "="+(num * (a+1)));
        }

    }

}
