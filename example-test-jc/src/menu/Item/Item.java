package item;

public abstract class Item {
    private String name;
    private int price;

    // [?] return까지 만들어 줬는데 이게 추상 클래스 맞나?
    public String getData() {
        return ("상표명 : " + this.name + "가격 : " + Integer.toString(this.price));
    }
}
