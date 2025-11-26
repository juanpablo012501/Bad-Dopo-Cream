package Domain;

/**
 * @author Paula Alejandra Díaz (PAD)
 * @author Juan Pablo Vélez (JPV)
 */
public abstract class Enemy implements Breaker, Movable {

    private String type;
    private int xPosition;
    private int yPosition;
    private boolean automatic;

    public Enemy(String color, int x, int y) {
        this.color = type;
        this.xPosition = x;
        this.yPosition = y;
    }
}

