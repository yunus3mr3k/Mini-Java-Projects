
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transactions transactions = new Transactions();
        Data data = new Data();
        System.out.println("Welcome!");
        System.out.println("ID : ");
        int id = sc.nextInt();
        System.out.println("Password : ");
        int password = sc.nextInt();
        boolean loop = true;

//----------------------------------------------------------------------------------------------------------------------

        if (id == data.emre.getCustomerID() && password == data.emre.getCustomerPassword()) {

            while (loop) {
                transactions.article();
                int choose = sc.nextInt();
                if (choose == 1) {
                    transactions.accountInformation(data.emre);
                }
                if (choose == 2) {

                    transactions.moneyAdd(data.emre);
                }
                if (choose == 3) {
                    transactions.moneySubtract(data.emre);
                }
                if (choose == 4) {
                    transactions.changeUserInformation(data.emre);
                }
                if (choose == 5) {
                    System.out.println("Exiting the system");
                    break;
                }
            }

        }

//----------------------------------------------------------------------------------------------------------------------

        if (id == data.fatih.getCustomerID() && password == data.fatih.getCustomerPassword()) {

            while (loop) {
                transactions.article();
                int choose = sc.nextInt();
                if (choose == 1) {
                    transactions.accountInformation(data.fatih);

                }
                if (choose == 2) {

                    transactions.moneyAdd(data.fatih);
                }
                if (choose == 3) {
                    transactions.moneySubtract(data.fatih);
                }
                if (choose == 4) {
                    transactions.changeUserInformation(data.fatih);
                }
                if (choose == 5) {
                    System.out.println("Exiting the system");

                    break;

                }

            }
        }

//----------------------------------------------------------------------------------------------------------------------

        if (id == data.samet.getCustomerID() && password == data.samet.getCustomerPassword()) {

            while (loop) {
                transactions.article();
                int choose = sc.nextInt();
                if (choose == 1) {
                    transactions.accountInformation(data.samet);
                }
                if (choose == 2) {

                    transactions.moneyAdd(data.samet);
                }
                if (choose == 3) {
                    transactions.moneySubtract(data.samet);
                }
                if (choose == 4) {
                    transactions.changeUserInformation(data.samet);
                }
                if (choose == 5) {

                    System.out.println("Exiting the system");
                    break;
                }
            }

        }

//----------------------------------------------------------------------------------------------------------------------

        if (id == data.kadir.getCustomerID() && password == data.kadir.getCustomerPassword()) {

            while (loop) {
                transactions.article();
                int choose = sc.nextInt();
                if (choose == 1) {
                    transactions.accountInformation(data.kadir);
                }
                if (choose == 2) {

                    transactions.moneyAdd(data.kadir);
                }
                if (choose == 3) {
                    transactions.moneySubtract(data.kadir);
                }
                if (choose == 4) {
                    transactions.changeUserInformation(data.kadir);
                }
                if (choose == 5) {

                    System.out.println("Exiting the system");
                    break;
                }
            }

        }

//----------------------------------------------------------------------------------------------------------------------
        if (id == data.efe.getCustomerID() && password == data.efe.getCustomerPassword()) {

            while (loop) {
                transactions.article();
                int choose = sc.nextInt();
                if (choose == 1) {
                    transactions.accountInformation(data.efe);
                }
                if (choose == 2) {

                    transactions.moneyAdd(data.efe);
                }
                if (choose == 3) {
                    transactions.moneySubtract(data.efe);
                }
                if (choose == 4) {
                    transactions.changeUserInformation(data.efe);
                }
                if (choose == 5) {

                    System.out.println("Exiting the system");
                    break;
                }
            }

        }


    }
}