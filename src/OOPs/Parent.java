package OOPs;
class A {

}

class B extends A {

}
public class Parent {
    public static void main(String[] args) {
//        Parent p = new Parent();
//        p.m1();
        Child c1 = new Child();
        c1.m1();

    }
    public A m1() {
        System.out.println("I am m1 of parent"); // this class is being overridden,
        return new A();
    }

}

class Child extends Parent {
    public B m1() {
        System.out.println("I am m1 of child"); // this is called method overridding , this class is overrriding i.e making the changes
    return new B();
    }

}
