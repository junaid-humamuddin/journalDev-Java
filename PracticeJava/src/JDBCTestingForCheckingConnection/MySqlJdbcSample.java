package JDBCTestingForCheckingConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlJdbcSample {

	public static void main(String args[]) throws ClassNotFoundException {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		try (Connection connection = DriverManager.getConnection(
				"jdbc:sqlserver://edb-devfams-it-mssql.database.windows.net:1433;DatabaseName=af_edbdevfams;encrypt=true;trustServerCertificate=false;hostNameInCertificate=eastus2-a.control.database.windows.net",
				"edbdevfams", "Comss#rqwthY12345");
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery("select * from tb_user_details")) {

			while (rs.next()) {
				System.out.println("First Name: " + rs.getString("first_name"));
				System.out.println("Middle Name: " + rs.getString("last_name"));
				System.out.println("CRX ID: " + rs.getString("crx_user_oid"));
				System.out.println("================================================");
			}
		} catch (SQLException | NullPointerException e) {
			// ServiceUtil.logMessage(log, Arrays.toString(e.getStackTrace()),
			// ServiceUtil.LOG_LEVEL_ERROR);
			System.out.println(e);
		}

	}
}
