package ArrayAndArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your User ID");
        String userId = sc.nextLine();
        System.out.println("Enter your full name");
        String fullName = sc.nextLine();
        System.out.println("Enter your address");
        String address = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();

        User user = new User(userId, fullName, address, age);

        user.printDetails();
        System.out.println(user.toString());
    }

    }

