package app.ui;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        userMenu();
    }

    public static void userMenu() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.println(" ------ Journal Catalog System ------ ");
        try {
            do {
                System.out.println("Choose an option below");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                input = scanner.nextInt( );

                switch (input) {
                    case 1:
                        registerUser();
                        displayOptions();
                        break;
                    case 2:
                        registerUser();
                        displayOptions();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Invalid Input");
                        System.out.println( );
                }
            } while (input != 3);
        } catch (Exception e) {
            System.out.println("Invalid Input");
            System.out.println();
            userMenu();
        }
    }

    public static void registerUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");
        System.out.println( );
        System.out.println("Enter password");
        System.out.println();
        System.out.println("..........Done.........");
        System.out.println();
        // Process Queries Here
    }

    public static void userLogIn() {
        registerUser();
        // Process Queries Here
    }

    public static void displayOptions() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.println(" ------ Welcome ------ ");
        try {
            do {
                System.out.println("Choose an option below");
                System.out.println("1. Search");
                System.out.println("2. View Catalog");
                System.out.println("3. Exit");
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        search();
                        break;
                    case 2:
                        //view();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Invalid Input");
                        System.out.println( );
                }
            } while (input != 3);
        } catch (Exception e) {
            System.out.println("Invalid Input");
            System.out.println();
            displayOptions();
        }
    }

    public static void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println( );
        System.out.println("Enter registration number of the Student");
        System.out.println( );
        String searchValue = scanner.nextLine( );
        System.out.println( );
        System.out.println("---------------searching--------------------");
        System.out.println( );
        // Process Queries
    }
}
