package app.ui;

import app.logic.ProcessQueries;
import app.model.User;

import java.sql.SQLException;
import java.util.Scanner;

public class UiBehaviour {

    ProcessObjects processObjects = new ProcessObjects();
    ProcessQueries processQueries = new ProcessQueries();

    public UiBehaviour() throws ClassNotFoundException {
    }

    public static String[] userHelper() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");
        String user = scanner.nextLine();
        System.out.println( );
        System.out.println("Enter password");
        String passwd = scanner.nextLine();
        System.out.println("Enter email");
        String email = scanner.nextLine();
        System.out.println();
        return new String[]{user,passwd,email};
    }

    public void registerUser() throws SQLException, ClassNotFoundException {
        String[] input = userHelper();
        boolean newUser = processQueries.register(processObjects.createUser(input));
        if (newUser) {
            System.out.println("...Success...");
        }else {
            System.out.println("User already exists");
            System.out.println();
            userLogIn();
        }
        System.out.println();
    }

    public void userLogIn() throws SQLException, ClassNotFoundException {
        String[] input = userHelper();
        User user = processObjects.createUser(input);
        boolean userExists = processQueries.login(user);
        boolean passwordsMatch = processQueries.checkPassword(user);
        if (userExists & passwordsMatch) {
            System.out.println("...Success...");
        }else if (userExists & !passwordsMatch){
            System.out.println("Incorrect password!");
            System.out.println();
            userLogIn();
        } else {
            System.out.println("User does not exist.Create a new user");
            System.out.println( );
            registerUser( );
        }
    }

    public void viewCatalog() {}


    public void displayOptions() {
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

