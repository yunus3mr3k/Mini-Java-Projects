package com.example.atmv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


public class HelloController {

    Data data = new Data();
    Account tempAccount;

    @FXML
    private Text addMoneyInformation;

    @FXML
    private Text withdrawalInformation;

    @FXML
    private TextField addFreeInput;

    @FXML
    private Pane addMoneyPane;

    @FXML
    private Pane boardMenu;

    @FXML
    private TextField guestID;

    @FXML
    private PasswordField guestPassword;

    @FXML
    private Text informationText;

    @FXML
    private Text textRight;

    @FXML
    private TextField withdrawalFreeInput;

    @FXML
    private Button withdrawalOneThousand;

    @FXML
    private Pane withdrawalPane;

    @FXML
    void entryButton(ActionEvent event) {
        if (guestID.getText().isEmpty() || guestPassword.getText().isEmpty()) {
            textRight.setText("Kullanıcı ID ya da Şifre Boş Olamaz");
            return;
        }
        try {
            int enteredID = Integer.parseInt(guestID.getText().trim()); // trim boşlukları siler
            int enteredPassword = Integer.parseInt(guestPassword.getText().trim());

            boolean isAuthenticated = false;

            for (int i = 0; i < data.accounts.size(); i++) {

                if ((enteredID == data.accounts.get(i).getCustomerID()) && (enteredPassword == data.accounts.get(i).getCustomerPassword())) {
                    isAuthenticated = true;
                    tempAccount = data.accounts.get(i);
                    boardMenu.setVisible(true);
                    break;

                }

            }
            if (!isAuthenticated) {
                textRight.setText("Giriş Başarısız");
            }

        } catch (NumberFormatException e) {
            // Eğer girilen değerler int'e dönüştürülemezse (örneğin harf girilmişse)
            textRight.setText("Şifre Ve Kullanıcı ID Sadece Rakam Olmalıdır");
        }
    }

    @FXML
    void getGuestInformations(ActionEvent event) {
        informationText.setText("Kullanıcı ID : " + tempAccount.getCustomerID()
                + "\nŞifre : " + tempAccount.getCustomerPassword()
                + "\nAd : " + tempAccount.getCustomerName()
                + "\nTelefon Numarası : " + tempAccount.getCustomerPhoneNumber()
                + "\nE-mail : " + tempAccount.getCustomerEmail());
    }

    @FXML
    void getBalance(ActionEvent event) {
        informationText.setText("Bakiyeniz : ₺" + tempAccount.getCustomerBalance());
    }

    @FXML
    void addMoney(ActionEvent event) {
        addMoneyPane.setVisible(true);
        addMoneyInformation.setText("Bakiyeniz : ₺" + tempAccount.getCustomerBalance());
    }

