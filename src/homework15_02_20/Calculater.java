package homework1;

import com.sun.xml.internal.ws.api.model.WSDLOperationMapping;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Calculater {
    public void Addinst( int a, int b){
        int result;
        result = a + b;
        System.out.println("Addition of  a & b ="+ result);
    }

    public void Subinst(){}
    public static void Multiinst(){}
    public static void Divinst(){}


    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a,b;
        System.out.println("Please Enter  integer first No- a");
        a=s1.nextInt();
        System.out.println(" please Enter  integer second No- b");
        b=s1.nextInt();
        System.out.println(a);
        System.out.println(b);
        Calculater obj = new Calculater();
        obj.Addinst(a,b);

    }


}
