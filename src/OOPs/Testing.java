package OOPs;

public class Testing {
    public static void main(String[] args) {

            int[] numerators = {10, 200, 30, 40};
            int[] denominators = {1, 2, 0, 4};
            for (int i = 0; i < numerators.length; i++) {
                for (int j = 0; j < denominators.length; j++) {
                    if(i == j) System.out.println(divide(numerators[i], denominators[j]));
                    }
            }
        System.out.println("Good job");
        System.out.println("there are some code chnges done ");
        System.out.println("Hi Aman");
    }
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}
