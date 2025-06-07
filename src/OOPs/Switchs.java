package OOPs;

import java.util.Scanner;

public class Switchs {
    public static void main(String[] args) {
        String choice;
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextLine();
        switch (choice) {
            case "Naman":
                System.out.println("Naman is pursuing civil engg");
                break;
            case "Aman":
                System.out.println("Aman has completed his degree of engg");
                break;
            case "khuduk":
                System.out.println("Khuduk is willing to pursue Hotel management");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
