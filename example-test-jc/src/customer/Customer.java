import menu.Menu;

public class Customer {
    Customer(){}

    public void buyItem(Menu menu){
        menu.showItem();
    }
}

// 1. 제일 먼저 서비스 전체의 메시지를 구현 : A를 구매하라
// 2. 다음으로 A의 정보를 구현하라라는 메시지를 구현. 뒤에 작업도 이런 식으로 반복
// [!] 프로시저와 함수를 구분하자