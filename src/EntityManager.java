public interface EntityManager {
    public <T> EntityManager addStatement(T entity,String sql,Statement<T> statement);
    public <T> EntityManager addRangeStatemment(Iterable<T> iterable,String sql, Statement<T> statement);
    void save();
    
}
