package Slot.Awards;

public class Clover implements Awards {
    private int fiveClovers = 2_500;
    private int fourClovers = 1_250;
    private int threeClovers = 650;
    private String name = "Clover";
    private String color = "";

    /** Return the name with spaces for the roulette*/
    public String getName(){
        return "  "+name+"  ";
    }
    /** Return the name without spaces */
    public String getNameString(){
        return name;
    }

    /** Return the award for 5 clovers */
    public int getFive(){
        return fiveClovers;
    }
    /** Return the award for 4 clovers */
    public int getFour(){
        return fourClovers;
    }
    /** Return the award for 3 clovers */
    public int getThree(){
        return threeClovers;
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
        return new Clover();
    }
}
