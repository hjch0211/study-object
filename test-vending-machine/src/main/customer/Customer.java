package customer;
import menu.Menu;

public class Customer {
    private Menu menu;

    public Customer(Menu menu) {
        this.menu = menu;
    }

    public void buyItem(String toBuy) {
        menu.showItem(toBuy);
    }
}
