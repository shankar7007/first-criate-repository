package homework1;

public class Exercise1 {

    // Declare two instance variable
    int a = 20;
    int b = 50;

    //declare instance method
    public void addition() {
        System.out.print("Addition of A & B = " + (a + b));

    }

    //Declare main method
    public static void main(String[] args) {
        // call two variables
        Exercise1 obj = new Exercise1();
        obj.addition();

    }
}