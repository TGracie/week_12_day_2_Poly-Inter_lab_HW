public class Visitor {

    private int age;
    private int height;
    private double money;

    public Visitor(int age, int height, double money){
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public void setMoney(double money){
        this.money = money;
    }

    public double getMoney(){
        return this.money;
    }
}
