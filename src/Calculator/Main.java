package Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double numb1, numb2, result;
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();


        int choice;
        do {

            System.out.println("----Simple Calculator----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            if(choice>=1 && choice<=4) {
                System.out.println("Enter first number: ");
                numb1 = sc.nextDouble();
                System.out.println("Enter second number: ");
                numb2 = sc.nextDouble();
                switch (choice) {
                    case 1:
                        result = calc.calculateAddition(numb1, numb2);
                        System.out.println("Result of Addition is: " + result);
                        break;
                    case 2:
                        result = calc.calculateSubtraction(numb1, numb2);
                        System.out.println("Result of Subtraction is: " + result);
                        break;
                    case 3:
                        result = calc.calculateMultiplication(numb1, numb2);
                        System.out.println("Result of Multiplication is: " + result);
                        break;
                    case 5:
                        result = calc.calculateDivision(numb1, numb2);
                        System.out.println("Result of Division is: " + result);
                        break;
                }
            }
            else if (choice!=5){
                System.out.println("Invalid choice");
            }

        } while (choice != 5);
        System.out.println("Exiting Program......");
        System.exit(0);




    }
}
