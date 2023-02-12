package customer;

public class Customer {
    private Menu menu;

    Customer(Menu menu) {
        this.menu = menu;
    }

    public void buyItem(String toBuy) {
        menu.showItem(toBuy);
    }
}
