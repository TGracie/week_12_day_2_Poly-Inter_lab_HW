public class Rollercoaster extends Attraction implements ISecurity {

    private int heightLimit;
    private int ageLimit;
    private int length;
    private int capacity;

    public Rollercoaster(String name, int rating, int heightLimit, int ageLimit, int length, int capacity){
        super(name, rating);
        this.heightLimit = heightLimit;
        this.ageLimit = ageLimit;
        this.length = length;
        this.capacity = capacity;
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= this.getAgeLimit() && visitor.getHeight() > this.getHeightLimit()){
            return true;
        }
        return false;
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
