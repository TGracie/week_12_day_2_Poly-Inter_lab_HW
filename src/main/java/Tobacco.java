public class Tobacco extends Stall implements ISecurity{

    public Tobacco(String name, String owner, int parkingSpace, int rating){
        super(name, owner, parkingSpace, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 18){
            return true;
        }else{
            return false;
        }
    }
}
