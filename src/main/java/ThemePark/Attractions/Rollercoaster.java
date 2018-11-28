package ThemePark.Attractions;

import ThemePark.Interfaces.ISecurity;
import ThemePark.Interfaces.ITicketed;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {

    private int heightLimit;
    private int ageLimit;
    private int length;
    private int capacity;
    private double price;

    public Rollercoaster(String name, int rating, int heightLimit, int ageLimit, int length, int capacity, double price){
        super(name, rating);
        this.heightLimit = heightLimit;
        this.ageLimit = ageLimit;
        this.length = length;
        this.capacity = capacity;
        this.price = price;
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= this.getAgeLimit() && visitor.getHeight() > this.getHeightLimit()){
            return true;
        }
        return false;
    }

    public double defaultPrice(){
        return this.price;
    }

    public double priceForVisitor(Visitor vis){
        if(vis.getAge() < 16){
            return (this.price * 0.75);
        }
            return this.price;
    }

    public int getHeightLimit(){
        return this.heightLimit;
    }

    public void setHeightLimit(int height){
        this.heightLimit = height;
    }

    public void setAgeLimit(int age){
        this.ageLimit = age;
    }

    public int getAgeLimit(){
        return this.ageLimit;
    }

    public int getLength(){
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
