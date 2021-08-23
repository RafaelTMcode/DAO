import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface Resultset<T> {
    public void run(ResultSet statement, T entity) throws SQLException;
}

