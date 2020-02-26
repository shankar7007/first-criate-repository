package homework22_02_20;

import com.sun.corba.se.impl.orb.ParserTable;

import java.util.Scanner;

public class GradOfStudent {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Student Name::");
        String name = sc.nextLine();
        System.out.println("Please enter Student Roll No.::");
        int roll_no = sc.nextInt();
        String[] sub = {"Maths", "Science", "English"};
        int marks[] = new int[3];
        //int i;
        float total = 0;
        double percent = 0;
        String grade = "", result = "";
        System.out.println("Enter Marks of All Subject between 0 to 100 ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the Marks for " + sub[i] + ":: ");
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        percent = (total / 300) * 100;
        System.out.println("Dear " + name + " Your Percentage is ::" + percent);
        //sc.close();
        //Calculating average here
        //avg = total/3;
        if (percent >= 80) {
            grade = "A+";
        } else if (percent >= 60 && percent < 80) {
            grade = "A";
        } else if (percent >= 50 && percent < 60) {
            grade = "B";
        } else if (percent >= 35 && percent < 50) {
            grade = "C";
        }
        if (percent >= 35) {
            result = "Pass";
            System.out.println("Your Grade is: " + grade);
            System.out.println("You are " + result);
        }
        else
        {result = "Fail";
            System.out.println("You are " + result);}
        System.out.println("__________________________________");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|         "+sub[0]+"   :   "+marks[0]+"        |");
        System.out.println("|         "+sub[1]+"   :    "+marks[1]);
        System.out.println("|");
        System.out.println("|");
    }
}





