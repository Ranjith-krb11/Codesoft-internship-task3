//currencyConvertor

import java. util.Scanner;


public class currencyConverter {

    public static void main(String[] args) {
        System.out.println("1 Ruppe");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
    System.out.println("4.exit");
        
        Scanner sc = new Scanner(System.in);
        System. out.println("Choose from the choices:");
        int choice = sc.nextInt();
                switch (choice) {
            case 1:
                Ruppe_to_other();
                break;
            case 2:
                Dollar_to_other();
                break;
            case 3:
                Euro_to_other();
                break;
            case 4:
                System.out.println("Thanks for using us!!! convert all gain all!!!");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

public static void Ruppe_to_other() {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount");
        double amt = sc.nextDouble();
    System.out.println("1 Ruppe = " + 0.013 + " Dollar");
    System.out.println();

    System.out.println(amt+" Ruppe = " + (amt*0.013) + " Dollar");
    System.out.println();

    System.out.println("1 Ruppe = " + 0.012 + " Euro");
    System.out.println();
    System.out.println(amt+" Ruppe = " + (amt*0.012) + " Euro");
    System.out.println();

}
    

public static void Dollar_to_other() {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount");
        double amt = sc.nextDouble();
    System.out.println("1 Dollar = " + 79.37 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Dollar = " + (amt*79.37) + " Ruppe");
    System.out.println();

    System.out.println("1 Dollar= " + 0.98 + " Euro");
    System.out.println();

    System.out.println(amt+" Dollar = " + (amt*0.98) + " Euro");
}

    

public static void Euro_to_other(){
     Scanner sc = new Scanner(System.in);
      System.out.println("Enter the amount");
        double amt = sc.nextDouble();
    System.out.println("1 Euro = " + 80.85 + " Ruppe");
    System.out.println();
    System.out.println(amt+" Euro = " + (amt*80.85) + " Ruppe");
    System.out.println();

    System.out.println("1 Euro = " + 1.02 + " Dollar");
    System.out.println();

    System.out.println(amt+" Euro = " + (amt*1.02) + " Dollar");
}
}