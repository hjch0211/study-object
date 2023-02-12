import customer.Customer;
import menu.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        String toBuy = "ice cream";
        Customer customer = new Customer(new Menu); // [Todo] 팩토리로 빼기
        customer.buyItem(toBuy);
    }
}
