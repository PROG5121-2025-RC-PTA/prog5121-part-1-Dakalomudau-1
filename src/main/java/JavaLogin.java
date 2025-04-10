/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.regex.*;
/**
 *
 * @author RC_Student_lab
 */
public class JavaLogin {
    private static String FirstName;
    private static String LastName;
    private static String Username;
    private static String Password;
    private static String PhoneNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Register user
       
        FirstName = getFirstName(scanner);
        LastName = getLastName(scanner);
        Username = getUsername(scanner);
        Password = getPassword(scanner);
        PhoneNumber = getPhoneNumber(scanner);

        JOptionPane.showMessageDialog(null, "Registration successful!\n");

        // Login
        
        login(scanner);

        scanner.close();
    }

    private static String getFirstName(Scanner scanner) {
        return JOptionPane.showInputDialog("Enter your first name:");
    }

    private static String getLastName(Scanner scanner) {
        return JOptionPane.showInputDialog("Enter your last name:");
    }

    private static String getUsername(Scanner scanner) {
        while (true) {
            String username = JOptionPane.showInputDialog("Enter a username :");
            if (username != null && username.matches("^\\w{1,5}$") && username.contains("_")) {
                JOptionPane.showMessageDialog(null, "Username successfully captured.");
                return username;
            } else {
                JOptionPane.showMessageDialog(null, "Username is not correctly formatted. It must contain an underscore and be no more than five characters long.");
            }
        }
    }

    private static String getPassword(Scanner scanner) {
        while (true) {
            String password = JOptionPane.showInputDialog("Enter a password :");
            if (password != null && password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$")) {
                JOptionPane.showMessageDialog(null, "Password successfully captured.");
                return password;
            } else {
                JOptionPane.showMessageDialog(null, "Password is not correctly formatted. It must contain at least eight characters, a capital letter, a number, and a special character.");
            }
        }
    }

    private static String getPhoneNumber(Scanner scanner) {
        while (true) {
            String phone = JOptionPane.showInputDialog("Enter phone number :");
            if (phone != null && phone.matches("\\+27\\d{9,10}")) {
                JOptionPane.showMessageDialog(null, "Cell phone number successfully added.");
                return phone;
            } else {
                JOptionPane.showMessageDialog(null, "Cell phone number incorrectly formatted or does not contain the international code.");
            }
        }
    }

    private static void login(Scanner scanner) {
        while (true) {
            String username = JOptionPane.showInputDialog("Enter your username:");
            String password = JOptionPane.showInputDialog("Enter your password:");

            if (username != null && password != null && username.equals(Username) && password.equals(Password)) {
                JOptionPane.showMessageDialog(null, "Login successful! Welcome " + FirstName + " " + LastName + "it is great to see you.");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Login failed. Incorrect username or password.");
            }
        }
    }
}

