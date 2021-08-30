import java.util.UUID;

public class App {

    public static void main(String[] args) throws Exception {

        UUID ingredientID = UUID.randomUUID();
        Ingredient ingredient = new Ingredient();
        ingredient.setId(ingredientID);
        ingredient.setName("Cheese");
        ingredient.setPrice(1.5);


    EntityManagerImp.buildConnection(ConfigurationImp.getConfiguration())
        .addStatement(ingredient, "INSERT INTO ingredient(id, name, price) VALUES(?, ?, ?)", (statement, entity) ->{
            statement.setInt(1, 4444);
            statement.setString(2, entity.getName());
            statement.setDouble(3, entity.getPrice());
        })
        .save();

        System.out.println("Ingrediente insertado: " + ingredient.getName());
        
        
        Ingredient ingredient1 = EntityManagerImp.buildConnection(ConfigurationImp.getConfiguration())
                                                 .addStatement(ingredient, "SELECT id, name, price FROM ingredient WHERE id=?", (statement, entity) -> {
                                                    statement.setInt(1, 4444);
                                                 })
                                                 .select(Ingredient.class, (resultSet, entity) -> {
                                                    entity.setId(ingredientID);
                                                    entity.setName(resultSet.getString("name"));
                                                    entity.setPrice(resultSet.getDouble("price"));
                                                 }).orElseThrow();

        System.out.println("Ingrediente obtenido: "+ingredient1.getName()+", with price: "+ ingredient1.getPrice());
    }
}