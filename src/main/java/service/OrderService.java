package service;

import domain.Customer;
import domain.Product;

public class OrderService {

    public void order(Customer customer, Product product) {
        // 상품 관리 로직
        /**
         * 재고 관련 로직은 송신자에서 처리하면 안된다.
         * product에게 내부 상태를 물어 보고 하는게 아니라
         * product에서 알아서 하도록 설정해야 한다.
         * -> 내부 상태를 물어보는 것이 아니라 시키고 알아서 하게 해라
         */
//        if (product.isStockMin()) {
//            throw new RuntimeException("주문할 수 없는 상품입니다.");
//        }
        /**
         * 여러번 감소시키거나 여러번 customer 가 지불해도 아무런 문제가 발생하지 않는다.
         * 호출 하는 쪽에서 side effect 안터지게끔
         */
        product.sellTo(customer);
//        product.minusStock();
//
//        // 상품 결제 로직
//        customer.payFor(product);
    }
}
