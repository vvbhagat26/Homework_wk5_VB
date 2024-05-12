package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char choice;
        do {
            System.out.println("enter first number");
            int a = obj.nextInt();
            System.out.println("enter second number");
            int b = obj.nextInt();
            System.out.println("enter one of +,-,*,/ symbol");
            char c = obj.next().charAt(0);
            Main obj1 = new Main();
            obj1.calculateResult(a, b, c);

            System.out.print("Would you like to do more calculations? (Y/N): ");
            choice = obj.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
    }
}


