import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntityManagerImp implements EntityManager{

    private List<Runables> runables = new ArrayList<Runables>();
    private Configuration configuration = null;

    
    public EntityManagerImp(Configuration configuration){
        this.configuration = configuration;
    }

    public static EntityManager buildConnection(Configuration configuration){
        return new EntityManagerImp(configuration);
    }



    @Override
    public <T> EntityManager addStatement(T entity, String sql, Statement<T> statement) {
        Runables runable = new RunablesImp<T>(sql, entity, statement);
        this.runables.add(runable);
        return this;
    }

    @Override
    public <T> EntityManager addRangeStatemment(Iterable<T> iterable, String sql, Statement<T> statement) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save() {
        
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(
                this.configuration.getUrl(),
                this.configuration.getUser(),
                this.configuration.getPassword()
            );
            connection.setAutoCommit(false);

            for(Runables runable : this.runables){
                
                PreparedStatement statement = connection.prepareStatement(runable.getSQL());
                runable.run(statement);
                statement.executeUpdate();
            }
            connection.commit();

        }catch(SQLException e){
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally{

            runables.clear();
            try {
                if(!(connection.isClosed())){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
    }



    
}
