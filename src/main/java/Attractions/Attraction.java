package Attractions;

public abstract class Attraction { // going to implement IReviewed

    protected String name;
    protected int rating;

    public Attraction(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    public String getName(){
        return this.name;
    }

    public int getRating(){
        return this.rating;
    }
}