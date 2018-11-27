package Attractions;

import Attractions.Attraction;

public class Rollercoaster extends Attraction {

    private int heightLimit;
    private int length;
    private int capacity;

    public Rollercoaster(String name, int rating, int heightLimit, int length, int capacity){
        super(name, rating);
        this.heightLimit = heightLimit;
        this.length = length;
        this.capacity = capacity;
    }

    public int getHeightLimit(){
        return this.heightLimit;
    }

    public void setHeightLimit(int height){
        this.heightLimit = height;
    }

    public int getLength(){
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
