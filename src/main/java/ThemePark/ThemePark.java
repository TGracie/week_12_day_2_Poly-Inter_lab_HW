package ThemePark;

import ThemePark.Interfaces.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> reviewed;

    public ThemePark(String name){
        this.name = name;
        this.reviewed = new ArrayList<>();
    }

    public void addReviewed(IReviewed thing){
        this.reviewed.add(thing);
    }

    public ArrayList getAllReviewed(){
        return this.reviewed;
    }

    public int countReviewed(){
        return this.reviewed.size();
    }
}
