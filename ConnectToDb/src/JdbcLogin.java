import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import com.mysql.jdbc.Driver;


public class JdbcLogin {
    public String Login;
    public String MotDePasse;
    private boolean Logged = false;

    public void StartBdd() {
        String url = "jdbc:mysql://localhost:3306/breizhibus";
        String user = "root";
        String passwd = "";
        String driver = "com.mysql.jdbc.Driver";

        Connection con = null;
        Statement st = null;
        ResultSet rs= null;

        try {
            con = DriverManager.getConnection(url, user, passwd);
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM arrets");

            while(rs.next()) {
                System.out.println(rs.getString("nom"));
                System.out.println(rs.getString("adresse"));
            }

        } catch(Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }finally {
            try {
                if(rs != null) rs.close();
                if(st != null) st.close();
                if(con != null) con.close();
            } catch (SQLException e) {

            }
        }
    }
}