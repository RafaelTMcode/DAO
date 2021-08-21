import java.util.UUID;

public class Ingredient {

    private UUID id;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
