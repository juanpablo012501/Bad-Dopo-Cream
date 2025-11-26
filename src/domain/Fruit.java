package Domain;

/**
 * @author Paula Alejandra Díaz (PAD)
 * @author Juan Pablo Vélez (JPV)
 */
public class Fruit implements Movable {

    private String type;
    private int xPosition;
    private int yPosition;

    public Fruit(String type, int x, int y) {
        this.type = type;
        this.xPosition = x;
        this.yPosition = y;
    }

    public String getType() {
        return type;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }
}