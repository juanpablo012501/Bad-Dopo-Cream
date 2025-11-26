package Domain;

/**
 * @author Paula Alejandra Díaz (PAD)
 * @author Juan Pablo Vélez (JPV)
 */
public class IceCream implements Frezzer, Breaker, Movable {

    private String color;
    private int xPosition;
    private int yPosition;

    public IceCream(String color, int x, int y) {
        this.color = color;
        this.xPosition = x;
        this.yPosition = y;
    }

    public String getColor() {
        return color;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }
}