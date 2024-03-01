import java.util.Scanner;

public class ATM {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isCardValid = false;
    private static boolean isPinValid = false;
    private static int currentPin = 1234;
    private static double bankBalance = 1000;



    public static void main(String[] args) {
        insertCard();
        if (isCardValid) {
            verifyPin();
            if (isPinValid) {
                chooseLanguage();
                chooseOptions();
            }
        }
        exit();
    }
}


private static void insertCard() {
    System.out.println("Please insert the card");
    isCardValid = true;
}


public static void verifyPin(){
    System.out.println("Verification of pin number");
    System.out.print("Enter your PIN: ");
    int enteredPin = scanner.nextInt();

    if (enteredPin == currentPin) {
        isPinValid = true;
        System.out.println("PIN verification successful");
    } else {
        System.out.println("Entered PIN is invalid. Please try again.");
    }
}


public static int chooseLanguage(){
    System.out.println("Choose the language:");
    System.out.println("1. Tamil");
    System.out.println("2. Hindi");
    System.out.println("3. Kannada");
    System.out.println("4. Telugu");
}

public static int chooseOptions(int option) {
    System.out.println("Choose the options:");
    System.out.println("1. Withdraw");
    System.out.println("2. Check balance");
    System.out.println("3. Change Pin");
    System.out.println("4. Cash Deposit");

    switch (option) {
        case 1:
            withdraw();
            break;
        case 2:
            checkBalance();
            break;
        case 3:
            changePin();
            break;
        case 4:
            cashDeposit();
            break;
        default:
            System.out.println("Invalid option. Please try again.");
    }

    private static void withdraw() {
        System.out.println("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= bankBalance) {
            bankBalance -= amount;
            System.out.println("Withdrawal is successful");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    private static double checkBalance(double bankBalance) {
        System.out.println("Balance details: $" + bankBalance);
    }

    private static int changePin() {
        System.out.println("Enter current PIN: ");
        int enteredCurrentPin = scanner.nextInt();

        if (enteredCurrentPin == currentPin) {
            System.out.println("Enter new PIN: ");
            currentPin = newPin;
            System.out.println("PIN changed successfully");
        } else {
            System.out.println("Incorrect current PIN, Please try again.");
        }
    }

    private static double cashDeposit() {
        System.out.println("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            bankBalance += amount;
            System.out.println("Deposit successful");
        }
        else
            System.out.println("Invalid amount. Please enter a positive value");
    }

    private static void exit() {
        System.out.println("Thank you for using our services");
    }


