package soju;
import item.Item;

public class Soju extends Item {
    private String name;
    private int price;

    public String getData() {
        return ("상표명 : " + this.name + "가격 : " + Integer.toString(this.price));
    }
}

