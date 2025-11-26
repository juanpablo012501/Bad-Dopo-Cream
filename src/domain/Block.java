package Domain;

/**
 * @author Paula Alejandra Díaz (PAD)
 * @author Juan Pablo Vélez (JPV)
 */
public abstract class Block {

    protected int xPosition;
    protected int yPosition;

    public Block(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public int getxPosition() {
        return xPosition;
    }
    public int getyPosition() {
        return yPosition;
    }
}