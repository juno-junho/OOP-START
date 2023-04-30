package domain;

public class Customer {
    private GiftCard giftCard;
    private Point point;

    public Customer(final GiftCard giftCard) {
        this.giftCard = giftCard;
    }

    public void payFor(Product product) {
        product.payBy(this.giftCard);
        product.payBy(this.point);
    }

}
