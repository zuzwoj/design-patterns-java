package Adapters;
import java.lang.Integer;

public class Room extends Comparables.Room {
    private Secondary.Room adaptee;
    public Room(Secondary.Room adaptee) { this.adaptee = adaptee; }
    public int getNumber() { return Integer.parseInt(adaptee.Map.get("number")); }
    public void setNumber(int number) { adaptee.Map.replace("number", String.valueOf(number)); }
}