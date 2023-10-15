class Box {
    private int l, b, h;

    public void detDimension(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public void sendbox()

    {
        GiftTaker gf = new GiftTaker();
        gf.acceptGift(this);

    }
}

public class Example {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setDimension(12, 10, 5);
        b1.sendbox();
    }
}