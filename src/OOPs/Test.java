package OOPs;

class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name = "Naman";
        int age = 18;
        System.out.println(name);
        System.out.println(age);
        int n =  126;
        System.out.println(n);
        byte small = (byte) n;
        System.out.println(small);
        double d = 50.89;
        System.out.println(d);
        float f = (float) d;
        System.out.println(f);
        if(n % 2 == 0) {
            System.out.println(n+" is even number");
        } if (n > 0) {
            if(n % 2 == 0) {
                System.out.println(n+" is an even number");
                if(n > 2) {
                    n += 12;
                    System.out.println(n);
                    if(n > 100) {
                        n /= 10;
                        double m = (double) n;
                        System.out.println(m);
                    }
                }
            }
        }
        else {
            System.out.println(n+" is odd number");
        }


        for(int j = 0; j<=10; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        int num = 10;
        while(num >= 10 && num <= 20) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        int nums = 1;
        do{
            System.out.print(nums + " ");
            nums++;
        }while(nums <= 10);
    }
}

