package customer.balance;

public abstract class Balance {
    private String type;
    private Number quantity;

    public Balance(Number quantity) {
        this.quantity = quantity;
    }

    public void payFor(String toBuy);
}
