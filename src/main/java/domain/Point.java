package domain;

public class Point{
    private int value;

    public Point(int value) {
        this.value = value;
    }

    public void minus(int price) {
        value -= price;
    }
}
