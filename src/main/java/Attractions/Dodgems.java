package Attractions;

import Attractions.Attraction;

public class Dodgems extends Attraction {
    private int capacity;
    private int heightLimit;

    public Dodgems(String name, int rating, int capacity, int heightLimit){
        super(name, rating);
        this.capacity = capacity;
        this.heightLimit = heightLimit;
    }

    public void setHeightLimit(int height){
        this.heightLimit = height;
    }

    public int getHeightLimit(){
        return this.heightLimit;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
