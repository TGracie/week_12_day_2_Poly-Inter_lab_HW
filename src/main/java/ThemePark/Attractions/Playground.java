package ThemePark.Attractions;

import ThemePark.Interfaces.ISecurity;
import ThemePark.Visitor;

public class Playground extends Attraction implements ISecurity { //implement security so needs something to work with that!

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

   public boolean isAllowedTo(Visitor vis){
        if(vis.getAge() >= 15){
            return false;
        }
        return true;
   }


}
