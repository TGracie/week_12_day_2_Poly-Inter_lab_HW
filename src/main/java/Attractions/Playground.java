package Attractions;

import Attractions.Attraction;

public class Playground extends Attraction { //implement security so needs something to work with that!

    private int maxAge;

    public Playground(String name, int rating, int maxAge){
        super(name, rating);
        this.maxAge = maxAge;
    }

   public int getMaxAge(){
        return this.maxAge;
   }

   public void setMaxAge(int age){
        this.maxAge = age;
   }


}
