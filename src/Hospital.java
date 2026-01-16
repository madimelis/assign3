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

    public void addPatient(String name, int age, int doctorId) throws Exception {
        Connection c = DB.connect();
        PreparedStatement ps = c.prepareStatement(
                "INSERT INTO patient(name, age, doctor_id) VALUES (?, ?, ?)"
        );
        ps.setString(1, name);
        ps.setInt(2, age);
        ps.setInt(3, doctorId);
        ps.executeUpdate();
    }

    public List<Patient> getPatients() throws Exception {
        Connection c = DB.connect();
        ResultSet rs = c.createStatement().executeQuery("SELECT * FROM patient");

        List<Patient> list = new ArrayList<>();
        while (rs.next()) {
            list.add(new Patient(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getInt("doctor_id")
            ));
        }
        return list;
    }

    public void deletePatient(int id) throws Exception {
        Connection c = DB.connect();
        PreparedStatement ps = c.prepareStatement(
                "DELETE FROM patient WHERE id=?"
        );
        ps.setInt(1, id);
        ps.executeUpdate();
    }
}
