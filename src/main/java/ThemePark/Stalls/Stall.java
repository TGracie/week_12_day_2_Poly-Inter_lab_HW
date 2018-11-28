package ThemePark.Stalls;

import ThemePark.Interfaces.IReviewed;

import java.util.ArrayList;

public abstract class Stall implements IReviewed { // going to implement ticketed

    protected String name;
    protected String owner;
    protected int parkingSpace;
    protected int rating;
    protected ArrayList<String> items;

    public Stall(String name, String owner, int parkingSpace, int rating){
     this.name = name;
     this.owner = owner;
     this.parkingSpace = parkingSpace;
     this.rating = rating;
     this.items = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getRating(){
        return this.rating;
    }

    public String getOwner(){
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
