public class EntityManagerImp implements EntityManager{

    private Configuration configuration = null;

    
    public EntityManagerImp(Configuration configuration){
        this.configuration = configuration;
    }

    public static EntityManager buildConnection(Configuration configuration){
        return new EntityManagerImp(configuration);
    }



    @Override
    public <T> EntityManager addStatement(T entity, String sql, Statement<T> statement) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> EntityManager addRangeStatemment(Iterable<T> iterable, String sql, Statement<T> statement) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save() {
        // TODO Auto-generated method stub
        
    }



    
}
