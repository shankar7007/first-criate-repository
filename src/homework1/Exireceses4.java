package homework1;

public class Exireceses4 {

    int a = 20;
    int b = 30;
    static int c= 10;
    static int d= 40;
    public void addition(){
        System.out.println("addition of a and b="+(a+b) );
        System.out.println("addition of c and d="+(Exireceses4.c+Exireceses4.d) );

    }

    public static void addition2(){
        Exireceses4 obj = new Exireceses4();
        System.out.println("addition2 of a and b="+(obj.a+obj.b));
        System.out.println("addition2 of c and d="+(c+d) );

    }

    public static void main(String[] args) {
    Exireceses4 obj = new Exireceses4();
    obj.addition();

    addition2();

    }
}
