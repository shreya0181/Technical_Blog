package TechnicalBlog.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class userDAO {
    public static void main(String args[]) {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/technicalblog";
            String uname = "postgres";
            String pwd = "shrey";

            Connection con = DriverManager.getConnection(url, uname, pwd);

            Statement stmt = con.createStatement();

            String q = "select * from user";

            ResultSet rs = stmt.executeQuery(q);
            String name = null;
            while (rs.next()) {


                System.out.println(rs.getString(1) + " : " + rs.getString(2));
            }
        } catch (Exception e) {
            System.out.print(e);

        }
    }
}
