package entity;

public class SMSNotification implements Observer{

    private String phoneNumber;

    public SMSNotification(String email) {
        this.phoneNumber = email;
    }

    @Override
    public void update(double price) {
        System.out.println("Email enviado para " + phoneNumber + ": O novo preço da ação é " + price);
    }
}
