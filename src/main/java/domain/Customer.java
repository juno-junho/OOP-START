package domain;

public class Customer {
    private GiftCard giftCard;
    private Point point;

    public Customer(final GiftCard giftCard, final Point point) {
        this.giftCard = giftCard;
        this.point = point;
    }

    public GiftCard getGiftCard() {
        return giftCard;
    }
}
