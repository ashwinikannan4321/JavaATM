public class ATM {
    public static void main(String[] args) {
        verifyCard();
    }
}


public boolean verifyCard(String cardNumber){
    if(cardNumber.length()==16){
        return true;
        System.out.println("Card is valid");

    }
    System.out.println("card is invalid");
    return false;
    verifyPin();
}

public String verifyPin(int pinNumber){
    System.out.println("enter PIN Number");
    String pin = Integer.toString(pinNumber);
    if(pin.length()==4){
        return true;
        chooseLanguage();
    }
}

public int chooseLanguage(int languageChoice){
    switch (languageChoice){
        case 1:
            System.out.println("Tamil");
            break;
        case 2:
            System.out.println("Hindi");
            break;
        case 3:
            System.out.println("Kannada");
            break;
        case 4:
            System.out.println("Telugu");
            break;
        default:
            System.out.println("invalid option,please choose from options");
    }
    chooseOptions();
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

    private static void withdraw(double amount, double bankBalance) {
        System.out.println("Enter amount to withdraw: ");

        if (amount > 0 && amount <= bankBalance) {
            bankBalance -= amount;
            System.out.println("Withdrawal is successful.);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    private static void checkBalance(double bankBalance) {
        System.out.println("Balance details: $" + bankBalance);
    }

    private static void changePin(int enteredCurrentPin, int newPin, int currentPin) {
        System.out.println("Enter current PIN: ");

        if (enteredCurrentPin == currentPin) {
            System.out.println("Enter new PIN: ");
            currentPin = newPin;
            System.out.println("PIN changed successfully");
        } else {
            System.out.println("Incorrect current PIN, Please try again.");
        }
    }

    private static void cashDeposit(double amount) {
        System.out.println("Enter the amount to deposit: ");

        if (amount > 0) {
            bankBalance += amount;
            System.out.println("Deposit successful);
        }
        else
            System.out.println("Invalid amount. Please enter a positive value.");
    }

    private static void exit() {
        System.out.println("Thank you for using our services.");
    }


