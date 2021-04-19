package class3;
import class4.EncapsulationDemo;

class Child22 extends EncapsulationDemo{

    void test(){
        protectedMethod();
    }

}


public class demo19 extends EncapsulationDemo {

    public void test(){
        protectedMethod();
    }

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.publicMethod();

        Child22 child = new Child22();
        child.test();


    }
}