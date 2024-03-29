package Library;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    static Scanner s;
    static Database database;

    public static void main(String[] args) {
        database = new Database();
        System.out.println("Welcome to library management system.");
        int num;
        do {
            System.out.println("\n0.Exit\n1.Login\n2. New User");
            s = new Scanner(System.in);
            num = s.nextInt();
            switch (num) {
                case 1:
                    login();
                case 2:
                    newUser();

            }
        } while (num != 0);


    }

    private static void login() {
        System.out.println("Enter your Phone number");
        String phoneNumber = s.next();
        System.out.println("Ente your email");
        String email = s.next();
        int n = database.login(phoneNumber, email);
        if (n != -1) {

            User user = database.getUser(n);
            user.menu();
        } else {
            System.out.println("User dosen't exist!");
        }
    }

    private static void newUser() {
        System.out.println("Enter your name");
        String name = s.next();
        System.out.println("Enter your phone number");
        String phoneNumber = s.next();
        System.out.println("Enter your email");
        {
            String email = s.next();
            System.out.println("1. Admin \n 2.Normal user");
            int n = s.nextInt();
            User user;
            if (n == 1) {


                user = new Admin(name, email, phoneNumber);

            } else {
                user = new NormalUser(name, email, phoneNumber);

            }
            database.AddUser(user);
            user.menu();

        }
    }
}
