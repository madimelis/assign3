import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    public void addDoctor(String name, String spec) throws Exception {
        Connection c = DB.connect();
        PreparedStatement ps = c.prepareStatement(
                "INSERT INTO doctor(name, specialization) VALUES (?, ?)"
        );
        ps.setString(1, name);
        ps.setString(2, spec);
        ps.executeUpdate();
    }
}
