package customer;

import customer.balance.*;
import menu.Menu;

public class Customer {
    private String howToPay;
    private Balance balance;

    public Customer(String howToPay, Number quantity) {
        this.howToPay = howToPay;
        if(howToPay === 'card') this.balance = new CardBalance(quantity);
        else if(howToPay === 'cash') this.balance = new CashBalance(quantity);
    }

    public void buyItem(Menu menu, String toBuy) {
        // menu.showItem(toBuy);
        balance.payFor(toBuy);
    }

    
}
