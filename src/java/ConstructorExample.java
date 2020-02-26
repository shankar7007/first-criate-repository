import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.plugin2.gluegen.runtime.CPU;

import java.util.concurrent.Callable;

public class ConstructorExample {

    // user defiend zero arg constructor

    public ConstructorExample(){
        int a = 10;
        int b = 20;

        System.out.println(a + b);
    }

    // user define parameterize constructor

    public ConstructorExample(int a,int b){
        System.out.println(a + b);


    }

    public static void main(String[] args) {
        ConstructorExample cE = new ConstructorExample();
        ConstructorExample constructorExample = new ConstructorExample(30 ,50);
        System.out.println("This is main method");


            }
        }




