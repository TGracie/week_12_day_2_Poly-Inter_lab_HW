package Stalls;

public abstract class Stall { // going to implement ticketed

    protected String name;
    protected String owner;
    protected int parkingSpace;

    public Stall(String name, String owner, int parkingSpace){
     this.name = name;
     this.owner = owner;
     this.parkingSpace = parkingSpace;
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

}