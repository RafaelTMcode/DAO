public class App {

    //Configuration.getConfiguration()

    EntityManager.buildConnection(Configuration.getConfiguration())
    .addStatement<Pizza>(T entiy,sql,(statement,T entity)->{
       statement.setInt(entity.id)
             })
            .addRangeStatement<Ingredient>(iterable<T>,sql,(statement,T)->{

     })
    .save();
     
}
