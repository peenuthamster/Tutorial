package LovePercentage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LoveCalculator lc = new LoveCalculator();
        System.out.println("Enter Male name");
        String maleName = sc.nextLine();
        System.out.println("Enter Female name");
        String femaleName = sc.nextLine();
        int maleNameLength = maleName.length();
        int femaleNameLength = femaleName.length();
        int totalNameLength = maleNameLength + femaleNameLength;
        double lovePercentage = lc.calculateLovePercentage(totalNameLength);
        System.out.println(maleName + " and " + femaleName + " have a love percentage of " + String.format("%.2f", lovePercentage) + "%");

    }
}
