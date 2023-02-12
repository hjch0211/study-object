package customer;

import customer.balance.*;
import menu.Menu;

public class Customer {
    private String howToPay;
    private Balance balance;

    public Customer(String howToPay) {
        this.howToPay = howToPay;
        if(howToPay === 'card') this.balance = new CardBalance();
        else if(howToPay === 'cash') this.balance = new CashBalance();
    }

    public void buyItem(Menu menu, String toBuy) {
        // menu.showItem(toBuy);
        balance.payFor(toBuy);
    }

    
}
