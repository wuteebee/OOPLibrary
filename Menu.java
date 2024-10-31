import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    static public void mainMenu() {
        int choice = 0;
        boolean looping = true;
        while (looping) {
            System.out.println("\n0. Stopping operating menu");
            System.out.println("1. System");
            System.out.println("2. Manager");
            System.out.println("3. Employee");
            System.out.println("4. Client");
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    looping = false;
                    System.out.println("Stop operating...");
                    break;
                case 1:
                    systemMenu();
                    break;
                case 2:
                    managerMenu();
                    break;
                case 3:
                    employeeMenu();
                    break;
                case 4:
                    clientMenu();
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again:");
                    break;
            }
        }
        input.close();
    }

    static public void systemMenu() {
        int choice = 0;
        boolean looping = true;
        while (looping) {
            System.out.println("\n0. Stop operating system menu");
            System.out.println("1. Create manager");
            System.out.println("2. Create employee");
            System.out.println("3. Create client");
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Stopping operating...");
                    looping = false;
                    break;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again:");
                    break;
            }
        }
    }

    static public void managerMenu() {
        int choice = 0;
        boolean looping = true;
        while (looping) {
            System.out.println("\n0. Stop operating manager menu");
            System.out.println("1. Create employee accounts");
            System.out.println("2. View employees");
            System.out.println("3. View clients");
            System.out.println("4. Check out books");
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Stopping operating...");
                    looping = false;
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again:");
                    break;
            }
        }
    }

    static public void employeeMenu() {
        int choice = 0;
        boolean looping = true;
        while (looping) {
            System.out.println("\n0. Stop operating employee menu");
            System.out.println("1. View employees");
            System.out.println("2. View clients");
            System.out.println("3. Check out books");
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Stopping operating...");
                    looping = false;
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again:");
                    break;
            }
        }
    }

    static void clientMenu() {
        int choice = 0;
        boolean looping = true;
        while (looping) {
            System.out.println("\n0. Stop operating client menu");
            System.out.println("1. View books");
            System.out.println("2. Borrow books");
            System.out.println("3. Return books");
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Stopping operating...");
                    looping = false;
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again:");
                    break;
            }
        }
    }
}
