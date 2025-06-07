package OOPs;

public class demo {
    public  static void main(String[] args) {
        Students st1;
        Students st2;
        st1 = new Students(19,"Naman","Mumbai");
        st2 = new Students();
// st1.studentName = "Naman";
// st1.studentCity = "Masuk";
// st1.studentId = 19;
        st1.display();
//        String arr[] = {"Naman","Aman"};
//        master(arr);
//    }
//    public static void master(String args[]) {
//        for(String name : args) {
//            System.out.println(name+ " ");
//        }
        Students st3 = new Students(29,"Aman","Mumbai");
        System.out.println(st3.toString());
        plm P = new plm();
        P.m1(2);
        P.m1(2.4);
    }


 static class plm{
        void m1(int i) {
            System.out.println(i + " is an integer");
        }
        void m1(double i) {
            System.out.println(i + " is a double");
        }
 }
}


 class demo2 {

    void m1(int i) {
        System.out.println(i + " is an integer");
    }

    void m1(double i) {
        System.out.println(i + " is a double");
    }

    public static void main(String[] args) {
        demo2 p = new demo2();
        p.m1(2);
        p.m1(43.2);
    }
}
