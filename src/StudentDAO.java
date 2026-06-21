import java.sql.*;

public class StudentDAO {

    Connection con;

    public StudentDAO() throws SQLException {
        con = DBConnection.getConnection();
    }
    public void addStudent(Student s)
            throws SQLException {

        String sql =
                "insert into student values(?,?,?,?,?,?)";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, s.getStudentId());
        ps.setString(2, s.getName());
        ps.setString(3, s.getBranch());
        ps.setInt(4, s.getYear());
        ps.setString(5, s.getEmail());
        ps.setDouble(6, s.getCgpa());

        int rows = ps.executeUpdate();

        if(rows > 0)
            System.out.println("Student Added");
    }
    public void viewStudents()
            throws SQLException {

        String sql = "select * from student";

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(sql);

        while(rs.next()) {

            System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getString(3) + " " +
                    rs.getInt(4) + " " +
                    rs.getString(5) + " " +
                    rs.getDouble(6)
            );
        }
    }
    public void searchById(int id)
            throws SQLException {

        String sql =
                "select * from student where student_id=?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {

            System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getString(3) + " " +
                    rs.getInt(4) + " " +
                    rs.getString(5) + " " +
                    rs.getDouble(6)
            );
        }
        else {
            System.out.println("Student Not Found");
        }
    }
    public void searchByName(String name)
            throws SQLException {

        String sql =
                "select * from student where name=?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, name);

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {

            System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getString(3) + " " +
                    rs.getInt(4) + " " +
                    rs.getString(5) + " " +
                    rs.getDouble(6)
            );
        }
    }
    public void updateStudent(int id,
            String email,
            double cgpa)
throws SQLException {

String sql =
"update student set email=?, cgpa=? where student_id=?";

PreparedStatement ps =
con.prepareStatement(sql);

ps.setString(1, email);
ps.setDouble(2, cgpa);
ps.setInt(3, id);

int rows = ps.executeUpdate();

if(rows > 0)
System.out.println("Updated");
else
System.out.println("Student Not Found");
}
    public void deleteStudent(int id)
            throws SQLException {

        String sql =
                "delete from student where student_id=?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, id);

        int rows = ps.executeUpdate();

        if(rows > 0)
            System.out.println("Deleted");
        else
            System.out.println("Student Not Found");
    }
    public void topStudents()
            throws SQLException {

        String sql =
                "select * from student order by cgpa desc limit 5";

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(sql);

        while(rs.next()) {

            System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getDouble(6)
            );
        }
    }
    public void branchReport(String branch)
            throws SQLException {

        String sql =
                "select * from student where branch=?";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setString(1, branch);

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {

            System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2) + " " +
                    rs.getDouble(6)
            );
        }
    }
}
