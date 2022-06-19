package Slot.Awards;

public class RedDice implements Awards {
    private int fiveDices = 100_000;
    private int fourDices = 30_000;
    private int threeDices = 15_000;
    private String name = "Red Dice";
    private String color = "";

    /** Return the name with spaces for the roulette*/
    public String getName(){
        return " "+name+" ";
    }
    /** Return the name without spaces */
    public String getNameString(){
        return name;
    }

    /** Return the award for 5 dices */
    public int getFive(){
        return fiveDices;
    }
    /** Return the award for 4 dices */
    public int getFour(){
        return fourDices;
    }
    /** Return the award for 3 dices */
    public int getThree(){
        return threeDices;
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
        return new RedDice();
    }
}