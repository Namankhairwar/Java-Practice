package OOPs;

public interface Shapes {
    public static void main(String[] args) {
        child2 ch= new child2();
        ch.display();
        ch.color();
    }
    public static final  int i = 34;
//    i = 23; yaha pe error aayega kyuki ye public static final ban chuka hai

    void display();

}
interface Color{
     void color();
}