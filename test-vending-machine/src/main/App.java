import customer.Customer;
import menu.Menu;
import item.*;

public class App {
    public static void main(String[] args) throws Exception {
        String toBuy = "구구콘";
        String howToPay = "card";

        Menu menu = new Menu();
        menu.registerItem(new IceScream("구구콘", 1200, 1));
        menu.registerItem(new Snack("꼬칼콘", 1500, 1));
        menu.registerItem(new Soju("참이슬", 1800, 1));

        Customer customer = new Customer(howToPay, 1600); // [Todo] 팩토리로 빼기

        customer.buyItem(menu, toBuy);
    }
}
