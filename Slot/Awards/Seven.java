package Slot.Awards;

public class Seven implements Awards {
    private int fiveSevens = 50_000;
    private int fourSevens = 25_000;
    private int threeSevens = 10_000;
    private String name = "Seven";
    private String color = "";

    /** Return the name with spaces for the roulette*/
    public String getName(){
        return "   "+name+"  ";
    }
    /** Return the name without spaces */
    public String getNameString(){
        return name;
    }

    /** Return the award for 5 sevens */
    public int getFive(){
        return fiveSevens;
    }
    /** Return the award for 4 sevens */
    public int getFour(){
        return fourSevens;
    }
    /** Return the award for 3 sevens */
    public int getThree(){
        return threeSevens;
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
        return new Seven();
    }
}
