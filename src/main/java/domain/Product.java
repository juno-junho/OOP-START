package domain;

public class Product {
    private int price;
    private int stock;

    public Product(final int price, final int stock) {
        this.price = price;
        this.stock = stock;
    }

    public boolean isStockMin() {
        return this.stock < 5;
    }

    private void minusStock() {
        if (isStockMin()) {
            throw new RuntimeException("주문할 수 없는 상품입니다.");
        }
        this.stock -= 1;
    }

    public void payBy(Point point) {
        point.minus(price);
    }
/*
    public void payBy(Point point) {
        point.minus(price);
    }*/

    public void sellTo(Customer customer) {
        minusStock();

        // 상품 결제 로직
        customer.payFor(this);
    }


}
