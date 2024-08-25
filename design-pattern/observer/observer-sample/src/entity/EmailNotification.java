package entity;

public class EmailNotification implements Observer{

    private String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void update(double price) {
        System.out.println("Email enviado para " + email + ": O novo preço da ação é " + price);
    }
}
