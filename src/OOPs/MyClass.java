package OOPs;

abstract public class MyClass {
    public void cal() {
        System.out.println("Called MyClass");
    }
    abstract public void logicInCal();
}
class Start {
    public static void main(String[] args) {
        MyChild m = new MyChild();   // abstract class ki object nahi bana sakte
        m.logicInCal();
    }
}