package app.ui;

import app.logic.ProcessQueries;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    UiBehaviour uiBehaviour = new UiBehaviour();

    public Main() throws ClassNotFoundException {
    }


    public static void main(String[] args) throws ClassNotFoundException {
       Main main = new Main();
       main.userMenu();
    }

    public void userMenu() {
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
                        uiBehaviour.registerUser();
                        uiBehaviour.userLogIn();
                        uiBehaviour.displayOptions();
                        break;
                    case 2:
                        uiBehaviour.userLogIn();
                        uiBehaviour.displayOptions();
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
            System.out.println( );
            userMenu( );
        }
    }
}

