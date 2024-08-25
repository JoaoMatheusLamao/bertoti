import entity.EmailNotification;
import entity.Observer;
import entity.SMSNotification;
import entity.Stock;

public class Main {
    public static void main(String[] args) {
        Stock googleStock = new Stock();

        Observer emailObserver = new EmailNotification("user@example.com");
        Observer smsObserver = new SMSNotification("+123456789");

        googleStock.addObserver(emailObserver);
        googleStock.addObserver(smsObserver);

        googleStock.setPrice(1500.00);
        googleStock.setPrice(1600.00);
    }
}