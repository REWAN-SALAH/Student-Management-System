package Project2022;
import java.sql.*;
public class Operation {
public static void connection(String oo,String f , String la, int o, String ii,int bb){
            try {
                Connection c = DriverManager.getConnection(
                        "jdbc:mysql://localhost/students?serverTimezone=UTC",
                        "Rewan",
                        "Rewan2002"
                );
                System.out.println("done connection");
                Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet r = s.executeQuery("SELECT `idu`, `FirstName`, `FamilyName`, `StuId`, `StuLevl`, `TotalBalance`, `EachCourseCost` FROM `dbs` WHERE 1");
                r.previous();
                r.moveToInsertRow();
                r.updateString("idu",oo);
                r.updateString("FirstName",f);
                r.updateString("FamilyName",la);
                r.updateString("StuId",ii);
                r.updateInt("StuLevl",o);
                r.updateInt("TotalBalance",bb);
                r.updateInt("EachCourseCost",300);
                r.insertRow();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


