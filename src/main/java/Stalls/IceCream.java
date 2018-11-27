package Stalls;

import java.util.ArrayList;

public class IceCream extends Stall {

    private ArrayList<String> flavours;

    public IceCream(String name, String owner, int parkingSpace){
        super(name,owner,parkingSpace);
        this.flavours = new ArrayList<>();
    }

    public void addFlavour(String flavour){
        this.flavours.add(flavour);
    }

    public void removeFlavour(String flavour){
        this.flavours.remove(flavour);
    }

    public int countFlavours(){
        return this.flavours.size();
    }

}
