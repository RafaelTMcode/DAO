public class App {

    public static void main(String[] args) throws Exception {

    Ingredient ingredient = new Ingredient();
    ingredient.setName("Masa");
    ingredient.setPrice(2.0);

    //Configuration.getConfiguration()

    EntityManagerImp.buildConnection(ConfigurationImp.getConfiguration())
        .addStatement(ingredient, "INSERT INTO ingredient(id, name, price) VALUES(?, ?, ?)", (statement, entity) ->{
            statement.setString(1, "masa");
            statement.setDouble(2, 1.0);
        })
        //.addRangeStatement<Ingredient>(iterable<T>,sql,(statement,T)->{
        //
        //})
        .save();
     
}
}