    @FXML
    void addOneHundred(ActionEvent event) {
        tempAccount.setCustomerBalance(tempAccount.getCustomerBalance() + 100);
        addMoneyInformation.setText("₺100 Hesabınıza eklendi"
                + "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
    }

    @FXML
    void addTwoHundred(ActionEvent event) {
        tempAccount.setCustomerBalance(tempAccount.getCustomerBalance() + 200);
        addMoneyInformation.setText("₺200 Hesabınıza eklendi"
                + "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
    }

    @FXML
    void addFiveHundred(ActionEvent event) {
        tempAccount.setCustomerBalance(tempAccount.getCustomerBalance() + 500);
        addMoneyInformation.setText("₺500 Hesabınıza eklendi"
                + "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
    }

    @FXML
    void addOneThousand(ActionEvent event) {
        tempAccount.setCustomerBalance(tempAccount.getCustomerBalance() + 1000);
        addMoneyInformation.setText("₺1000 Hesabınıza eklendi"
                + "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
    }

    @FXML
    void addTwoThousand(ActionEvent event) {
        tempAccount.setCustomerBalance(tempAccount.getCustomerBalance() + 2000);
        addMoneyInformation.setText("₺2000 Hesabınıza eklendi"
                + "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
    }

    @FXML
    void addFree(ActionEvent event) {
        tempAccount.setCustomerBalance(tempAccount.getCustomerBalance() + Double.parseDouble(addFreeInput.getText().trim()));
        addMoneyInformation.setText("₺" + addFreeInput.getText().trim() + " hesabınıza eklendi"
                + "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance()
        );
        addFreeInput.setText("");
    }

    @FXML
    void exitAddMoney(ActionEvent event) {
        addMoneyPane.setVisible(false);
        informationText.setText("");
    }

    @FXML
    void withdrawalMoney(ActionEvent event) {
        withdrawalPane.setVisible(true);
        withdrawalInformation.setText("Bakiyeniz : ₺" + tempAccount.getCustomerBalance());
    }

    @FXML
    void withdrawalOneHundred(ActionEvent event) {
        if (tempAccount.getCustomerBalance() >= 100) {
            tempAccount.setCustomerBalance(tempAccount.getCustomerBalance() - 100);
            withdrawalInformation.setText("₺100 çekildi"
                    + "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
        } else {
            withdrawalInformation.setText("Bakiyeniz yetersiz" +
                    "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
        }


    }

    @FXML
    void withdrawalTwoHundred(ActionEvent event) {
        if (tempAccount.getCustomerBalance() >= 200) {
            tempAccount.setCustomerBalance(tempAccount.getCustomerBalance() - 200);
            withdrawalInformation.setText("₺200 çekildi"
                    + "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
        } else {
            withdrawalInformation.setText("Bakiyeniz yetersiz" +
                    "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
        }
    }

    @FXML
    void withdrawalFiveHundred(ActionEvent event) {
        if (tempAccount.getCustomerBalance() >= 500) {
            tempAccount.setCustomerBalance(tempAccount.getCustomerBalance() - 500);
            withdrawalInformation.setText("₺500 çekildi"
                    + "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
        } else {
            withdrawalInformation.setText("Bakiyeniz yetersiz" +
                    "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
        }
    }

    @FXML
    void withdrawalOneThousand(ActionEvent event) {
        if (tempAccount.getCustomerBalance() >= 1000) {
            tempAccount.setCustomerBalance(tempAccount.getCustomerBalance() - 1000);
            withdrawalInformation.setText("₺1000 çekildi"
                    + "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
        } else {
            withdrawalInformation.setText("Bakiyeniz yetersiz" +
                    "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
        }
    }

    @FXML
    void withdrawalTwoThousand(ActionEvent event) {
        if (tempAccount.getCustomerBalance() >= 2000) {
            tempAccount.setCustomerBalance(tempAccount.getCustomerBalance() - 2000);
            withdrawalInformation.setText("₺2000 çekildi"
                    + "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
        } else {
            withdrawalInformation.setText("Bakiyeniz yetersiz" +
                    "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
        }
    }

    @FXML
    void withdrawalFree(ActionEvent event) {
        if (tempAccount.getCustomerBalance() >= Double.parseDouble(withdrawalFreeInput.getText())) {
            tempAccount.setCustomerBalance(tempAccount.getCustomerBalance() - Double.parseDouble(withdrawalFreeInput.getText().trim()));
            withdrawalInformation.setText(withdrawalFreeInput.getText().trim() + "₺ çekildi."
                    + "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
            withdrawalFreeInput.setText("");
        } else {
            withdrawalInformation.setText("Bakiyeniz yetersiz" +
                    "\nBakiyeniz : ₺" + tempAccount.getCustomerBalance());
            withdrawalFreeInput.setText("");

        }
    }

    @FXML
    void exitWithdrawalMoney(ActionEvent event) {
        withdrawalPane.setVisible(false);
        informationText.setText("");

    }


    @FXML
    void exitButton(ActionEvent event) {
        boardMenu.setVisible(false);
        guestID.setText("");
        guestPassword.setText("");
        textRight.setText("Hoş Geldiniz");
    }

}
