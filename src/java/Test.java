import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class Test {

    int age=30;
    static String myName = "Ravi";


    public static void main(String[]args){
        System.out.println("age");
        System.out.println("myName");

    }
    public   void  getMyName() {
        System.out.println(age);
        System.out.println(myName);
    }

        public static void getMyage(){
            Test obj = new Test();
            System.out.println(obj.age);
            System.out.println();

        }
    }


