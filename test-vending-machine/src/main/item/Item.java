package item;

public abstract class Item {
    private String type;
    private String name;
    private Number price;
    private Number stock;

    public Item(String name, Number price, Number stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public Number getPrice() {
        return this.price;
    }

    public Number getStock() {
        return this.stock;
    }
}