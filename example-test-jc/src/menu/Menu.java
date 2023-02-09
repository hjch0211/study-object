package menu;
import item.Item;

public class Menu {
    public void showItem(Item item) {
        String itemData = item.getData(); // [?] 적절하게 캡슐화되었나?
        System.out.println(itemData);
    }
}
