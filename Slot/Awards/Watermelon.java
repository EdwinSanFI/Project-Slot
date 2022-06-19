package Slot.Awards;

public class Watermelon implements Awards {
    private int fiveWatermelons = 650;
    private int fourWatermelons = 325;
    private int threeWatermelons = 160;
    private String name = "Watermelon";
    private String color = "";

    /** Return the name with spaces for the roulette*/
    public String getName(){
        return ""+name+"";
    }
    /** Return the name without spaces */
    public String getNameString(){
        return name;
    }

    /** Return the award for 5 watermelons */
    public int getFive(){
        return fiveWatermelons;
    }
    /** Return the award for 4 watermelons */
    public int getFour(){
        return fourWatermelons;
    }
    /** Return the award for 3 watermelons */
    public int getThree(){
        return threeWatermelons;
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
        return new Watermelon();
    }
}
