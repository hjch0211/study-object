package item;
import item.Item;

public class Snack extends Item {
    @Override
    private String type = "snack";

    public Snack(String name, Number price) {
        this.name = name;
        this.price = price;
    }
}