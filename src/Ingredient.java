import java.util.UUID;

public class Ingredient extends Entity{

    private String name;
    private double price;
    
    public Ingredient(){
    }

    public Ingredient(UUID id, String name, double prize){
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
