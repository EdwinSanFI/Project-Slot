package Slot.Awards;

public class Cherry implements Awards {
    private int fiveCherrys = 1_500;
    private int fourCherrys = 1_000;
    private int threeCherrys = 600;
    private String name = "Cherry";
    private String color = "";

    /** Return the name with spaces for the roulette*/
    public String getName(){
        return "  "+name+"  ";
    }
    /** Return the name without spaces */
    public String getNameString(){
        return name;
    }

    /** Return the award for 5 cherrys */
    public int getFive(){
        return fiveCherrys;
    }
    /** Return the award for 4 cherrys */
    public int getFour(){
        return fourCherrys;
    }
    /** Return the award for 3 cherrys */
    public int getThree(){
        return threeCherrys;
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
        return new Cherry();
    }
}
