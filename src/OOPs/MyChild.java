package OOPs;


import java.util.Scanner;

public class MyChild extends  MyClass {

    public void logicInCal() {
        System.out.println("Launch Rocket");
        System.out.println();
    }

}

class child2 implements Shapes,Color {

    public void display() {
        System.out.println("Interface ka working/ 100% abstraction ");
    }
    public void color() {
        System.out.println("Painting started");
    }
}
class Phone implements Mobile,Bluetooth,Camera,Operations {

    public void Show() {
        System.out.println("Phone is running");
        System.out.println("________Functions Available________");
        System.out.println("1.Connect to Bluetooth");
        System.out.println("2.Connect to Camera");
        System.out.println("3.Connect to Calculation");
        System.out.println("4.Connect to Google search");
        System.out.println("5.Exit");
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Connecting to bluetooth");
                Connect();
                break;
            case 2:
                System.out.println("Connecting to camera");
                Click();
                break;
            case 3:
                System.out.println("Ready for calculation");
                calculate();
                break;
                case 4:
                    System.out.println("Ready for google Search");
                    googleSearch();
                    break;
                    case 5:
                        System.out.println("Exiting....");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
        }
    }

    public void  Connect() {
        System.out.println("Bluetooth Connected");
    }

    public void  Click() {
        System.out.println("Photo Clicked");
    }

    public void calculate() {
        System.out.println("Calculation under process");
    }
    public void googleSearch() {
        System.out.println("Type what you want to search");
    }
}