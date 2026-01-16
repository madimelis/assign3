import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static Connection connect() throws Exception {
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/HospitalManagement",
                "postgres",
                "zeebrugge1"
        );
    }
}
