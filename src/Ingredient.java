public class Ingredient {


    private String name;
    private double price;
    
    public Ingredient(){
    }

    public Ingredient(String name, double prize){
        this.name = name;
        this.price = prize;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double prize){
        this.price = prize;
    }
}
