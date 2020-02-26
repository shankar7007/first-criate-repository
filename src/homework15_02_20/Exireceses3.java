package homework1;

public class Exireceses3 {

    int a = 50;
    static int b= 20;
    public void addition(){
        System.out.print("Addition of A & B = "+(a+Exireceses3.b));
    }
    public static void subtraction(){
        Exireceses3 obj = new Exireceses3();
        System.out.println("Subtraction of a and b="+(obj.a-b));
    }


    public static void main(String[] args) {
        Exireceses3 obj = new Exireceses3();
        obj.addition();
        subtraction();
    }

}
