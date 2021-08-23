public class App {

    public static void main(String[] args) throws Exception {

    Ingredient ingredient = new Ingredient();


    EntityManagerImp.buildConnection(ConfigurationImp.getConfiguration())
        //.addStatement(ingredient, "INSERT INTO ingredient(id, name, price) VALUES(?, ?, ?)", (statement, entity) ->{
        //    statement.setInt(1, 4444);
        //    statement.setString(2, "masa");
        //    statement.setDouble(3, 1.0);
        //})
        //.addRangeStatement<Ingredient>(iterable<T>,sql,(statement,T)->{
        //
        //})
        //.save();
        .select(Ingredient.class, Resultset <T>);
    }
}