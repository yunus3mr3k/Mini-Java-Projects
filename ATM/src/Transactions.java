import java.util.Scanner;

public class Transactions {

    Scanner keyboard = new Scanner(System.in);

    public void article() {
        System.out.println("---------------------------");
        System.out.println("1-Seeing account information");
        System.out.println("2-Withdrawal");
        System.out.println("3-Deposit");
        System.out.println("4-Change user information");
        System.out.println("5-Exit");
        System.out.println("---------------------------");
        System.out.println("Select transaction : ");
    }


    public void accountInformation(Account account) {
        System.out.println("Name : " + account.getCustomerName());
        System.out.println("Balance : " + account.getCustomerBalance());
        System.out.println("Email : " + account.getCustomerEmail());
        System.out.println("Password : " + account.getCustomerPassword());
        System.out.println("Phone Number : " + account.getCustomerPhoneNumber());
    }

    public void moneyAdd(Account account) {

        System.out.println("Balance : " + account.getCustomerBalance());
        System.out.println("Enter the amount you want to deposit : ");
        double money = keyboard.nextDouble();
        account.setCustomerBalance(account.getCustomerBalance() + money);
        System.out.println("Your new balance : " + account.getCustomerBalance());

    }

    public void moneySubtract(Account account) {

        System.out.println("Balance : " + account.getCustomerBalance());
        System.out.println("Enter the amount you want to withdraw : ");
        double money = keyboard.nextDouble();
        if (money > account.getCustomerBalance()) {
            System.out.println("Your balance is insufficient.");
            System.out.println("Your current balance : " + account.getCustomerBalance());
        }
        if (money <= account.getCustomerBalance()) {
            double customerBalance = account.getCustomerBalance() - money;
            account.setCustomerBalance(customerBalance);
            System.out.println("Your new balance : " + customerBalance);
        }

    }


    public void changeUserInformation(Account account) {

        System.out.println("1-Change name");
        System.out.println("2-Change E-mail");
        System.out.println("3-Change password");
        System.out.println("4-Change phone number");
        System.out.println("5-Change ID ");

        int choice = keyboard.nextInt();
        if (choice == 1) {
            changeName(account);
        }
        if (choice == 2) {
            changeEmail(account);
        }
        if (choice == 3) {
            changePassword(account);
        }
        if (choice == 4) {
            changePhoneNumber(account);
        }
        if (choice == 5) {
            changeID(account);
        }


    }

    public void changeID(Account account) {

        System.out.println("Enter ID : ");
        int id = keyboard.nextInt();
        account.setCustomerID(id);
        System.out.println("Your new ID : " + account.getCustomerID());
    }

    public void changePhoneNumber(Account account) {
        keyboard.nextLine();
        System.out.println("Enter the phone number : ");
        String phoneNumber = keyboard.nextLine();
        account.setCustomerPhoneNumber(phoneNumber);
        System.out.println("Your new phone number : " + account.getCustomerPhoneNumber());
    }

    public void changeName(Account account) {

        System.out.println("Enter the name : ");
        String name = keyboard.next();
        account.setCustomerName(name);
        System.out.println("Your new name : " + account.getCustomerName());
    }

    public void changeEmail(Account account) {

        System.out.println("Enter the email : ");
        String email = keyboard.next();
        account.setCustomerEmail(email);
        System.out.println("Your new email : " + account.getCustomerEmail());
    }

    public void changePassword(Account account) {

        System.out.println("Enter the old password : ");
        int oldPassword = keyboard.nextInt();
        if (oldPassword == account.getCustomerPassword()) {
            System.out.println("Enter your new password.");
            int newPassword = keyboard.nextInt();
            account.setCustomerPassword(newPassword);
            System.out.println("Your new password : " + account.getCustomerPassword());

        }
    }

}

