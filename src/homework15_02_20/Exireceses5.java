package homework1;

import java.util.Scanner;

public class Exireceses5 {
    public void AddInst(int p, int q) {
        int result;
        result = p + q;
        System.out.println("Addition of a & b is ::" + result);
    }

    public void SubInst(int i, int j) {
        int result;
        result = i - j;
        System.out.println("Subtraction of a & b::" + result);
    }




        public static void MulStat( int c , int d){
        int result;
        result = c*d;
            System.out.println("Multification of c and d="+ result);
        }
        public static void DivStat( int a, int b){
        int result;
        result = a/b;
            System.out.println("Division of a and b="+ result);
        }

    public static void main(String[] args) {
        int a, b;
        Scanner s1 = new Scanner(System.in);
        System.out.println( " Enter First Integer no ::");
        a=s1.nextInt();
        System.out.println( "Enter second Integer no ::");
        b=s1.nextInt();
        Exireceses5 obj = new Exireceses5();
        obj.AddInst(2,6);
        obj.SubInst(3,7);
        MulStat(a,b);
        DivStat(a,b);






    }




    }






