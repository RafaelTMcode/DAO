public class EntityManager implements IEntityManager{

    private IConfiguration configuration = null;

    
    public EntityManager(IConfiguration configuration){//esto es un constructor al que le paso conf
        this.configuration = configuration;
    
    }

    public static EntityManager buildConfiguration(Configuration configuration){
        return new EntityManager(configuration);
    }

    @Override
    public <T> IEntityManager addStatement(T entity, String sql, Statement<T> statement) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> IEntityManager addRangeStatemment(Iterable<T> iterable, String sql, Statement<T> statement) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save() {
        // TODO Auto-generated method stub
        
    }


    
}
