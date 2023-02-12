package customer;
import menu.Menu;

public class Customer {
    private Menu menu;

    public Customer(Menu menu) {
        this.menu = menu;
    }

    public void buyItem(String toBuy) {
        menu.showItem(toBuy);
        // [...] 커스토머를 이렇게 사용하면 안되려나... 
        menu.buyItem(toBuy);
    }
}
