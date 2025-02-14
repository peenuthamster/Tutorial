package SimpleInterest;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {


        double simpleInterest,compoundInterest;
        Scanner sc = new Scanner(System.in);
        InterestCalculator intCalc = new InterestCalculator();
        System.out.println("Enter principle amount");
        double principle = sc.nextDouble();
        System.out.println("Enter rate");
        double rate = sc.nextDouble();
        System.out.println("Enter time");
        double time = sc.nextDouble();

        System.out.println("What do you want to calculate????????");
        System.out.println("1. Simple Interset");
        System.out.println("2. Compound Interest");
        System.out.println("3. Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                 simpleInterest = intCalc.calculateSimpleInterest(principle, rate, time);
                System.out.println("Simple Interest: " + simpleInterest);
                break;
            case 2:
                 compoundInterest = intCalc.calculateCompoundInterest(principle, rate, time);
                System.out.println("Compound Interest: " + compoundInterest);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");}


    }
}
