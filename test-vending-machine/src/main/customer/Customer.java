package customer;

import menu.Menu;
import customer.cardbalance.CardBalance;

public class Customer {
    public Customer() {}

    public void buyItem(Menu menu, String toBuy) {
        menu.showItem(toBuy);
        // [...] 커스토머를 이렇게 사용하면 안되려나... 
        menu.buyItem(toBuy, new CardBalance());
    }
}
