package Slot.Awards;

public interface Awards {
    /** Get the 3 possible awards */
    public int getThree();
    public int getFour();
    public int getFive();

    /** Set and get the name of the object */
    public String getName();
    public String getNameString();

    /** Set and get the color of the object */
    public String getColor();
    public void setColor(String color);

    /** Design Pattern Prototype */
    public Awards clone();
}