package Slot.Awards;

public class Grape implements Awards {
    private int fiveGrapes = 650;
    private int fourGrapes = 325;
    private int threeGrapes = 160;
    private String name = "Grape";
    private String color = "";

    /** Return the name with spaces for the roulette*/
    public String getName() {
        return "   "+name+"  ";
    }
    /** Return the name without spaces */
    public String getNameString(){
        return name;
    }

    /** Return the award for 5 grapes */
    public int getFive(){
        return fiveGrapes;
    }
    /** Return the award for 4 grapes */
    public int getFour(){
        return fourGrapes;
    }
    /** Return the award for 3 grapes */
    public int getThree(){
        return threeGrapes;
    }

    /** Getter and setter for the color of the object */
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    /** Design Pattern PROTOTYPE */
    public Awards clone() {
        return new Grape();
    }
}