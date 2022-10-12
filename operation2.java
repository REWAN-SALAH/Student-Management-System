package Project2022;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class operation2 {
    public static void connection(){
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://localhost/students?serverTimezone=UTC",
                    "abdel",
                    "12345aaaaa"
            );
            System.out.println("done connection 2");
            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet r = s.executeQuery("SELECT `idu`, `FirstName`, `FamilyName`, `StuId`, `StuLevl`, `TotalBalance`, `EachCourseCost` FROM `dbs` WHERE 1");
            ResultSetMetaData rm = r.getMetaData();
            r.next();
                for (int i=1; i<=rm.getColumnCount(); i++){
                    System.out.printf(
                            "%-15s ", rm.getColumnName(i)
                    );
                }
                System.out.println("\n");
                r.last();
                    System.out.printf(
                            "%-15s %-15s %-15s %-15s %-15s %-15s %-15s%n",
                            r.getString("idu"),
                            r.getString("FirstName"),
                            r.getString("FamilyName"),
                            r.getString("StuId"),
                            r.getInt("StuLevl"),
                            r.getInt("TotalBalance"),
                            r.getInt("EachCourseCost")
                    );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
