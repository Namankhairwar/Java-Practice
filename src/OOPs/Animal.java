package OOPs;

public class Animal {
    public static void main(String[] args) {
        Animal a = new Dog();
        Cat cat = new Cat();
        cat.color = "Brown";
        cat.age = 1;
        System.out.println(cat.color + " " + cat.age);
        cat.eat();
        Dog dog = new Dog();
        dog.legs = 4;
        dog.color = "Red";
        dog.display();
        dog.eat();
        cat.speak();
        dog.rtplm();
        a.rtplm();
    }
    String color;
    int x = 4;
    public void eat() {
        System.out.println("eat");
    }

    public Animal() {
        System.out.println("Parents constructor is called");
    }

     void rtplm() {
        System.out.println("Parent Rtplm");
    }
}

class Cat extends Animal {
    int age;
    int x = 12;
    public void speak(){
        System.out.println("cat class ka x " + this.x); // use of this keyword
        System.out.println("Animal class ka x " + super.x); // use of super keyword
    }
    public void eat() {
        System.out.println("eat");
    }

    public Cat() {
        super(); // parents class ka construction call ho raha hai yaha se using super function
    }
}
class Dog extends Animal {
    int legs;
    public void display() {
        System.out.println(legs);
        System.out.println(super.color);
    }

    void rtplm() {
        System.out.println("Child Rtplm");
    }

}

