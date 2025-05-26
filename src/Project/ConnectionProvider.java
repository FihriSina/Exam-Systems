//MySql bağlantısı için yeni package ve sınıf oluşturuldu.
package Project;

import java.sql.*;

public class ConnectionProvider {

    public static Connection getCon() {
        try {
            Class.forName("");
            Connection con = DriverManager.getConnection("","","");
            return con;
        } catch (Exception e) {
            return null;
        }
    }

}
