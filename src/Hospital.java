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

    public List<Doctor> getDoctors() throws Exception {
        Connection c = DB.connect();
        ResultSet rs = c.createStatement().executeQuery("SELECT * FROM doctor");

        List<Doctor> list = new ArrayList<>();
        while (rs.next()) {
            list.add(new Doctor(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("specialization")
            ));
        }
        return list;
    }
}
