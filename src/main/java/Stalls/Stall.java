package Stalls;

import java.util.ArrayList;

public abstract class Stall { // going to implement ticketed

    protected String name;
    protected String owner;
    protected int parkingSpace;
    protected ArrayList<String> items;

    public Stall(String name, String owner, int parkingSpace){
     this.name = name;
     this.owner = owner;
     this.parkingSpace = parkingSpace;
     this.items = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String owner(){
        return this.owner;
    }

    public void setOwner(String name){
        this.owner = name;
    }

    public int getParkingSpace(){
        return this.parkingSpace;
    }

    public void addItem(String item){
        this.items.add(item);
    }

    public void removeItem(String item){
        this.items.remove(item);
    }

    public int countItems(){
        return this.items.size();
    }

}
